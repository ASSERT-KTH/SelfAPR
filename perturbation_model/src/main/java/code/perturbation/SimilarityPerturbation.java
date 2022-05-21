package code.perturbation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import code.analysis.Variables;
import code.perturbation.utils.EditDistance;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCatch;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtAssignmentImpl;
import spoon.support.reflect.code.CtConstructorCallImpl;
import spoon.support.reflect.code.CtForEachImpl;
import spoon.support.reflect.code.CtForImpl;
import spoon.support.reflect.code.CtIfImpl;
import spoon.support.reflect.code.CtInvocationImpl;
import spoon.support.reflect.code.CtLocalVariableImpl;
import spoon.support.reflect.code.CtReturnImpl;
import spoon.support.reflect.code.CtThrowImpl;
import spoon.support.reflect.code.CtTryImpl;
import spoon.support.reflect.code.CtWhileImpl;

public class SimilarityPerturbation {

	static HashSet<String> _statementList = new HashSet<String>();
	static HashSet<String> _returnList = new HashSet<String>();
	static HashSet<String> _conditionList = new HashSet<String>();
	static HashSet<String> _assignmentList = new HashSet<String>();
	static HashSet<String> _constructorCallList = new HashSet<String>();
	static HashSet<String> _localVariableImpllList = new HashSet<String>();
	static HashSet<String> _throwsList = new HashSet<String>();
	static HashSet<String> _tryList = new HashSet<String>();
	static HashSet<String> _conditionHeadList = new HashSet<String>();
	static HashSet<String> _forHeadList = new HashSet<String>();

	public static List<String> perturb(CtElement st, String groundTruth, StatementType type, Double similarity, String withoutStr) {

		List<String> simStmList = new ArrayList();
		Set<String> simStmSet = new HashSet();

		
		
		
		HashSet<String> targetList = null;

		if (similarity == null) {
			similarity = 0.7;
		}

		if (type == StatementType.Return && groundTruth.contains("return")) {
			targetList = _returnList;
		} else if (type == StatementType.ConditionHead) {
			targetList = _conditionHeadList;
		} else if (type == StatementType.For) {
			targetList = _forHeadList;
		} else if (type == StatementType.Condition && (groundTruth.contains("if") || groundTruth.contains("else"))) {
			targetList = _conditionList;
		} else if (type ==StatementType.Statement && !groundTruth.contains("if") && !groundTruth.contains("return")) {
			targetList = _statementList;
		} else if (type ==StatementType.Assignment) {
			targetList = _assignmentList;
		} else if (type ==StatementType.Constructor) {
			targetList = _constructorCallList;
		} else if (type ==StatementType.LocalVariable) {
			targetList = _localVariableImpllList;
		} else if (type ==StatementType.Throw) {
			targetList = _throwsList;
		}

		if (targetList == null || targetList.size() == 0) {
			return null;
		}

		System.out.println("=========" + targetList.size() + "===============");

		// get the most similar statement
		String target = st.toString();
		if (type ==StatementType.ConditionHead || type ==StatementType.LocalVariable || type ==StatementType.Assignment
				|| type ==StatementType.Statement || type ==StatementType.For || type ==StatementType.Return || type ==StatementType.Throw) {
			target = groundTruth;
		}

		String targetTrim = target.replace(" ", "");
		for (String s : targetList) {
			String strim = s.replace(" ", "");
			if (!target.equals(s) && !strim.equals(targetTrim)) {
				if (withoutStr != null) {
					String cond = s.split("\\{")[0];
					if (cond.contains(withoutStr)) {
						break;
					}
				}
				double score = EditDistance.similarity(s, target);
				if (score > similarity) {
					simStmList.add(s);
				}			
			}
		}


		
		for(String simStatement: simStmList) {
			
		if (simStatement != null) {

			if (type ==StatementType.ConditionHead || type ==StatementType.LocalVariable || type ==StatementType.Assignment
					|| type ==StatementType.Statement || type ==StatementType.For || type ==StatementType.Return || type ==StatementType.Throw) {

				simStatement = simStatement.replace("\r", "").replace("\n", "");
				simStmSet.add(simStatement);

			} else {
				String simpleSimStatement = "";
				simStatement = simStatement.replace("(", " ( ").replace(")", " ) ");
				String[] strs = simStatement.split(" ");
				if (simStatement.contains("catch")) {
					System.out.println("");
				}
				for (String s : strs) {
					if (s.contains(".")) {
						String[] dotSize = s.split("\\.");
						if (dotSize.length > 2) {
							s = s.substring(s.lastIndexOf(".") + 1);
							simpleSimStatement += s + " ";
						} else {
							simpleSimStatement += s + " ";
						}
					} else {
						simpleSimStatement += s + " ";
					}
				}

				simpleSimStatement = simpleSimStatement.replace("\r", " ");
				simpleSimStatement = simpleSimStatement.replace("\n", " ");
				simStmSet.add(simpleSimStatement);
			}
		} 
		}
		return  new ArrayList<>(simStmSet);

	}



