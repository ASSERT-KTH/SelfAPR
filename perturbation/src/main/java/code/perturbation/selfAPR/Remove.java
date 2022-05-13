package code.perturbation.selfAPR;

import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBlockImpl;
import spoon.support.reflect.code.CtIfImpl;

import java.lang.Math;
import java.util.HashMap;
import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;

public class Remove {

	public static void remove(CtElement st, StatementType type, int methStart, int methEnd) {


		String perturbCode = "";

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
		 * We care about the complete block at most five lines
		 */
		groundTruth = groundTruth.trim();

		String lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";

		// if condition
		if (groundTruth.contains("if")  || groundTruth.contains("else")  || groundTruth.contains("for") ) { 
			
			  if(groundTruth.startsWith("}") && groundTruth.contains("else") ) {
				  perturbCode="}   ";
			  }
			
			
			
			
				// line 2
				lineNo2 = lineNo1 + 1 + "";
				String l2 = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 1).trim();
				if (l2.length() > 0) {
					lastChar = l2.charAt(l2.length() - 1) + "";

					if (";".equals(lastChar) && !groundTruth.contains("for")  && !l2.contains("throw")) {
						if (SelfAPRUtil.getRandomDouble() > 0.4) {
							perturbCode += l2;
						}
					}
				}
				groundTruth += " " + l2;

				// line 3
				lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
				if (!"}".equals(lastChar)) {
					String l3 = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 2).trim();
					if (l3.length() > 0) {

						lastChar = l3.charAt(l3.length() - 1) + "";												
						
						if (!"".equals(perturbCode) && ";".equals(lastChar) && !groundTruth.contains("for") && !l3.contains("throw")) {
							perturbCode += l3;
						}		
						groundTruth += " " + l3;
						lineNo3 = lineNo1 + 2 + "";
						
					}

				}
				
				
				// line 4
				lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
				if (!"}".equals(lastChar)) {
					String l4 = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 3).trim();
					if (l4.length() > 0) {
						lastChar = l4.charAt(l4.length() - 1) + "";																	
						if (!"".equals(perturbCode) && ";".equals(lastChar) && !groundTruth.contains("for") && !l4.contains("throw")) {
							perturbCode += l4;
						}						
						groundTruth += " " + l4;
						lineNo4 = lineNo1 + 3 + "";

						
					}
				}
				
				// line 5
				lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
				if (!"}".equals(lastChar)) {
					String l5 = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 4).trim();
					if (l5.length() > 0) {
						lastChar = l5.charAt(l5.length() - 1) + "";																	
						if(!"{".equals(lastChar)) {
						if (!"".equals(perturbCode) && ";".equals(lastChar) && !groundTruth.contains("for") && !l5.contains("throw")) {
							perturbCode += l5;
						}						
						groundTruth += " " + l5;
						lineNo5 = lineNo1 + 4 + "";

						}
					}
				}	
				
				lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
				if (!"}".equals(lastChar)) {
					String l6 = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 5).trim();
					if (l6.length() > 0) {
						groundTruth += " " + l6;
						}
					}
				
				
				lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
				if (!"}".equals(lastChar)) {
					return;
				}	
				
				
				
				
			}
		 
		//statements
		else {
		 if(!";".equals(lastChar) ) {
			lineNo2 = lineNo1 + 1 + "";
			String l2 = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 1).trim();
			groundTruth += " " + l2;		
		}
		
		
		else if(";".equals(lastChar)  &&  SelfAPRUtil.getRandomDouble() > 0.5) {		
			String l2 = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 1).trim();
			if (l2.length() > 0) {
				lastChar = l2.charAt(l2.length() - 1) + "";
				if (";".equals(lastChar)) {	
					lineNo2 = lineNo1 + 1 + "";
					groundTruth += " " + l2;
					if(SelfAPRUtil.getRandomDouble() > 0.7) {
						perturbCode += l2;
					}
				}
				
				
				
			}							
		}
		 lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";	
		 
		 if(!";".equals(lastChar)) {
				lineNo3 = lineNo1 + 2 + "";
				String l3 = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 2).trim();
				groundTruth += " " + l3;
			} 
		 
		 
		 lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";	
		 if(!";".equals(lastChar)) {
			 return;
		 }
		 
		 
		 
		}
		
		
		

		
		
		 if (type == StatementType.Statement ||type == StatementType.Return||type == StatementType.LocalVariable) {
				P14_Delete_Statement.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,lineNo5);
		 }
		 
			if(type.equals(StatementType.Condition)) {
				if (groundTruth.contains("if")  || groundTruth.contains("else")) {
			 	P15_Unwrap_Block.perturb((CtIfImpl) st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,lineNo5);			
				P16_Remove_Block.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,lineNo5);
				}
			
			}
		 


	}

}
