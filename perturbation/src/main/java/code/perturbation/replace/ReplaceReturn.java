package code.perturbation.replace;

import java.util.HashMap;
import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.InvocationPerturbation;
import code.perturbation.LiteralPerturbation;
import code.perturbation.OperatorPerturbation;
import code.perturbation.VariablePerturbation;
import code.utils.SUPREUtil;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;
import spoon.support.reflect.code.CtInvocationImpl;
import spoon.support.reflect.code.CtReturnImpl;
import spoon.support.reflect.code.CtVariableReadImpl;

public class ReplaceReturn {

	public static void perturb(CtElement st, int methStart, int methEnd, String groundTruth, int lineNo1,
			String lineNo2, String lineNo3, int count) {
		
		String perturbCode = null;
		/**
		 * This is a random number to decide the perturbation
		 */
		double r = SUPREUtil.getRandomDouble();
		
		
		if (groundTruth.contains("if  ( noType )  {")) {
			System.out.print("");
		}

		/**
		 * Invocation
		 */
		if (perturbCode == null && r>0.4) {
			perturbCode = InvocationPerturbation.perturb(st, groundTruth);
		}

		/**
		 * operators
		 */
		if (perturbCode == null) {
			perturbCode = OperatorPerturbation.perturb(st, groundTruth);
		} else if (SUPREUtil.getRandomDouble() > 0.6) {
			perturbCode = OperatorPerturbation.perturb(st, perturbCode);
		}

		/**
		 * Literal
		 */
		if (perturbCode == null) {
			perturbCode = LiteralPerturbation.perturb(st, groundTruth);
		} else if (SUPREUtil.getRandomDouble() > 0.5) {
			perturbCode = LiteralPerturbation.perturb(st, perturbCode);
		}
		
		/**
		 * variable
		 */
		if (perturbCode == null) {
			perturbCode = VariablePerturbation.perturb(st, groundTruth);
		} else if (SUPREUtil.getRandomDouble() > 0.9) {
			perturbCode = VariablePerturbation.perturb(st, perturbCode);
		}
		
		
				
			
		if((groundTruth.equals(perturbCode) || perturbCode==null )  && count<3 ) {
			perturb( st, methStart, methEnd,  groundTruth, lineNo1,
					lineNo2, lineNo3,count+1);
		} else {
			
		HashMap<String, String> map = new HashMap<String, String>();
				
				
		map.put("lineNo1", lineNo1 + "");
		map.put("lineNo2", lineNo2 + "");
		map.put("lineNo3", lineNo3);
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
		map.put("targetFile", "");

		System.out.print("replace return");
		PerturbResult.getCorruptedResult(map);	
		
		}	
	}
	
	
	
	
		
}
