package code.perturbation.selfAPR;

import java.util.HashMap;

import code.output.result.PerturbResult;
import code.perturbation.OperatorPerturbation_bak;
import code.perturbation.TypePerturbation;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class P1_Replace_Type {

	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth, int lineNo1,
			String lineNo2, String lineNo3,String lineNo4,String lineNo5) {
		String perturbCode = null;
		String actionNo = "[P1_Replace_Type]";
		
		/**
		 * type perturbation
		 */
		perturbCode = TypePerturbation.perturb(st, groundTruth);
		
		if(!groundTruth.equals(perturbCode) && perturbCode!=null ){
			PerturbResult.parsePerturb(actionNo,perturbCode,methStart+"",methEnd+"",lineNo1+"",lineNo2,lineNo3,lineNo4,lineNo5,groundTruth);		
		}		
	}
		
		
}
