package code.perturbation;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import code.analysis.ClassAnalysis;
import code.analysis.ConditionAnalysis;
import code.analysis.MethodSignature;
import code.analysis.StatementAnalysis;
import code.analysis.Variables;
import code.perturbation.buglab.BugLabPerturb;
import code.perturbation.selfAPR.P11_Transplant_Statement;
import code.perturbation.selfAPR.P12_Transplant_Condition;
import code.perturbation.selfAPR.Remove;
import code.perturbation.selfAPR.RemoveTry;
import code.perturbation.selfAPR.Replace;
import code.perturbation.selfAPR.Transplant;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCatch;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.cu.position.NoSourcePosition;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtAssignmentImpl;
import spoon.support.reflect.code.CtBlockImpl;
import spoon.support.reflect.code.CtCatchImpl;
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
import spoon.support.reflect.declaration.CtFieldImpl;

public class PerturbActions {

	public static void randomPerturb(CtElement st, StatementType type, int methStart, int methEnd, String choice) {
		try {
			String stStr = st.toString().replace("\r", " ").replace("\n", " ");
			System.out.println(" ==== type =====" + type + "===== st: ====" + stStr);

			Object o = st.getPosition();

			if (o instanceof NoSourcePosition) {
				return;
			}
			
			if ("SelfAPR".contains(choice)) {
				Replace.replace(st, type, methStart, methEnd);
				Remove.remove(st, type, methStart, methEnd);
				Transplant.insert(st, type, methStart, methEnd);
			} else if  ("BugLab".contains(choice)) {
				BugLabPerturb.perturb(st, type, methStart, methEnd);
			} 
			else if (choice.contains("test")) {
				String buggyline=choice.split("-")[1];
				int bugint = Integer.parseInt(buggyline);
				if(Math.abs(bugint -  st.getPosition().getLine())<3) {
					String classinfo = ClassAnalysis.getCurrentClass();
					String method = MethodSignature.getCurrentMethod();
					String variables = Variables.getVariableInfo();
					
					String meta = classinfo+" "+method+" [VARIABLES] "+variables;
					
					meta += " startline:" + methStart;
					meta += " endline:" + methEnd;

					System.out.print(meta);
					System.exit(0);
				}
			}
			
			

		} catch (Exception e) {
			System.out.println("=============exception=========" + e.getLocalizedMessage());
		}
	}

	/**
	 * This is where we start to perturb the code!
	 * 
	 * @param fieldList
	 * @param constructorList
	 * @param methodList
	 */
	public static void perturb(List<CtFieldImpl> fieldList, List<CtConstructor> constructorList,
			List<CtMethod> methodList, String choice) {
		fieldPerturb(fieldList,choice);
		constructorPerturb(constructorList,choice);
		methodPerturb(methodList,choice);

	}

	private static void methodPerturb(List<CtMethod> methodList,String choice) {
		for (CtMethod method : methodList) {
			List<CtVariable> variablesList = method.getElements(new TypeFilter<CtVariable>(CtVariable.class));
			Variables.getVariables(variablesList);
			StatementAnalysis.analysis(method);
			MethodSignature.currentMethod(method);
			ConditionAnalysis.currentConditions(method);

			SourcePosition position = method.getPosition();
			int methStart = position.getLine();
			int methEnd = position.getEndLine();

			CtBlock block = method.getBody();
			if (block != null) {
				List<CtStatement> statements = block.getStatements();
				for (CtStatement st : statements) {
					processStatement(st, methStart, methEnd,choice);
				}

			}
		}
	}

