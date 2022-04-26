package code.perturbation.insert;

import java.util.HashMap;
import java.util.List;

import code.analysis.StatementAnalysis;
import code.output.result.PerturbResult;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.replace.mix.ReplaceStatement;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class P13_Insert_Statement {

	public static void insert(CtElement st, StatementType type, int methStart, int methEnd) {
		
	
		
		String actionNo = "P13_Insert_Statement";

		int lineNo1 = st.getPosition().getLine();
		String lineNo2 = "";
		String lineNo3 = "";
		String lineNo4 = "";
		String lineNo5 = "";

		String groundTruth = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1);
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
			groundTruth += " " + SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 1).trim();
			lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
			if (!";".equals(lastChar) && !"}".equals(lastChar) && !"{".equals(lastChar) ) {
				lineNo3 = lineNo1 + 2 + "";
				groundTruth += " " + SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 2).trim();
			}
			
			lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
			if (!";".equals(lastChar) && !"}".equals(lastChar) && !"{".equals(lastChar) ) {
				lineNo4 = lineNo1 + 3 + "";
				groundTruth += " " + SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 3).trim();
			}
		}
		
		String perturbCode = null;;
		
		//add similar statement;		
		if(SelfAPRUtil.getRandomDouble()>0.3) {
		 List<String> l= (List<String>) SimilarityPerturbation.perturb(st, groundTruth,StatementType.Statement,0.3,null);
		 if(l == null) {
			 return;
		 }
		 String newperturbCode= l.size()>0 ?l.get(0):null;
				
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
			 List<String> sets= (List<String>) SimilarityPerturbation.perturb(st, groundTruth,StatementType.ConditionHead,0.3,"null");
			 String newperturbCode= sets.size()>0 ?sets.get(0):null;
			 
			 
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
	
			PerturbResult.parsePerturb(actionNo,perturbCode,methStart+"",methEnd+"",lineNo1+"",lineNo2,lineNo3,lineNo4,lineNo5,groundTruth);		

		}
		
		
	}

}
