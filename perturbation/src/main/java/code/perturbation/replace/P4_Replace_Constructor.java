package code.perturbation.replace;

import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.ConstructorPerturbation;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;
import spoon.support.reflect.code.CtOperatorAssignmentImpl;

public class P4_Replace_Constructor {
	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5) {

		/**
		 * P4 Constructor Perturbation
		 */

		String actionNo = "[P4]";
		
		String perturbCode = null;
		


		
		
		String perturbContructor= ConstructorPerturbation.perturb(st, groundTruth);
		
		if (perturbContructor!=null && groundTruth.contains("new")) {
			perturbCode =  groundTruth.split("new")[0] + perturbContructor;
		}
		

		if (!groundTruth.equals(perturbCode) && perturbCode != null) {
			PerturbResult.parsePerturb(actionNo,perturbCode,methStart+"",methEnd+"",lineNo1+"",lineNo2,lineNo3,lineNo4,lineNo5,groundTruth);
		}
	}
	
}
