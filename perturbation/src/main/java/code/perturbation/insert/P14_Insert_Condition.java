package code.perturbation.insert;

import java.util.HashMap;
import java.util.List;

import code.analysis.StatementAnalysis;
import code.output.result.PerturbResult;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class P14_Insert_Condition {

	public static void insert(CtElement st, StatementType type, int methStart, int methEnd) {

		String actionNo = "P14_Insert_Condition";

		int lineNo1 = st.getPosition().getLine();
		String lineNo2 = "";
		String lineNo3 = "";
		String lineNo4 = "";
		String lineNo5 = "";

		String groundTruth = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1);
		
		
		if (groundTruth == null) {
			return;
		}
		
		
		
		
		

		
		
		
		//add similar statement;		
		
		
		List<String> sets= (List<String>) SimilarityPerturbation.perturb(st, groundTruth,StatementType.ConditionHead,0.4,"null");
		 String perturbCode= sets.size()>0 ?sets.get(0):null;
		
		if(perturbCode==null) {
			return;
		}
		
		if(perturbCode.contains("null") &&perturbCode.contains("if") && perturbCode.contains("rerurn") ) {
			return; //always good to have null checker
		}
		
		perturbCode = perturbCode.replace("\n", " ").replace("\r", " ");
		
		
		groundTruth = " ";
		if(perturbCode!=null) {		
		PerturbResult.parsePerturb(actionNo,perturbCode,methStart+"",methEnd+"",lineNo1+"",lineNo2,lineNo3,lineNo4,lineNo5,groundTruth);		
		}
	}

}
