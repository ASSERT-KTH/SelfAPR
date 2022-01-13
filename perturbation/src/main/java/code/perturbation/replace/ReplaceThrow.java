package code.perturbation.replace;

import java.util.HashMap;

import code.output.result.PerturbResult;
import code.perturbation.SimilarityPerturbation;
import code.utils.SUPREUtil;
import spoon.reflect.declaration.CtElement;

public class ReplaceThrow {

	public static void perturb(CtElement st, String type, int methStart, int methEnd, String groundTruth, int lineNo1,
			String lineNo2, String lineNo3, String lineNo4, int i) {

		// replace with return;
		double r = SUPREUtil.getRandomDouble();
		String perturbCode = "return ;";

		if (r > 0.6) {
			perturbCode = "return ;";
		} else if (r > 0.5) {
			//replace another return xxx;
			String newperturbCode = SimilarityPerturbation.perturb(st, groundTruth, "return", 0.1, null);
			if (newperturbCode != null) {
				if (newperturbCode != null && !"".equals(newperturbCode)) {
					perturbCode = newperturbCode + " ;";
				}
			}
		} else {
			String newperturbCode = SimilarityPerturbation.perturb(st, groundTruth, type, 0.5, null);
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
