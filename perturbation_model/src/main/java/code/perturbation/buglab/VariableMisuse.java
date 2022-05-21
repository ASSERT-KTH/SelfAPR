package code.perturbation.buglab;

import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.VariablePerturbation;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class VariableMisuse {
	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5) {
		/**
		 * Misuse Variable Perturbation
		 */

		String actionNo = "[BugLab_Variable_Misuse]";
		List<String> perturbCodeList = VariablePerturbation.perturb(st, groundTruth, 1);

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
