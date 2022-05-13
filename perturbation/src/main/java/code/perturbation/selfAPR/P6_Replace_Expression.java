package code.perturbation.selfAPR;

import java.util.ArrayList;
import java.util.List;

import code.analysis.ConditionAnalysis;
import code.output.result.PerturbResult;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.VariablePerturbation;
import code.perturbation.utils.OperatorUtil;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;
import spoon.support.reflect.code.CtIfImpl;

public class P6_Replace_Expression {
	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5) {

		/**
		 * P6 Expression Perturbation
		 */

		String actionNo = "[P6_Replace_Expression]";
		List<String> perturbCodeList = new ArrayList<String>();

		// condition
		if (type == StatementType.Condition) {

			/**
			 * 
			 * split condition with && and ||
			 */
			if (groundTruth.contains("||") || groundTruth.contains("&&")) {

				String sepStr = "";
				if (groundTruth.contains("||")) {
					sepStr = "||";
				} else if (groundTruth.contains("&&")) {
					sepStr = "&&";
				}

				// left
				int sep = groundTruth.indexOf(sepStr);
				String left = (String) groundTruth.subSequence(0, sep) + ")";

				// right
				String right = (String) groundTruth.subSequence(sep + 2, groundTruth.length());

				// begin
				int sep2 = left.indexOf("(");
				String begin = left.substring(0, sep2) + "(";

				// end
				int sepblock = right.indexOf("{");
				int rightlen = right.length();
				if (sepblock > -1 && rightlen > -1) {
					String end = right.substring(sepblock, rightlen);

					// remove right
					String perturbCode = left + " " + end;
					perturbCodeList.add(perturbCode);
					// remove left
					perturbCode = begin + " " + right;
					perturbCodeList.add(perturbCode);

				}
			} else {

				// add additional conditions
				CtExpression<Boolean> booleanExpression = (CtExpression<Boolean>) ((CtIfImpl) st).getCondition();
				String newCond = ConditionAnalysis.getConditions(booleanExpression.toString(), 0.6);
				if (newCond != null) {

					String operator = SelfAPRUtil.getRandomDouble() > 0.5 ? " && " : " || ";
						//case 1
						int index = groundTruth.indexOf(")");
						String before = groundTruth.substring(0, index);
						String after = groundTruth.substring(index, groundTruth.length());
						String extbracket = "";
						if (before.contains("(") && before.split("\\(").length > 2) {
							extbracket = " ) ";
						}

						String perturbCode = before + extbracket + operator + newCond + " " + after;
						perturbCodeList.add(perturbCode);

						//case 2
						 index = groundTruth.indexOf("(");
						 before = groundTruth.substring(0, index + 1);
						 after = groundTruth.substring(index, groundTruth.length());
						 perturbCode = before + " " + newCond + operator + after;
						perturbCodeList.add(perturbCode);

				

				}
			}
		} else if (groundTruth.contains("?")) {
			
			if (groundTruth.contains("==") && groundTruth.contains(":")) {
			//  a == b ? c : d;
				int eq = groundTruth.indexOf("==");
				String begin = groundTruth.substring(0,eq);
				int sep =  begin.contains("(")? begin.lastIndexOf("(") :begin.length() ;
				begin = begin.substring(0,sep) + "(";
				String end = groundTruth.split("\\:")[1];
				String perturbCode = begin  + end;
				perturbCodeList.add(perturbCode);
			}
			
			else if (groundTruth.contains("=") && groundTruth.contains(":")) {
				//  a = b ? c : d;

				int eq = groundTruth.indexOf("=");
				String tmp = groundTruth.charAt(eq + 1) + "";
				if (!"=".equals(tmp)) {

					// after : a = e;
					String start = groundTruth.split("\\=")[0];
					String end = groundTruth.split("\\:")[1];
					String perturbCode = start + " = " + end;
					perturbCodeList.add(perturbCode);

					// a = d;
					end = groundTruth.split("\\?")[1];
					if (end.contains(":")) {
						end = end.split("\\:")[0];
						perturbCode = start + " = " + end + ";";
						perturbCodeList.add(perturbCode);
					}

				} else {

					String start = groundTruth.split(" ")[0];
					String end = groundTruth.split("\\:")[1];
					String perturbCode = start + end;
					perturbCodeList.add(perturbCode);
					// another case
					end = groundTruth.split("\\?")[1];
					if (end.contains(":")) {
						end = end.split("\\:")[0];
						perturbCode = start + "  " + end + ";";
						perturbCodeList.add(perturbCode);

					}
				}
			}
		}

		// try all different expressions

		// CtBinaryOperatorImpl expression
		if (type == StatementType.Condition) {

			List<CtBinaryOperatorImpl> expressions = st
					.getElements(new TypeFilter<CtBinaryOperatorImpl>(CtBinaryOperatorImpl.class));
			// begin
			int sep = groundTruth.indexOf("(");
			String begin = groundTruth.substring(0, sep) + "( ";
			int sep2 = groundTruth.lastIndexOf(")");
			String end = groundTruth.substring(sep2, groundTruth.length());

			if (expressions.size() > 1) {

				for (int i=1;i<expressions.size();i++) {
					CtBinaryOperatorImpl expression=expressions.get(i);
					String simplefyExpression = SelfAPRUtil.simplefyExpression(expression);

					String perturbCode = begin + simplefyExpression + end;
					perturbCodeList.add(perturbCode);

				}

			}
		}

		
	//else if -> else
	if (groundTruth.contains("else") && groundTruth.contains("if")) {
		groundTruth = groundTruth.trim();
		if(groundTruth.startsWith("}") && groundTruth.endsWith("{")) {
			perturbCodeList.add(" } else {");
		}
	}
		
		if (perturbCodeList != null) {
			for (String perturbCode : perturbCodeList) {
				if (!groundTruth.equals(perturbCode) && perturbCode != null) {
					PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "",
							lineNo2, lineNo3, lineNo4, lineNo5, groundTruth);
				}
			}

		}
	}
}
