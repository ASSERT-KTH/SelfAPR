package code.perturbation.insert;

import java.util.HashMap;
import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class P15_Insert_Block {
public static void insert(CtElement st, StatementType type, int methStart, int methEnd) {

		String actionNo = "P15_Insert_Block";
		
		int lineNo1 = st.getPosition().getLine();
		String lineNo2 = "";
		String lineNo3 = "";
		String lineNo4 = "";
		String lineNo5 = "";


		String groundTruth = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1);
		
		
		if (groundTruth == null) {
			return;
		}
		
		
		
		
		
		//add similar block;		
		
		
		List<String> sets= (List<String>) SimilarityPerturbation.perturb(st, groundTruth,StatementType.Condition,0.4,"null");
		 String perturbCode= sets.size()>0 ?sets.get(0):null;
		
		if(perturbCode==null) {
			return;
		}
		
		if(perturbCode.contains("null") &&perturbCode.contains("if") && perturbCode.contains("rerurn") ) {
			return; //always good to have null checker
		}
		
		perturbCode = perturbCode.replace("\n", " ").replace("\r", " ");
		
		
		groundTruth = " ";
		
		//add extract if wrap the statement
		if(perturbCode!=null) {		
		PerturbResult.parsePerturb(actionNo,perturbCode,methStart+"",methEnd+"",lineNo1+"",lineNo2,lineNo3,lineNo4,lineNo5,groundTruth);	
		}

	}
}
