package code.perturbation.replace;

import java.util.HashMap;

import code.output.result.PerturbResult;
import code.perturbation.LiteralPerturbation;
import code.perturbation.ModifiersPerturbation;
import code.perturbation.TypePerturbation;
import code.utils.SUPREUtil;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.declaration.CtElement;

public class Replace {

	public static void replace(CtElement st, String type, int methStart, int methEnd) {

		int lineNo1 = st.getPosition().getLine();
		String lineNo2 = "";
		String lineNo3 = "";
		String lineNo4 = "";

		String groundTruth = SUPREUtil.getSpecificLine(st.getPosition(), lineNo1);
		if (groundTruth == null) {
			return;
		}

		/**
		 * We care about the complete block at most three lines
		 */
		groundTruth = groundTruth.trim();

		String lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
		if (!";".equals(lastChar) && !"}".equals(lastChar) && !"{".equals(lastChar)) {
			lineNo2 = lineNo1 + 1 + "";
			groundTruth += " " + SUPREUtil.getSpecificLine(st.getPosition(), lineNo1 + 1).trim();
			lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
			if (!";".equals(lastChar) && !"}".equals(lastChar) && !"{".equals(lastChar) ) {
				lineNo3 = lineNo1 + 2 + "";
				groundTruth += " " + SUPREUtil.getSpecificLine(st.getPosition(), lineNo1 + 2).trim();
			}
			
			lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
			if (!";".equals(lastChar) && !"}".equals(lastChar) && !"{".equals(lastChar) ) {
				lineNo4 = lineNo1 + 3 + "";
				groundTruth += " " + SUPREUtil.getSpecificLine(st.getPosition(), lineNo1 + 3).trim();
			}
		}

		if (type.contains("declaration")) {
			ReplaceDeclaration.perturb(st, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3,lineNo4);
		}

		else if (type.contains("assignment")  ) {
			ReplaceAssignment.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3,lineNo4,0);
		}
		
		else if (type.contains("condition")) {
			ReplaceCondition.perturb(st, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3,lineNo4,0);
		}

		else if (type.contains("return")) {
			 ReplaceReturn.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3,lineNo4, 0);
		 }	
		 
		else if(type.contains("throw")) {
			 ReplaceThrow.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3,lineNo4, 0);

		 }
		 
		else  {
			 ReplaceStatement.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3,lineNo4,0);
		 }
		 
		

	}

}
