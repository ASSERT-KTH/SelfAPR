package code.perturbation.replace;

import java.util.HashMap;

import code.output.result.PerturbResult;
import code.perturbation.ConstructorPerturbation;
import code.perturbation.LiteralPerturbation;
import code.perturbation.ModifiersPerturbation;
import code.perturbation.TypePerturbation;
import code.utils.SUPREUtil;
import spoon.reflect.declaration.CtElement;

public class ReplaceDeclaration {

	public static void perturb(CtElement st, int methStart, int methEnd, String groundTruth, int lineNo1,
			String lineNo2, String lineNo3, String lineNo4,double prob) {
		String perturbCode = null;
		/**
		 * This is a random number to decide the perturbation
		 */
		double r = SUPREUtil.getRandomDouble();

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
		} else if (SUPREUtil.getRandomDouble() > prob) {
			perturbCode = TypePerturbation.perturb(st, perturbCode);
		}
		
		
		// modifier
		if (perturbCode == null) {
			perturbCode = ModifiersPerturbation.perturb(st, groundTruth);
		} else if (SUPREUtil.getRandomDouble() > prob) {
			perturbCode = ModifiersPerturbation.perturb(st, perturbCode);
		}
		
		
		
		// remove instantiation
		if (groundTruth.contains("=") && (perturbCode == null || r > prob)) {
			r = SUPREUtil.getRandomDouble();
			if (r > 0.5) {
				perturbCode = groundTruth.split("=")[0] + ";";
			} else {
				perturbCode = groundTruth.split("=")[0] + " = null ;";
			}
		}

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("lineNo1", lineNo1 + "");
		map.put("lineNo2", lineNo2 + "");
		map.put("lineNo3", lineNo3 + "");
		map.put("lineNo4", lineNo4);
		map.put("lineNo5", "");
		map.put("line1", perturbCode);
		map.put("line2", "");
		map.put("line3", "");
		map.put("line4", "");
		map.put("line5", "");
		map.put("groundTruth", groundTruth);
		map.put("methodStart", methStart + "");
		map.put("methodEnd", methEnd + "");
		map.put("repairAction", "[REPLACE]");
		System.out.println("replace declaration");

		PerturbResult.getCorruptedResult(map);

	}

}
