package code.perturbation.selfAPR;

import java.util.ArrayList;
import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.InvocationPerturbation;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class P7_Replace_Invocation {

	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5) {
	/**
	 * P7 Invocation Perturbation
	 */
	String  actionNo = "[P7_Replace_Invocation]";


	List<String> perturbCodeList = InvocationPerturbation.perturb(st, groundTruth);
	
	
	if (perturbCodeList != null) {
		for (String perturbCode : perturbCodeList) {
			if (!groundTruth.equals(perturbCode) && perturbCode != null) {
				PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "",
						lineNo2, lineNo3, lineNo4, lineNo5, groundTruth);
			}
		}

	
	}
	}
}
