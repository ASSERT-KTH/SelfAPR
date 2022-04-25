package code.perturbation.replace;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import code.output.result.PerturbResult;
import code.perturbation.InvocationPerturbation;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class P8_Replace_Statement {

	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5) {
		/**
		 * P8 Statement Perturbation
		 */
		String actionNo = "[P8_Replace_Statement]";
		
		List<String> perturbCodeSet = SimilarityPerturbation.perturb(st, groundTruth, type, 0.7, null);
		

		if (perturbCodeSet != null) {
			for (String perturbCode : perturbCodeSet) {
				if (!groundTruth.equals(perturbCode) && perturbCode != null) {
					PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "",
							lineNo2, lineNo3, lineNo4, lineNo5, groundTruth);
				}
			}
		}
	}
}
