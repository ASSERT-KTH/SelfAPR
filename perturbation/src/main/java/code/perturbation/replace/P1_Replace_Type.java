package code.perturbation.replace;

import java.util.HashMap;

import code.output.result.PerturbResult;
import code.perturbation.OperatorPerturbation_bak;
import code.perturbation.TypePerturbation;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class P1_Replace_Type {

	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth, int lineNo1,
			String lineNo2, String lineNo3,String lineNo4) {
		String perturbCode = null;
		String originGroundTruth = groundTruth;
		
		/**
		 * type perturbation
		 */
		perturbCode = TypePerturbation.perturb(st, groundTruth);
		
		if(!groundTruth.equals(perturbCode) && perturbCode!=null ){

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("lineNo1", lineNo1 + "");
		map.put("lineNo2", lineNo2 + "");
		map.put("lineNo3", lineNo3 + "");
		map.put("lineNo4",lineNo4);
		map.put("lineNo5", "");
		map.put("perturbCode", perturbCode);
		map.put("groundTruth", groundTruth);
		map.put("methodStart", methStart + "");
		map.put("methodEnd", methEnd + "");
		map.put("repairAction", "[P1]");

		PerturbResult.getCorruptedResult(map);
		}		
	}
		
		
}
