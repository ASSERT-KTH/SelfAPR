package code.perturbation.buglab;

import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.VariablePerturbation;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class SwapVariable {
	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5) {

		/**
		 * Swap Variable Perturbation
		 */

		String actionNo = "[buglab_swap_variables]";
		List<String> perturbCode2 = VariablePerturbation.perturb(st, groundTruth, true);
		
		if(perturbCode2 != null) {
			for (String perturbCode : perturbCode2) {
				if (!groundTruth.equals(perturbCode) && perturbCode != null) {
					PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "", lineNo2,
							lineNo3, lineNo4, lineNo5, groundTruth);
				}
			}}
				
	}
}
