package code.perturbation.selfAPR;

import java.util.HashSet;
import java.util.Set;

import code.output.result.PerturbResult;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.selfAPR.mix.ReplaceAssignment;
import code.perturbation.selfAPR.mix.ReplaceCondition;
import code.perturbation.selfAPR.mix.ReplaceDeclaration;
import code.perturbation.selfAPR.mix.ReplaceReturn;
import code.perturbation.selfAPR.mix.ReplaceStatement;
import code.perturbation.selfAPR.mix.ReplaceThrow;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class P8_Replace_Mix {

	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5) {
		/**
		 * P8 Mix Perturbation of P1-P7
		 */
		String actionNo = "[P8_Replace_Mix]";

		double probility = 0.8;
		if (type == StatementType.Declaration) {
			ReplaceDeclaration.perturb(st, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4, lineNo5,
					probility, actionNo);

		}

		else if (type == StatementType.Assignment) {
			ReplaceAssignment.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,
					lineNo5, probility, actionNo);
		}

		else if (type == StatementType.Condition) {
			ReplaceCondition.perturb(st, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4, lineNo5,
					probility, actionNo);
		}

		else if (type == StatementType.Return) {
			ReplaceReturn.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,
					lineNo5, probility, actionNo);

		}

		else if (type == StatementType.Throw) {
			if (SelfAPRUtil.getRandomDouble() > 0.7) {
				ReplaceThrow.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,
						lineNo5, actionNo);
			}
		}

		else {
			ReplaceStatement.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,
					lineNo5, actionNo);
		}

	}
}
