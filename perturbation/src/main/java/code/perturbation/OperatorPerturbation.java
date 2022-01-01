package code.perturbation;

import java.util.List;

import code.utils.SUPREUtil;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;

public class OperatorPerturbation {

	public static String perturb(CtCodeElement st) {

		System.out.println("...perturbing operators...........perturbing operators.....perturbing operators.........");
		
		String corruptedCode = null;
		int lineNo1 = st.getPosition().getLine();
		String groundTruth = SUPREUtil.getSpecificLine(st.getPosition(), lineNo1);
		if(groundTruth==null) {
			return null;
		}
		
		double r = SUPREUtil.getRandomDouble();
		TypeFilter<CtBinaryOperatorImpl> bOfilter = new TypeFilter<CtBinaryOperatorImpl>(CtBinaryOperatorImpl.class);
		List<CtBinaryOperatorImpl> operators = st.getElements(bOfilter);
		
		if(operators.size()==0) {
			return null;
		}
		
		
		CtBinaryOperatorImpl logicOperator = null;
		if (operators.size() > 0) {
			logicOperator = operators.get(SUPREUtil.getRandomInt(operators.size()));
		}

		
		
		if(r>0.6 && groundTruth.contains("?")) {
			corruptedCode = groundTruth.split("\\?")[0]+";";
			if(SUPREUtil.getRandomDouble()>0.5 && logicOperator!=null) {
				String origOpKind = logicOperator.getKind().toString();
				String origOperator = SUPREUtil.getOperatorValue(origOpKind);
				String perturbedOperator = SUPREUtil.getRandomLogicOperator(origOperator);
				corruptedCode = corruptedCode.replace(origOperator, perturbedOperator);
			}
			
			corruptedCode=corruptedCode;
		}
		
		/**
		 * 
		 * we care about && and || in statement
		 * 
		 */
		else if ((groundTruth.contains("&&") || groundTruth.contains("||")) && r > 0.5) {

			r = SUPREUtil.getRandomDouble();
			if (groundTruth.contains("&&")) {
				if (r > 0.5) {
					corruptedCode = groundTruth.split("&&")[0] + ";";
				} else if (r > 0.25) {
					if (!groundTruth.contains("return")) {
						corruptedCode = groundTruth.replace("&&", SUPREUtil.getRandomLogicOperator("&&"));
					} else {
						corruptedCode = "return  " + groundTruth.split("&&")[1];
					}
				} else {
					corruptedCode = groundTruth.replace("&&", "||");
				}
			}

			if (groundTruth.contains("||")) {
				if (r > 0.5) {
					corruptedCode = groundTruth.split("||")[0] + ";";
				} else if (r > 0.25) {
					if (!groundTruth.contains("return")) {
						corruptedCode = groundTruth.replace("||", SUPREUtil.getRandomLogicOperator("||"));
					} else {
						corruptedCode = "return  " + groundTruth.split("||")[1];
					}
				} else {
					corruptedCode = groundTruth.replace("||", "&&");
				}
			}

			if (SUPREUtil.getRandomDouble() > 0.2 && operators.size() > 0) {

				/**
				 * - a + b; + a * b; + a;
				 */
				logicOperator = operators.get(SUPREUtil.getRandomInt(operators.size() - 1));
				String origOpKind = logicOperator.getKind().toString();
				String origOperator = SUPREUtil.getOperatorValue(origOpKind);
				String perturbedOperator = SUPREUtil.getRandomLogicOperator(origOperator);
				if (SUPREUtil.getRandomDouble() > 0.5) {
					corruptedCode = corruptedCode.replace(origOperator, perturbedOperator);
				} else {
					corruptedCode = corruptedCode.split(origOperator)[0] + ";";
				}
			}

		}

		/**
		 * we care about other operators == != operators
		 * 
		 * 
		 */
		else if (operators.size() > 0 && r > 0.3) {
			// get a random operator
			// return element with binary operator
			String origOpKind = logicOperator.getKind().toString();
			String origOperator = SUPREUtil.getOperatorValue(origOpKind);
			String perturbedOperator = SUPREUtil.getRandomLogicOperator(origOperator);
			r = SUPREUtil.getRandomDouble();
			if (logicOperator.getKind().equals(BinaryOperatorKind.EQ)) {
				double threshold = groundTruth.contains("null") ? 0.2 : 0.5;
				if (r > threshold ) {
					perturbedOperator = "!=";
					corruptedCode = groundTruth.replace(origOperator, perturbedOperator);
				} else if (corruptedCode == null & logicOperator.getKind().equals(BinaryOperatorKind.NE)) {
					if (r > threshold) {
						perturbedOperator = "==";
						corruptedCode = groundTruth.replace(origOperator, perturbedOperator);
					}
				} else if (corruptedCode == null) {
					perturbedOperator = SUPREUtil.getRandomLogicOperator(origOperator);
					corruptedCode = groundTruth.replace(origOperator, perturbedOperator);
				}

			}
		} else if (logicOperator != null) {
			/**
			 * we replace Left and right Hand Operand
			 */
			r = SUPREUtil.getRandomDouble();
			CtExpression left = logicOperator.getLeftHandOperand();
			CtExpression right = logicOperator.getRightHandOperand();

			String leftStr = SUPREUtil.getSimpleVarName(left.toString());
			String rightStr = SUPREUtil.getSimpleVarName(right.toString());

			if (r > 0.7) {
				// replace left
				corruptedCode = groundTruth.replace(leftStr, SUPREUtil.getRandomVariable(left));

			} else if (r > 0.35) {
				// replace right
				corruptedCode = groundTruth.replace(rightStr, SUPREUtil.getRandomVariable(right));

			} else {
				// replace both
				corruptedCode = groundTruth.replace(leftStr, SUPREUtil.getRandomVariable(left));
				corruptedCode = groundTruth.replace(rightStr, SUPREUtil.getRandomVariable(right));
			}

		}

		return corruptedCode;

	}
}
