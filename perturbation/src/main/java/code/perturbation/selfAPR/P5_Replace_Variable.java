package code.perturbation.selfAPR;

import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.ConstructorPerturbation;
import code.perturbation.VariablePerturbation;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class P5_Replace_Variable {
	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5) {

		/**
		 * P5 Variable Perturbation
		 */

		String actionNo = "[P5_Replace_Variable]";

	

		List<String> perturbCode1  = VariablePerturbation.perturb(st, groundTruth, 1);
		List<String> perturbCode2 = VariablePerturbation.perturb(st, groundTruth, 2);
		List<String> perturbCode3 = VariablePerturbation.perturb(st, groundTruth, 3);


		if(perturbCode1 != null) {
		for (String perturbCode : perturbCode1) {
			if (!groundTruth.equals(perturbCode) && perturbCode != null) {
				PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "", lineNo2,
						lineNo3, lineNo4, lineNo5, groundTruth);
			}
		}}

		if(perturbCode2 != null) {
		for (String perturbCode : perturbCode2) {
			if (!groundTruth.equals(perturbCode) && perturbCode != null) {
				PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "", lineNo2,
						lineNo3, lineNo4, lineNo5, groundTruth);
			}
		}}
		
		if(perturbCode3 != null) {
			for (String perturbCode : perturbCode3) {
				if (!groundTruth.equals(perturbCode) && perturbCode != null) {
					PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "", lineNo2,
							lineNo3, lineNo4, lineNo5, groundTruth);
				}
			}}
				

	}
}
