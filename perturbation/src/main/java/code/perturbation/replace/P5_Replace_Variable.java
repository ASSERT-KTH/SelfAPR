package code.perturbation.replace;

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

		String actionNo = "[P5]";
		
		String perturbCode = null;
		

		perturbCode = VariablePerturbation.perturb(st, groundTruth);

		
	

		if (!groundTruth.equals(perturbCode) && perturbCode != null) {
			PerturbResult.parsePerturb(actionNo,perturbCode,methStart+"",methEnd+"",lineNo1+"",lineNo2,lineNo3,lineNo4,lineNo5,groundTruth);
		}
	}
}
