package code.perturbation.add;

import java.util.HashMap;

import code.analysis.StatementAnalysis;
import code.output.result.PerturbResult;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class AddCondition {

	public static void add(CtElement st, StatementType type, int methStart, int methEnd) {

		
		int lineNo1 = st.getPosition().getLine();
		String lineNo2 = "";
		String lineNo3 = "";
		String lineNo4 = "";

		String groundTruth = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1);
		
		
		if (groundTruth == null) {
			return;
		}
		
		
		
		
		

		
		
		
		//add similar statement;		
		
		
		String perturbCode =  SimilarityPerturbation.perturb(st, groundTruth,StatementType.Condition, 0.4,"null");
		
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
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("lineNo1", lineNo1 + "");
		map.put("lineNo2", lineNo2 );
		map.put("lineNo3", lineNo3 );
		map.put("lineNo4", lineNo4);
		map.put("lineNo5", "");
		map.put("line1", perturbCode);
		map.put("line2", "");
		map.put("line3", "");
		map.put("line4", "");
		map.put("line5", "");
		map.put("groundTruth", groundTruth);
		map.put("methodStart", methStart + "");
		map.put("methodEnd", methEnd + "");
		map.put("repairAction", "[REMOVE]");
		
		PerturbResult.getCorruptedResult(map);		
		}
	}

}
