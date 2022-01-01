package code.perturbation.replace;

import code.perturbation.LiteralPertubation;
import code.utils.SUPREUtil;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.declaration.CtElement;

public class Replace {

	public static void replace(CtElement st, String type, int methStart, int methEnd) {		
//		if(type.contains("cond") ) {
//			ReplaceCond.replace(st, type, methStart, methEnd);				
//		}
//		else if (type.contains("statement")) {
//			ReplaceStatement.replace(st, type, methStart, methEnd);
//		}
		
		
		int lineNo1 = st.getPosition().getLine();
		String lineNo2="";
		String lineNo3="";
		String perturbCode = null;
		String groundTruth = SUPREUtil.getSpecificLine(st.getPosition(), lineNo1);
		if(groundTruth==null) {
			return;
		}
		
		/**
		 * We care about the complete block at most three lines
		 */
		groundTruth=groundTruth.trim();
		
		if(type.contains("declaration")) {
			groundTruth=st.toString();

		}
		
		String lastChar = groundTruth.charAt(groundTruth.length()-1)+"";
		if(!";".equals(lastChar) && !"}".equals(lastChar) && !"{".equals(lastChar)){
			 lineNo2 =lineNo1+1+"";
			 groundTruth +=SUPREUtil.getSpecificLine(st.getPosition(), lineNo1+1).trim();	
			 lastChar = groundTruth.charAt(groundTruth.length()-1)+"";
			 if(!";".equals(groundTruth.charAt(groundTruth.length()-1)) && !"}".equals(groundTruth.charAt(groundTruth.length()-1)) && !"{".equals(groundTruth.charAt(groundTruth.length()-1)) ) {
			 lineNo3= lineNo1+2+"";
			 groundTruth +=SUPREUtil.getSpecificLine(st.getPosition(), lineNo1+2).trim();
			 }
		}
		
		
		/**
		 * This is a random number to decide the perturbation
		 */
		double r = SUPREUtil.getRandomDouble();
		
		
		
		/**
		 * We try to perturb the literals
		 * 
		 */
		
		
		if(r>0.0 && perturbCode==null) {
			perturbCode = LiteralPertubation.perturb(st, groundTruth);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
		
	

}
