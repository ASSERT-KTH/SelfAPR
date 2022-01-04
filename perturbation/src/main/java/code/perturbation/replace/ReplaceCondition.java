package code.perturbation.replace;

import java.util.HashMap;
import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.ConstructorPerturbation;
import code.perturbation.InvocationPerturbation;
import code.perturbation.LiteralPertubation;
import code.perturbation.ModifiersPerturbation;
import code.perturbation.OperatorPerturbation;
import code.perturbation.TypePerturbation;
import code.utils.SUPREUtil;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.Filter;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;
import spoon.support.reflect.code.CtIfImpl;

public class ReplaceCondition {

	public static void perturb(CtElement st, int methStart, int methEnd, String groundTruth, int lineNo1,
			String lineNo2, String lineNo3) {

		String perturbCode = null;
		/**
		 * This is a random number to decide the perturbation
		 */
		double r = SUPREUtil.getRandomDouble();

		/**
		 * Invocation
		 */
		if (perturbCode == null) {
			perturbCode = InvocationPerturbation.perturb(st, groundTruth);
		} 

		/**
		 * operators
		 */
		if (perturbCode == null) {
			perturbCode = OperatorPerturbation.perturb(st, groundTruth);
		} 

		/**
		 * Literal
		 */
		if (perturbCode == null) {
			perturbCode = LiteralPertubation.perturb(st, groundTruth);
		} 
		
		
		//remove && || !
		
		if(SUPREUtil.getRandomDouble()>0.2 && groundTruth.contains("if")) {		
			
			if (perturbCode == null) {
				perturbCode = groundTruth;
			}
		
			/**
			 * 
			 * split condition with &&
			 */
			if(perturbCode.contains("&&") ) {
				// left
				String left  =  perturbCode.split("&&")[0];
				// right
				String right  =  perturbCode.split("&&")[1];
				//end
				String end  =  ") {";
				if(right.contains(")")) {
				 end  =  ")"+right.split("\\)")[1];
				}
				//begin
				String begin  =  left.split("\\(")[0] + "(";

				if(SUPREUtil.getRandomDouble()>0.5) {
				//remove right
				perturbCode = left+end;
				} else {			
				//remove left
				perturbCode = begin+right;
				}			
			}  
				
			/**
			 * 
			 * split condition with &&
			 */
			if(perturbCode.contains("||") ) {
				// left
				String left  =  perturbCode.split("||")[0];
				// right
				String right  =  perturbCode.split("||")[1];
				//end
				String end  =  ") {";
				if(right.contains(")")) {
				 end  =  ")"+right.split("\\)")[1];
				}
				//begin
				String begin  =  left.split("\\(")[0] + "(";

				if(SUPREUtil.getRandomDouble()>0.5) {
				//remove right
				perturbCode = left+end;
				} else {			
				//remove left
				perturbCode = begin+right;
				}			
			}  
			
					
			/**
			 * add remove !
			 */
			if((perturbCode.contains("equals")|| perturbCode.contains("contains"))&& SUPREUtil.getRandomDouble()>0.3) {
				if(perturbCode.contains("!")) {
					perturbCode = perturbCode.replace("!", "");
				}else {
					perturbCode = perturbCode.replace("if (", "if ( !");
				}			
			}
	}else if (groundTruth.contains("else") && groundTruth.contains("if") && (SUPREUtil.getRandomDouble()>0.3||perturbCode == null)) {
		if (perturbCode == null) {
			perturbCode = groundTruth;
		}
		if(SUPREUtil.getRandomDouble()>0.5) {
		perturbCode = perturbCode.replace("else", "");
		}else {
			perturbCode = "else {" + perturbCode.substring(perturbCode.lastIndexOf("{"));
		}
		
		
		
	}
			
			
			
			
			
			
	
		
		
		
		
		
		
		

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("lineNo1", lineNo1 + "");
		map.put("lineNo2", "");
		map.put("lineNo3", "");
		map.put("lineNo4", "");
		map.put("lineNo5", "");
		map.put("line1", perturbCode);
		map.put("line2", "");
		map.put("line3", "");
		map.put("line4", "");
		map.put("line5", "");
		map.put("groundTruth", groundTruth);
		map.put("methodStart", methStart + "");
		map.put("methodEnd", methEnd + "");
		map.put("repairAction", "[REPLACE]");
		System.out.println("replace condition");

		PerturbResult.getCorruptedResult(map);

	}

}