	public static void analysis(CtElement root) {
		_statementList = new HashSet<String>();
		_returnList = new HashSet<String>();
		_conditionList = new HashSet<String>();
		_assignmentList = new HashSet<String>();
		_constructorCallList = new HashSet<String>();
		_localVariableImpllList = new HashSet<String>();
		_throwsList = new HashSet<String>();
		_tryList = new HashSet<String>();
		_conditionHeadList = new HashSet<String>();
		_forHeadList = new HashSet<String>();


		List<CtConstructor> constructorList = root.getElements(new TypeFilter<CtConstructor>(CtConstructor.class));

		for (CtConstructor constructor : constructorList) {
			CtBlock block = constructor.getBody();
			if (block != null) {
				List<CtStatement> statements = block.getStatements();
				for (CtStatement sts : statements) {
					List<CtStatement> states = sts.getElements(new TypeFilter<CtStatement>(CtStatement.class));
					for (CtStatement st : states) {
						statementProcess(st);
					}
				}
			}
		}

		List<CtMethod> methodList = root.getElements(new TypeFilter<CtMethod>(CtMethod.class));

		for (CtMethod method : methodList) {
			CtBlock block = method.getBody();
			if (block != null) {
				List<CtStatement> statements = block.getStatements();
				for (CtStatement sts : statements) {
					List<CtStatement> states = sts.getElements(new TypeFilter<CtStatement>(CtStatement.class));

					for (CtStatement st : states) {
						try {
							statementProcess(st);
						} catch (Exception e) {
							System.out.println("=============exception=========" + e.getLocalizedMessage());
						}
					}
				}
			}
		}

	}

