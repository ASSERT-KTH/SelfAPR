package code.perturbation.selfAPR.mix;

import java.util.HashMap;

import code.output.result.PerturbResult;
import code.perturbation.ConstructorPerturbation;
import code.perturbation.LiteralPerturbation;
import code.perturbation.ModifiersPerturbation;
import code.perturbation.TypePerturbation;
import code.perturbation.utils.SelfAPRUtil;
import spoon.reflect.declaration.CtElement;

public class ReplaceDeclaration {

	public static void perturb(CtElement st, int methStart, int methEnd, String groundTruth, int lineNo1,
			String lineNo2, String lineNo3, String lineNo4,String lineNo5, double prob,String actionNo) {
		String perturbCode = null;
		/**
		 * This is a random number to decide the perturbation
		 */
		double r = SelfAPRUtil.getRandomDouble();

		/**
		 * We try to perturb the literals
		 * 
		 */

		if ( perturbCode == null) {
			perturbCode = LiteralPerturbation.perturb(st, groundTruth);
		}

		if (r > 0.3 && perturbCode == null) {
			perturbCode = ConstructorPerturbation.perturb(st, groundTruth);
		}

		// replace type
		if (perturbCode == null) {
			perturbCode = TypePerturbation.perturb(st, groundTruth);
		} else if (SelfAPRUtil.getRandomDouble() > prob) {
			perturbCode = TypePerturbation.perturb(st, perturbCode);
		}
		
		
		// modifier
		if (perturbCode == null) {
			perturbCode = ModifiersPerturbation.perturb(st, groundTruth);
		} else if (SelfAPRUtil.getRandomDouble() > prob) {
			perturbCode = ModifiersPerturbation.perturb(st, perturbCode);
		}
		
		
		
		// remove instantiation
		if (groundTruth.contains("=") && (perturbCode == null || r > prob)) {
			r = SelfAPRUtil.getRandomDouble();
			if (r > 0.5) {
				perturbCode = groundTruth.split("=")[0] + ";";
			} else {
				perturbCode = groundTruth.split("=")[0] + " = null ;";
			}
		}

		if (!groundTruth.equals(perturbCode) && perturbCode != null) {
			PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "",
					lineNo2, lineNo3, lineNo4, lineNo5, groundTruth);
		}

	}

}
