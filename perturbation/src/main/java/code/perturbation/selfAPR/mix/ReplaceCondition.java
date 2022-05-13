package code.perturbation.selfAPR.mix;

import java.util.HashMap;
import java.util.List;

import code.analysis.ConditionAnalysis;
import code.output.result.PerturbResult;
import code.perturbation.ConstructorPerturbation;
import code.perturbation.InvocationPerturbation;
import code.perturbation.LiteralPerturbation;
import code.perturbation.ModifiersPerturbation;
import code.perturbation.OperatorPerturbation_bak;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.TypePerturbation;
import code.perturbation.VariablePerturbation;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.Filter;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;
import spoon.support.reflect.code.CtIfImpl;

public class ReplaceCondition {

	public static void perturb(CtElement st, int methStart, int methEnd, String groundTruth, int lineNo1,
			String lineNo2, String lineNo3, String lineNo4, String lineNo5, double prob,String actionNo) {
		String originGroundTruth = groundTruth;
		String perturbCode = null;
		
		
		

		/**
		 * Literal
		 */
		if (perturbCode == null) {
			perturbCode = LiteralPerturbation.perturb(st, groundTruth);
		} else if (SelfAPRUtil.getRandomDouble() > prob) {
			String newperturbCode = LiteralPerturbation.perturb(st, perturbCode);
			if (newperturbCode != null) {
				perturbCode = newperturbCode;
			}
		}

		/**
		 * Variables
		 */
		if (perturbCode == null) {
			List<String> l = VariablePerturbation.perturb(st, groundTruth, 1);
			if(l!=null && l.size()>0) {
			perturbCode = l.get(SelfAPRUtil.getRandomInt(l.size()));
			}
		} else if (SelfAPRUtil.getRandomDouble() > prob) {

			List<String> l = VariablePerturbation.perturb(st, perturbCode, 1);
			if(l!=null && l.size()>0) {
			String newperturbCode = l.get(SelfAPRUtil.getRandomInt(l.size()));
			
			if (newperturbCode != null) {
				perturbCode = newperturbCode;
			}
			}
		}

		/**
		 * Invocation
		 */
		if (perturbCode == null) {

			List<String> l = InvocationPerturbation.perturb(st, groundTruth);
			if(l!=null && l.size()>0) {
			perturbCode = l.get(SelfAPRUtil.getRandomInt(l.size()));
			}

		} else if (SelfAPRUtil.getRandomDouble() > prob) {
			List<String> l = InvocationPerturbation.perturb(st, perturbCode);
			if(l!=null && l.size()>0) {
			String newperturbCode = l.get(SelfAPRUtil.getRandomInt(l.size()));			

			if (newperturbCode != null) {
				perturbCode = newperturbCode;
			}
			}
		}

		// remove && || !

		if (SelfAPRUtil.getRandomDouble() > 0.4 && groundTruth.contains("if")
				&& (groundTruth.contains("||") || groundTruth.contains("&&"))) {
			if (perturbCode == null) {
				perturbCode = groundTruth;
			}

			/**
			 * 
			 * split condition with && and ||
			 */
			if (perturbCode.contains("||") || perturbCode.contains("&&")) {

				String sepStr = "";
				if (perturbCode.contains("||")) {
					sepStr = "||";
				} else if (perturbCode.contains("&&")) {
					sepStr = "&&";
				}

				// left
				int sep = perturbCode.indexOf(sepStr);
				String left = (String) perturbCode.subSequence(0, sep) + ")";

				// right
				String right = (String) perturbCode.subSequence(sep + 2, perturbCode.length());

				// begin
				int sep2 = left.indexOf("(");
				String begin = left.substring(0, sep2) + "(";

				// end
				int sepblock = right.indexOf("{");
				int rightlen = right.length();
				if (sepblock > -1 && rightlen > -1) {
					String end = right.substring(sepblock, rightlen);

					if (SelfAPRUtil.getRandomDouble() > 0.5) {
						// remove right
						perturbCode = left + " " + end;
					} else {
						// remove left
						perturbCode = begin + " " + right;
					}
				}
			} else {

				// add additional conditions
				CtExpression<Boolean> booleanExpression = (CtExpression<Boolean>) ((CtIfImpl) st).getCondition();
				String newCond = ConditionAnalysis.getConditions(booleanExpression.toString(), 0.2);
				if (newCond != null) {
					if (perturbCode == null) {
						perturbCode = groundTruth;
					}

					String operator = SelfAPRUtil.getRandomDouble() > 0.5 ? " && " : " || ";
					if (SelfAPRUtil.getRandomDouble() > 0.3) {
						int index = perturbCode.indexOf(")");
						String before = perturbCode.substring(0, index);
						String after = perturbCode.substring(index, perturbCode.length());
						String extbracket = "";
						if (before.contains("(") && before.split("\\(").length > 2) {
							extbracket = " ) ";
						}
						perturbCode = before + extbracket + operator + newCond + " " + after;
					} else {
						int index = perturbCode.indexOf("(");
						String before = perturbCode.substring(0, index + 1);
						String after = perturbCode.substring(index, perturbCode.length());
						perturbCode = before + " " + newCond + operator + after;
					}

				}

			}

		}

		/**
		 * add remove !
		 */
		if ((perturbCode == null || groundTruth.equals(perturbCode)) || SelfAPRUtil.getRandomDouble() > 0.85) {

			if (perturbCode == null || groundTruth.equals(perturbCode)) {
				perturbCode = groundTruth;
			}

			if ((perturbCode.contains("equals") || perturbCode.contains("contains"))) {

				if (SelfAPRUtil.getRandomDouble() > 0.6) {
					if (perturbCode.contains("equals")) {
						perturbCode.replace("equals", "contains");
					} else if (perturbCode.contains("contains")) {
						perturbCode.replace("contains", "equals");
					}
				}

			}

		}

		if (groundTruth.equals(perturbCode))
			if (perturbCode.contains("!")) {
				if (SelfAPRUtil.getRandomDouble() > 0.4) {
					perturbCode = perturbCode.replace("!", "");
				}
			} else if (!perturbCode.contains("!") && groundTruth.equals(perturbCode)) {
				perturbCode = perturbCode.replace("if (", "if ( !");
			}

		if (groundTruth.contains("else") && groundTruth.contains("if")
				&& (SelfAPRUtil.getRandomDouble() > 0.2 || perturbCode == null)) {
			if (perturbCode == null) {
				perturbCode = groundTruth;
			}
			if (SelfAPRUtil.getRandomDouble() > 0.5) {
				perturbCode = perturbCode.replace("else", "");
			} else {
				String before = perturbCode.split("else")[0];
				perturbCode = before + " else " + perturbCode.substring(perturbCode.indexOf("{"), perturbCode.length());
			}

		}

	

		if (!groundTruth.equals(perturbCode) && perturbCode != null) {
			PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "",
					lineNo2, lineNo3, lineNo4, lineNo5, groundTruth);
		}

	}
}
