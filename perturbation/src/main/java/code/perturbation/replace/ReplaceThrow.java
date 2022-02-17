package code.perturbation.replace;

import java.util.HashMap;

import code.output.result.PerturbResult;
import code.perturbation.SimilarityPerturbation;
import code.utils.SUPREUtil;
import code.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class ReplaceThrow {

	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth, int lineNo1,
			String lineNo2, String lineNo3, String lineNo4, int i) {

		// replace with return;
		double r = SUPREUtil.getRandomDouble();
		String perturbCode = "return ;";

		if (r > 0.9) {
			perturbCode = "return ;";
		} else if (r > 0.8) {
			perturbCode = "return 0;";
		} else if (r > 0.7) {
			if (SUPREUtil.getRandomDouble()>0.5) {
			perturbCode = "return true;";
			} else {
				perturbCode = "return false;";
			}
		} else if (r > 0.6) {
			//replace another return xxx
			String newperturbCode = SimilarityPerturbation.perturb(st, groundTruth, StatementType.Return, 0.2, null);
			if (newperturbCode != null) {
				if (newperturbCode != null && !"".equals(newperturbCode)) {
					perturbCode = newperturbCode + " ;";
				}
			}
		} else {
			//replace another throw exception
			String newperturbCode = SimilarityPerturbation.perturb(st, groundTruth, type, 0.4, null);
			if (newperturbCode != null) {
				if (newperturbCode != null && !"".equals(newperturbCode)) {
					perturbCode = newperturbCode + " ;";
				}
			}
		}

		
		
		
		
		
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("lineNo1", lineNo1 + "");
		map.put("lineNo2", lineNo2 + "");
		map.put("lineNo3", lineNo3);
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
		map.put("targetFile", "");

		System.out.println("replace throw");
		PerturbResult.getCorruptedResult(map);

	}

}
