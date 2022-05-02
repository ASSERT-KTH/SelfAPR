package code.perturbation.remove;

import code.output.result.PerturbResult;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class P13_Remove_Statement {
	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5) {
		/**
		 * P13 Remove Perturbation of Statement
		 */
		String actionNo = "[P13_Remove_Statement]";
		String perturbCode = "";
		if(type.equals(StatementType.Statement)) {
			PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "",
				lineNo2, lineNo3, lineNo4, lineNo5, groundTruth);
		}
		
	}
}
