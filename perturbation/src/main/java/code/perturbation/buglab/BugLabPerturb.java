package code.perturbation.buglab;

import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.VariablePerturbation;
import code.perturbation.selfAPR.P1_Replace_Type;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class BugLabPerturb {
	
	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd) {

		int lineNo1 = st.getPosition().getLine();
		String lineNo2 = "";
		String lineNo3 = "";
		String lineNo4 = "";
		String lineNo5 = "";

		String groundTruth = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1);
		if (groundTruth == null) {
			return;
		}

		/**
		 * We care about the complete block at most five lines
		 */
		groundTruth = groundTruth.trim();

		String lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
		if (!";".equals(lastChar) && !"}".equals(lastChar) && !"{".equals(lastChar)) {
			
			lineNo2 = lineNo1 + 1 + "";
			groundTruth += " " + SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 1).trim();
			lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
			if (!";".equals(lastChar) && !"}".equals(lastChar) && !"{".equals(lastChar) ) {
				lineNo3 = lineNo1 + 2 + "";
				groundTruth += " " + SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 2).trim();
			}
			
			lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
			if (!";".equals(lastChar) && !"}".equals(lastChar) && !"{".equals(lastChar) ) {
				lineNo4 = lineNo1 + 3 + "";
				groundTruth += " " + SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 3).trim();
			}
					
		}
		
		
		VariableMisuse.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,lineNo5);
		
		ArgumentSwapping.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,lineNo5);

		WrongOperator.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,lineNo5);

		WrongLiteral.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,lineNo5);


	}
}
