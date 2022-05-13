package code.perturbation.selfAPR;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import code.output.result.PerturbResult;
import code.perturbation.InvocationPerturbation;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class P9_Replace_Statement {

	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5) {
		/**
		 * P9 Statement Perturbation
		 */
		String actionNo = "[P9_Replace_Statement]";
		
		
		if( type.equals(StatementType.For) || type.equals(StatementType.Whiles) ) {
			return;
		}
		
		List<String> perturbCodeSet = null;
		if(!type.equals(StatementType.Condition) ) {
			//perturbCodeSet = SimilarityPerturbation.perturb(st, groundTruth, type, 0.65, null);
		} else if(groundTruth.endsWith("{")){
			perturbCodeSet = SimilarityPerturbation.perturb(st, groundTruth, StatementType.ConditionHead, 0.65, null);
		}
		
		
		
		
		
		

		if (perturbCodeSet != null) {
			for (String perturbCode : perturbCodeSet) {	
				
				if(perturbCode==null||"".endsWith(perturbCode)) {
					break;
				}
				
				if(perturbCode.length()>groundTruth.length()*1.5) {
					break;
				}
				
				if(perturbCode.startsWith("for")){
					break;
				}
				
				perturbCode=perturbCode.trim();
				groundTruth=groundTruth.trim();

				String lstP = perturbCode.charAt(perturbCode.length()-1)+"";
				String lstG = groundTruth.charAt(groundTruth.length()-1)+"";
				
				String frsP = perturbCode.charAt(0)+"";
				String ftsG = groundTruth.charAt(0)+"";

				if(!lstP.equals(lstG)) {
					break;
				}
				
				if(!frsP.equals(ftsG)) {
					break;
				}
				
				
				
				
				
				if (!groundTruth.equals(perturbCode) && perturbCode != null) {
					PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "",
							lineNo2, lineNo3, lineNo4, lineNo5, groundTruth);
				}
			}
		}
	}
}
