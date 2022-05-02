package code.perturbation.insert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import code.analysis.StatementAnalysis;
import code.output.result.PerturbResult;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.replace.mix.ReplaceStatement;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class P10_Transplant_Statement {

	public static void insert(CtElement st, StatementType type, int methStart, int methEnd) {
		
		if(type.equals(StatementType.Condition) || type.equals(StatementType.ConditionHead) || type.equals(StatementType.For) || type.equals(StatementType.Whiles) ) {
			return;
		}
		
		String actionNo = "[P10_Insert_Statement]";

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
		String perturbCodeMove = groundTruth;
		
		
		//statemnet 1, statement 2;
		String lineNo2String = " " + SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 1).trim();

		if (";".equals(lastChar) ) {
			lastChar = lineNo2String.charAt(lineNo2String.length() - 1) + "";

			if(!";".equals(lastChar)) {
				return;
			} else {
				if(SelfAPRUtil.getRandomDouble() > 0.5) {
					//move
					
					if(SelfAPRUtil.getRandomDouble() > 0.5) {
						lineNo2 = lineNo1 + 1 + "";
						groundTruth+=lineNo2String;
					}
					perturbCodeMove = lineNo2String + " "+perturbCodeMove; //learn to move code statement 1 to statement 2
					perturbList.add(perturbCodeMove);
					
					
					
					
				} else {
					//the third line as the donor statement
					String lineNo3String = " " + SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 2).trim();
					lastChar = lineNo3String.charAt(lineNo3String.length() - 1) + "";
					if(!";".equals(lastChar)) {
						//remove: 
						perturbCodeMove = lineNo3String + " "+ groundTruth;
						perturbList.add(perturbCodeMove);

					}

					
				}
				
			}
			
			
			
			
			
			
						
		} else if (!"{".equals(lastChar)){
			groundTruth+=lineNo2String;
			lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
			if(!";".equals(lastChar)) {
				return;
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
						
		
		
		
		
//		else {
//			//add condition wrap this statement;	
//			 List<String> sets= (List<String>) SimilarityPerturbation.perturb(st, groundTruth,StatementType.ConditionHead,0.3,"null");
//			 String newperturbCode= sets.size()>0 ?sets.get(0):null;
//			 
//			 
//			if(perturbCode==null) {
//				return;
//			}
//			
//			
//			if(perturbCode.contains("{")) {
//				int index = perturbCode.indexOf("{");
//				String before = perturbCode.substring(0, index);
//				
//				perturbCode = before + " { "+ groundTruth + " } ";
//				
//			}
//		}
		
		

		
		
		//add extract if wrap the statement
	
		for(String perturberd : perturbList) {
		if(perturberd!=null) {		
	
			PerturbResult.parsePerturb(actionNo,perturberd,methStart+"",methEnd+"",lineNo1+"",lineNo2,lineNo3,lineNo4,lineNo5,groundTruth);		
		}
		}
		
		
	}

}
