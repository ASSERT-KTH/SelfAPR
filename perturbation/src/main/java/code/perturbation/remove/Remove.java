package code.perturbation.remove;

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

import code.utils.SUPREUtil;


public class Remove {

	public static void  remove(CtElement st, String type, int methStart, int methEnd) {		
		
		double r = SUPREUtil.getRandomDouble();
		
		
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
			 if(!";".equals(groundTruth.charAt(groundTruth.length()-1)) && !"}".equals(groundTruth.charAt(groundTruth.length()-1)) && !"{".equals(groundTruth.charAt(groundTruth.length()-1)) ) {
			 lineNo3= lineNo1+2+"";
			 groundTruth +=" "+SUPREUtil.getSpecificLine(st.getPosition(), lineNo1+2).trim();
			 }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	partial remove conditions
		if(r>0.8 && type.contains("condition")) {
			FullyRemoveCondBlock.remove(st, type, methStart, methEnd);
		}else if(type.contains("assignment")){
			FullyRemove.remove(st, type, methStart,methEnd, groundTruth, lineNo1,lineNo2,lineNo3);	
		}else if(r>0.4) {
			PartialRemoveCond.remove(st, type, methStart,methEnd);
		} 
		

		
		
		
		
		
		
	
//		fully remove
//		if(r>0.8) {
//		FullyRemoveCond.remove(exp, type, methStart,methEnd);	
//		}
//		
//		

//		
//		
	}
	
	
}
