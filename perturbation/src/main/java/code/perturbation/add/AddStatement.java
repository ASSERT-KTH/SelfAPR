package code.perturbation.add;

import java.util.HashMap;

import code.analysis.StatementAnalysis;
import code.output.result.PerturbResult;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.replace.ReplaceStatement;
import code.utils.SUPREUtil;
import code.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class AddStatement {

	public static void add(CtElement st, StatementType type, int methStart, int methEnd) {
		
	
		
		
		int lineNo1 = st.getPosition().getLine();
		String lineNo2 = "";
		String lineNo3 = "";
		String lineNo4 = "";

		String groundTruth = SUPREUtil.getSpecificLine(st.getPosition(), lineNo1);
		if (groundTruth == null) {
			return;
		}

		/**
		 * We care about the complete block at most three lines
		 */
		groundTruth = groundTruth.trim();
		
		String action="[REMOVE]";

		String lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
		
		if(!";".equals(lastChar)) {
			return;
		}
		
		
		
		if (!";".equals(lastChar) && !"}".equals(lastChar) && !"{".equals(lastChar)) {
			lineNo2 = lineNo1 + 1 + "";
			groundTruth += " " + SUPREUtil.getSpecificLine(st.getPosition(), lineNo1 + 1).trim();
			lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
			if (!";".equals(lastChar) && !"}".equals(lastChar) && !"{".equals(lastChar) ) {
				lineNo3 = lineNo1 + 2 + "";
				groundTruth += " " + SUPREUtil.getSpecificLine(st.getPosition(), lineNo1 + 2).trim();
			}
			
			lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
			if (!";".equals(lastChar) && !"}".equals(lastChar) && !"{".equals(lastChar) ) {
				lineNo4 = lineNo1 + 3 + "";
				groundTruth += " " + SUPREUtil.getSpecificLine(st.getPosition(), lineNo1 + 3).trim();
			}
		}
		
		String perturbCode = null;;
		
		//add similar statement;		
		if(SUPREUtil.getRandomDouble()>0.3) {
		 perturbCode =  SimilarityPerturbation.perturb(st, groundTruth,StatementType.Statement,0.3,null);
				
		if( perturbCode==null) {
			return;
		}
	
		if(perturbCode.startsWith("{") || "".equals(perturbCode)) {
			return ;
		}
		
		if(perturbCode==null) {
			return;
		}
		perturbCode = perturbCode.replace("\r", " ").replace("\n", " ");
						
		groundTruth = " ";
		}
		else {
			//add condition wrap this statement;	
			 perturbCode =  SimilarityPerturbation.perturb(st, groundTruth,StatementType.ConditionHead,0.3,"null");
			if(perturbCode==null) {
				return;
			}
			
			
			if(perturbCode.contains("{")) {
				int index = perturbCode.indexOf("{");
				String before = perturbCode.substring(0, index);
				
				perturbCode = before + " { "+ groundTruth + " } ";
				action="[REPLACE]";
				
			}
		}
		
		

		
		
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
		map.put("repairAction", action);

		PerturbResult.getCorruptedResult(map);
		
		
		}
		
		
	}

}
