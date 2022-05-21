package code.perturbation.selfAPR.mix;

import java.util.HashMap;
import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class ReplaceThrow {

	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5, String actionNo) {

		// replace with return;
		double r = SelfAPRUtil.getRandomDouble();
		String perturbCode = "return ;";

		if (r > 0.9) {
			perturbCode = "return ;";
		} else if (r > 0.8) {
			perturbCode = "return 0;";
		} else if (r > 0.7) {
			if (SelfAPRUtil.getRandomDouble() > 0.5) {
				perturbCode = "return true;";
			} else {
				perturbCode = "return false;";
			}
		} else if (r > 0.6) {
			// replace another return xxx

			List<String> sets = (List<String>) SimilarityPerturbation.perturb(st, groundTruth, StatementType.Return,
					0.3, null);
			String newperturbCode = sets.size() > 0 ? sets.get(0) : null;
			if (newperturbCode != null) {
				if (newperturbCode != null && !"".equals(newperturbCode)) {
					perturbCode = newperturbCode + " ;";
				}
			}
		} else {
			// replace another throw exception
			List<String> sets = (List<String>) SimilarityPerturbation.perturb(st, groundTruth, type, 0.4, null);
			String newperturbCode = sets.size() > 0 ? sets.get(0) : null;
			if (newperturbCode != null) {
				if (newperturbCode != null && !"".equals(newperturbCode)) {
					perturbCode = newperturbCode + " ;";
				}
			}
		}

		if (!groundTruth.equals(perturbCode) && perturbCode != null) {
			PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "", lineNo2,
					lineNo3, lineNo4, lineNo5, groundTruth);
		}

	}

}
