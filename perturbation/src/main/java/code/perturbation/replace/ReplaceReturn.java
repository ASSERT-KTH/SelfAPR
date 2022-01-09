package code.perturbation.replace;

import java.util.HashMap;
import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.InvocationPerturbation;
import code.perturbation.LiteralPerturbation;
import code.perturbation.OperatorPerturbation;
import code.perturbation.SimilarityPerturbation;
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
			String lineNo2, String lineNo3, String lineNo4,int count) {
		
		String perturbCode = null;
		/**
		 * This is a random number to decide the perturbation
		 */
		double r = SUPREUtil.getRandomDouble();
		
		
		if (groundTruth.contains("return vchecker;")) {
			System.out.print("");
		}

		/**
		 * operators
		 */
		if (perturbCode == null) {
			perturbCode = OperatorPerturbation.perturb(st, groundTruth);
		} else if (SUPREUtil.getRandomDouble() > 0.7) {
			String newperturbCode = OperatorPerturbation.perturb(st, perturbCode);
			if(newperturbCode!=null) {
				perturbCode = newperturbCode;
			}
		}

		/**
		 * Literal
		 */
		if (perturbCode == null) {
			perturbCode = LiteralPerturbation.perturb(st, groundTruth);
		} else if (SUPREUtil.getRandomDouble() > 0.7) {
			String newperturbCode = LiteralPerturbation.perturb(st, perturbCode);
			if(newperturbCode!=null) {
				perturbCode = newperturbCode;
			}
		}
		
		/**
		 * variable
		 */
		if (perturbCode == null) {
			perturbCode = VariablePerturbation.perturb(st, groundTruth);
		} else if (SUPREUtil.getRandomDouble() > 0.7) {
			String newperturbCode = VariablePerturbation.perturb(st, perturbCode);
			if(newperturbCode!=null) {
				perturbCode = newperturbCode;
			}
		}
		
		
		/**
		 * Invocation
		 */
		if (perturbCode == null) {
			perturbCode = InvocationPerturbation.perturb(st, groundTruth);
		}else if (SUPREUtil.getRandomDouble() > 0.7) {
			String newperturbCode = InvocationPerturbation.perturb(st, perturbCode);
			if(newperturbCode!=null) {
				perturbCode = newperturbCode;
			}
		}

		
		/**
		 * similarity perturbation on the single line
		 */
		if("".equals(lineNo2)) {
			if ((groundTruth.equals(perturbCode) || perturbCode==null) || SUPREUtil.getRandomDouble() > 0.8) {
				String newperturbCode = SimilarityPerturbation.perturb(st, groundTruth,"return");
				
				if(newperturbCode!=null && !"".equals(newperturbCode)) {
					perturbCode = newperturbCode+" ;";
				}
				
			}		
		}
		
		
		
		
				
			
		if((groundTruth.equals(perturbCode) || perturbCode==null )  && count<3 ) {
			perturb( st, methStart, methEnd,  groundTruth, lineNo1,
					lineNo2, lineNo3,lineNo4, count+1);
		} else {
			
		HashMap<String, String> map = new HashMap<String, String>();
				
				
		map.put("lineNo1", lineNo1 + "");
		map.put("lineNo2", lineNo2 + "");
		map.put("lineNo3", lineNo3);
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
		map.put("repairAction", "[REPLACE]");
		map.put("targetFile", "");

		System.out.println("replace return");
		PerturbResult.getCorruptedResult(map);	
		
		}	
	}
	
	
	
	
		
}