	private static void processStatement(CtStatement st, int methStart, int methEnd,String choice) {

		if (methEnd - methStart > 25) {
			int pos = st.getPosition().getLine();
			int blockStart = st.getParent().getPosition().getLine();
			int endStart = st.getParent().getPosition().getEndLine();

			if (blockStart < pos && endStart > pos && endStart - blockStart < methEnd - methStart) {
				methStart = blockStart;
				methEnd = endStart;
			}

		}
		List<CtAssignmentImpl> assignments = st.getElements(new TypeFilter<CtAssignmentImpl>(CtAssignmentImpl.class));
		List<CtReturnImpl> returns = st.getElements(new TypeFilter<CtReturnImpl>(CtReturnImpl.class));

		List<CtConstructorCallImpl> constructorCall = st
				.getElements(new TypeFilter<CtConstructorCallImpl>(CtConstructorCallImpl.class));

		List<CtLocalVariableImpl> localVariableImpl = st
				.getElements(new TypeFilter<CtLocalVariableImpl>(CtLocalVariableImpl.class));

		List<CtCatchImpl> catchs = st.getElements(new TypeFilter<CtCatchImpl>(CtCatchImpl.class));

		List<CtThrowImpl> throwss = st.getElements(new TypeFilter<CtThrowImpl>(CtThrowImpl.class));

		List<CtIfImpl> conditions = st.getElements(new TypeFilter<CtIfImpl>(CtIfImpl.class));

		List<CtInvocationImpl> invocations = st.getElements(new TypeFilter<CtInvocationImpl>(CtInvocationImpl.class));
		List<CtTryImpl> trys = st.getElements(new TypeFilter<CtTryImpl>(CtTryImpl.class));
		List<CtForImpl> fors = st.getElements(new TypeFilter<CtForImpl>(CtForImpl.class));
		List<CtWhileImpl> whiles = st.getElements(new TypeFilter<CtWhileImpl>(CtWhileImpl.class));

		if (whiles.size() > 0) {
			System.out.println();
			for (CtWhileImpl w : whiles) {
				PerturbActions.randomPerturb(w, StatementType.Whiles, methStart, methEnd,choice);
				CtStatement s = w.getBody();
				if (s != null) {
					processStatement(s, methStart, methEnd,choice);
				}

			}
		}

		if (conditions.size() > 0) {
			for (CtIfImpl cond : conditions) {
				PerturbActions.randomPerturb(cond, StatementType.Condition, methStart, methEnd,choice);
				CtStatement elseStatement = cond.getElseStatement();
				CtStatement thenStatement = cond.getThenStatement();
				if (elseStatement != null) {
					processStatement(elseStatement, methStart, methEnd,choice);
				}
				if (thenStatement != null) {
					processStatement(thenStatement, methStart, methEnd,choice);
				}
			}
		}

		if (fors.size() > 0) {
			for (CtForImpl foreach : fors) {

				PerturbActions.randomPerturb(foreach, StatementType.For, methStart, methEnd,choice);

				CtStatement forbody = foreach.getBody();

				if (forbody != null) {
					System.out.println();
					processStatement(forbody, methStart, methEnd,choice);
				}

			}
		}

		if (trys.size() > 0) {
			for (CtTryImpl t : trys) {
				PerturbActions.randomPerturb(t, StatementType.Try, methStart, methEnd,choice);
				List<CtCatch> catchers = t.getCatchers();
				CtBlock<?> b = t.getBody();
				processStatement(b, methStart, methEnd,choice);
			}
		}

		if (assignments.size() > 0) {
			for (CtAssignmentImpl a : assignments) {
				PerturbActions.randomPerturb(a, StatementType.Assignment, methStart, methEnd,choice);
			}
		}

		if (returns.size() > 0) {
			for (CtReturnImpl r : returns) {
				PerturbActions.randomPerturb(r, StatementType.Return, methStart, methEnd,choice);
			}
		}

		if (constructorCall.size() > 0) {
			for (CtConstructorCallImpl c : constructorCall) {
				PerturbActions.randomPerturb(c, StatementType.Constructor, methStart, methEnd,choice);
			}
		}

		if (localVariableImpl.size() > 0) {
			for (CtLocalVariableImpl l : localVariableImpl) {
				PerturbActions.randomPerturb(l, StatementType.LocalVariable, methStart, methEnd,choice);
			}
		}

		if (throwss.size() > 0) {
			for (CtThrowImpl t : throwss) {
				PerturbActions.randomPerturb(t, StatementType.Throw, methStart, methEnd,choice);
			}
		}

		if (catchs.size() > 0) {
			for (CtCatchImpl c : catchs) {
				PerturbActions.randomPerturb(c, StatementType.Catch, methStart, methEnd,choice);
			}
		}

		if (invocations.size() > 0) {
			for (CtInvocationImpl i : invocations) {
				PerturbActions.randomPerturb(i, StatementType.Statement, methStart, methEnd,choice);
			}
		}

	}

	public static void fieldPerturb(List<CtFieldImpl> fieldList,String choice) {
		for (CtFieldImpl variable : fieldList) {
			int start = variable.getPosition().getLine();
			int end = variable.getPosition().getEndLine();
			PerturbActions.randomPerturb(variable, StatementType.Declaration, start, end,choice);
		}
	}

	public static void constructorPerturb(List<CtConstructor> constructors,String choice) {
		for (CtConstructor cons : constructors) {

			List<CtVariable> variablesList = cons.getElements(new TypeFilter<CtVariable>(CtVariable.class));
			Variables.getVariables(variablesList);
			StatementAnalysis.analysis(cons);
			MethodSignature.currentMethod(cons);

			SourcePosition position = cons.getPosition();
			int methStart = position.getLine();
			int methEnd = position.getEndLine();

			CtBlock block = cons.getBody();
			if (block != null) {
				List<CtStatement> statements = block.getStatements();
				for (CtStatement st : statements) {

					processStatement(st, methStart, methEnd,choice);

				}

			}
		}
	}

}
