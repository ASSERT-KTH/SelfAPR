package code.perturbation.replace;

import java.util.HashMap;

import code.output.result.PerturbResult;
import code.perturbation.LiteralPertubation;
import code.perturbation.ModifiersPerturbation;
import code.perturbation.TypePerturbation;
import code.utils.SUPREUtil;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.declaration.CtElement;

public class Replace {

	public static void replace(CtElement st, String type, int methStart, int methEnd) {		

		
		int lineNo1 = st.getPosition().getLine();
		String lineNo2="";
		String lineNo3="";
		String groundTruth = SUPREUtil.getSpecificLine(st.getPosition(), lineNo1);
		if(groundTruth==null) {
			return;
		}
		
		/**
		 * We care about the complete block at most three lines
		 */
		groundTruth=groundTruth.trim();
		
		
		String lastChar = groundTruth.charAt(groundTruth.length()-1)+"";
		if(!";".equals(lastChar) && !"}".equals(lastChar) && !"{".equals(lastChar)){
			 lineNo2 =lineNo1+1+"";
			 groundTruth += " "+SUPREUtil.getSpecificLine(st.getPosition(), lineNo1+1).trim();	
			 lastChar = groundTruth.charAt(groundTruth.length()-1)+"";
			 if(!";".equals(lastChar) && !"}".equals(lastChar) && !"{".equals(lastChar))  {
			 lineNo3= lineNo1+2+"";
			 groundTruth +=" "+SUPREUtil.getSpecificLine(st.getPosition(), lineNo1+2).trim();
			 }
		}
		
		
		
		if( type.contains("declaration")) {
		ReplaceDeclaration.perturb(st,methStart,methEnd, groundTruth,lineNo1,lineNo2,lineNo3);
		}
		
		if(type.contains("condition") ) {
		ReplaceCondition.perturb(st, methStart, methEnd, groundTruth,lineNo1,lineNo2,lineNo3);				
	}
		
		if(type.contains("assignment") ) {
			ReplaceAssignment.perturb(st, methStart, methEnd, groundTruth,lineNo1,lineNo2,lineNo3);				
		}
		
		
		
		
//	else if (type.contains("statement")) {
//		ReplaceStatement.replace(st, type, methStart, methEnd);
//	}
	
		
		
		
	}	
		
	

}
