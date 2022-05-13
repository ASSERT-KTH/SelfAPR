package code.perturbation.selfAPR;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import code.analysis.StatementAnalysis;
import code.output.result.PerturbResult;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.selfAPR.mix.ReplaceStatement;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class P11_Transplant_Statement {

	public static void insert(CtElement st, StatementType type, int methStart, int methEnd) {
		
		if(type.equals(StatementType.Condition) || type.equals(StatementType.ConditionHead) || type.equals(StatementType.For) || type.equals(StatementType.Whiles) ) {
			return;
		}
		
		String actionNo = "[P11_Insert_Donor_Statement]";

		int lineNo1 = st.getPosition().getLine();
		String lineNo2 = "";
		String lineNo3 = "";
		String lineNo4 = "";
		String lineNo5 = "";
		List<String> perturbList = new ArrayList<String>() ;
		String groundTruth = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1);
		if (groundTruth == null) {
			return;
		}

		/**
		 * We care about the complete block at most three lines
		 */
		groundTruth = groundTruth.trim();
		
		String lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";

		if ("{".equals(lastChar)){
			return;			
		}
		
		if ("}".equals(lastChar)){
			return;			
		}
		

		if (!";".equals(lastChar)){
			String lineNo2String = " " + SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 1).trim();
			lastChar = lineNo2String.charAt(lineNo2String.length() - 1) + "";
			if (!";".equals(lastChar)){
				return;
			} else {
				groundTruth = groundTruth + lineNo2String;
				lineNo2 = lineNo1 + 1 + "";
			}
		}
		
		
		
		
		
		
		String perturbCode = "";
		
		//transplant similar statement;	
		
		 List<String> translist= (List<String>) SimilarityPerturbation.perturb(st, groundTruth,type,0.5,null);
		 if(translist == null || translist.size()==0) {
			 return;
		 }
		 
		 
		for (String transplantString: translist) {
				
			if( transplantString==null) {
				return;
			}
			
			if(!transplantString.endsWith(";")) {
				return;
			}
			
			if( transplantString.startsWith("for") || transplantString.startsWith("if")   || transplantString.startsWith("{") || "".equals(transplantString) || transplantString.endsWith("{") || transplantString.endsWith("}") || transplantString.startsWith("}")) {
				return ;
			}
			
			
			if(transplantString.length()>2*groundTruth.length() ) {
				return ;
			}
								

			if(transplantString.contains("return") && groundTruth.contains("return") ) {
				return ;
			}
					
					
			transplantString = transplantString.replace("\r", " ").replace("\n", " ");
			
			perturbCode = transplantString + groundTruth;
			
			perturbList.add(perturbCode);
		
		 }
						
		
	
		for(String perturberd : perturbList) {
		if(perturberd!=null) {		
	
			PerturbResult.parsePerturb(actionNo,perturberd,methStart+"",methEnd+"",lineNo1+"",lineNo2,lineNo3,lineNo4,lineNo5,groundTruth);		
		}
		}
		
		
	}

}