	private static void statementProcess(CtStatement st) {
		List<CtTryImpl> trys = st.getElements(new TypeFilter<CtTryImpl>(CtTryImpl.class));

		List<CtIfImpl> conditions = st.getElements(new TypeFilter<CtIfImpl>(CtIfImpl.class));

		List<CtInvocationImpl> invocations = st.getElements(new TypeFilter<CtInvocationImpl>(CtInvocationImpl.class));

		List<CtReturnImpl> returns = st.getElements(new TypeFilter<CtReturnImpl>(CtReturnImpl.class));
		List<CtAssignmentImpl> assignments = st.getElements(new TypeFilter<CtAssignmentImpl>(CtAssignmentImpl.class));

		List<CtConstructorCallImpl> constructorCall = st
				.getElements(new TypeFilter<CtConstructorCallImpl>(CtConstructorCallImpl.class));

		List<CtLocalVariableImpl> localVariableImpl = st
				.getElements(new TypeFilter<CtLocalVariableImpl>(CtLocalVariableImpl.class));

		List<CtThrowImpl> throwss = st.getElements(new TypeFilter<CtThrowImpl>(CtThrowImpl.class));
		List<CtForImpl> fors = st.getElements(new TypeFilter<CtForImpl>(CtForImpl.class));
		List<CtWhileImpl> whiles = st.getElements(new TypeFilter<CtWhileImpl>(CtWhileImpl.class));

		if (conditions.size() > 0) {

			for (CtIfImpl c : conditions) {
				CtStatement elsestate = c.getElseStatement();
				CtStatement thenstate = c.getThenStatement();

				if (c != null) {
					_conditionList.add(c.toString());
					String line1 = SelfAPRUtil.getSpecificLine(c.getPosition(), c.getPosition().getLine());
					if (line1 != null) {
						line1 = line1.trim();
						String lastChar = line1.charAt(line1.length() - 1) + "";
						if (!"{".equals(lastChar)) {
							String line2 = SelfAPRUtil.getSpecificLine(st.getPosition(), c.getPosition().getLine() + 1);
							if (line2 != null) {
								line1 += " " + line2.trim();

							}
						}
						_conditionHeadList.add(line1);
					}
				}

				if (elsestate != null) {
					statementProcess(elsestate);
				}

				if (thenstate != null) {
					statementProcess(thenstate);
				}

			}
		}

		if (trys.size() > 0) {
			for (CtTryImpl t : trys) {
				List<CtCatch> catchers = t.getCatchers();
				CtBlock<?> b = t.getBody();
				statementProcess(b);
			}
		}

		if (fors.size() > 0) {
			for (CtForImpl f : fors) {
				String line1 = SelfAPRUtil.getSpecificLine(f.getPosition(), f.getPosition().getLine());
				if (line1 != null) {
					line1 = line1.trim();
					String lastChar = line1.charAt(line1.length() - 1) + "";
					if (!"{".equals(lastChar)) {
						String line2 = SelfAPRUtil.getSpecificLine(st.getPosition(), f.getPosition().getLine() + 1);
						if (line2 != null) {
							line1 += " " + line2.trim();
						}
					}
					_forHeadList.add(line1);

					CtStatement forbody = f.getBody();

					if (forbody != null) {
						statementProcess(forbody);
					}

				}
			}
		}

		if (returns.size() > 0) {
			for (CtReturnImpl r : returns) {

				String line1 = SelfAPRUtil.getSpecificLine(r.getPosition(), r.getPosition().getLine());
				if (line1 != null) {

					line1 = line1.trim();
					String lastChar = line1.charAt(line1.length() - 1) + "";

					if (!";".equals(lastChar)) {
						line1 += " "
								+ SelfAPRUtil.getSpecificLine(st.getPosition(), r.getPosition().getLine() + 1).trim();
					}
					_returnList.add(line1);
				}

			}
		}

		if (assignments.size() > 0) {
			for (CtAssignmentImpl a : assignments) {
				String line1 = SelfAPRUtil.getSpecificLine(a.getPosition(), a.getPosition().getLine());
				if (line1 != null) {

					line1 = line1.trim();
					String lastChar = line1.charAt(line1.length() - 1) + "";

					if (!";".equals(lastChar)) {
						String line2 = SelfAPRUtil.getSpecificLine(st.getPosition(), a.getPosition().getLine() + 1);
						if (line2 != null) {
							line1 += " " + line2.trim();
						}
					}

					_assignmentList.add(line1);
				}
			}
		}

		if (constructorCall.size() > 0) {
			for (CtConstructorCallImpl c : constructorCall) {
				_constructorCallList.add(c.toString());
			}
		}

		if (throwss.size() > 0) {
			for (CtThrowImpl t : throwss) {
				String line1 = SelfAPRUtil.getSpecificLine(t.getPosition(), t.getPosition().getLine());
				if (line1 != null) {

					line1 = line1.trim();
					String lastChar = line1.charAt(line1.length() - 1) + "";

					if (!";".equals(lastChar)) {
						String line2 = SelfAPRUtil.getSpecificLine(st.getPosition(), t.getPosition().getLine() + 1);
						if (line2 != null) {
							line1 += " " + line2.trim();
						}
					}
					_throwsList.add(line1);
				}
			}
		}

		if (localVariableImpl.size() > 0) {
			for (CtLocalVariableImpl l : localVariableImpl) {

				String line1 = SelfAPRUtil.getSpecificLine(l.getPosition(), l.getPosition().getLine());
				if (line1 != null) {

					line1 = line1.trim();
					String lastChar = line1.charAt(line1.length() - 1) + "";

					if (!";".equals(lastChar)) {
						String line2 = SelfAPRUtil.getSpecificLine(st.getPosition(), l.getPosition().getLine() + 1);
						if (line2 != null) {
							line1 += " " + line2.trim();
						}
					}
					_localVariableImpllList.add(line1);
				}
			}
		}

		if (invocations.size() > 0 && localVariableImpl.size() == 0 && constructorCall.size() == 0
				&& returns.size() == 0 && assignments.size() == 0 && trys.size() == 0 && fors.size() == 0
				&& conditions.size() == 0 && whiles.size() == 0) {
			for (CtInvocationImpl i : invocations) {
				String line1 = SelfAPRUtil.getSpecificLine(i.getPosition(), i.getPosition().getLine());
				if (line1 != null) {
					line1 = line1.trim();
					String lastChar = line1.charAt(line1.length() - 1) + "";

					if (!";".equals(lastChar)) {
						String line2 = SelfAPRUtil.getSpecificLine(st.getPosition(), i.getPosition().getLine() + 1);
						if (line2 != null) {
							line1 += " " + line2.trim();
						}
					}
					_statementList.add(line1);
				}
			}
		}
	}

}
