package code.perturbation.selfAPR;

import code.output.result.PerturbResult;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class P14_Delete_Statement {
	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5) {
		/**
		 * P13 Remove Perturbation of Statement
		 */
		String actionNo = "[P14_Delete_Statement]";
		String perturbCode = "";
		if(type.equals(StatementType.Statement)) {
			PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "",
				lineNo2, lineNo3, lineNo4, lineNo5, groundTruth);
		}
		
	}
}
