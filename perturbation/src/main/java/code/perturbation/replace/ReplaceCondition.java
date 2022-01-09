package code.perturbation.replace;

import java.util.HashMap;
import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.ConstructorPerturbation;
import code.perturbation.InvocationPerturbation;
import code.perturbation.LiteralPerturbation;
import code.perturbation.ModifiersPerturbation;
import code.perturbation.OperatorPerturbation;
import code.perturbation.TypePerturbation;
import code.perturbation.VariablePerturbation;
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
			String lineNo2, String lineNo3, String lineNo4, int count) {

		String perturbCode = null;
		/**
		 * This is a random number to decide the perturbation
		 */
		double r = SUPREUtil.getRandomDouble();


		
		if (groundTruth.contains("MapperFeature.USE_ANNOTATIONS")){
			System.out.print("");
		}
		
		
		
		
		/**
		 * operators
		 */
		if (perturbCode == null) {
			perturbCode = OperatorPerturbation.perturb(st, groundTruth);
		} else if (SUPREUtil.getRandomDouble() > 0.7) {
			perturbCode = OperatorPerturbation.perturb(st, perturbCode);
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
		 * Variables
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



		
		
		
		
		
		// remove && || !

		if (SUPREUtil.getRandomDouble() > 0.5 && groundTruth.contains("if")) {

			if (perturbCode == null) {
				perturbCode = groundTruth;
			}

			/**
			 * 
			 * split condition with && and ||
			 */
			if (perturbCode.contains("||") || perturbCode.contains("&&")) {
				String sepStr = "";
				if (perturbCode.contains("||")) {
					sepStr = "||";
				} else if (perturbCode.contains("&&")) {
					sepStr = "&&";
				}

				// left
				int sep = perturbCode.indexOf(sepStr);
				String left = (String) perturbCode.subSequence(0, sep) + ")";

				// right
				String right = (String) perturbCode.subSequence(sep + 2, perturbCode.length());

				// begin
				int sep2 = left.indexOf("(");
				String begin = left.substring(0, sep2) + "(";

				// end
				int sepblock = right.indexOf("{");
				int rightlen = right.length();
				if(sepblock>-1 && rightlen>-1) {
				String end = right.substring(sepblock, rightlen);

				if (SUPREUtil.getRandomDouble() > 0.5) {
					// remove right
					perturbCode = left + " " + end;
				} else {
					// remove left
					perturbCode = begin + " " + right;
				}
			}
			}

		}

		/**
		 * add remove !
		 */
		if ((perturbCode == null || groundTruth.equals(perturbCode)) || SUPREUtil.getRandomDouble() > 0.85) {

			if (perturbCode == null || groundTruth.equals(perturbCode)) {
				perturbCode = groundTruth;
			}

			if ((perturbCode.contains("equals") || perturbCode.contains("contains"))) {

				

				if (SUPREUtil.getRandomDouble() > 0.6) {
					if (perturbCode.contains("equals")) {
						perturbCode.replace("equals", "contains");
					} else if (perturbCode.contains("contains")) {
						perturbCode.replace("contains", "equals");
					}

				}

			}
			
		}
		
		
		if(groundTruth.equals(perturbCode))
		if (perturbCode.contains("!")) {
			if (SUPREUtil.getRandomDouble() > 0.4) {
				perturbCode = perturbCode.replace("!", "");
			}
		} else if(!perturbCode.contains("!")  && groundTruth.equals(perturbCode)){
			perturbCode = perturbCode.replace("if (", "if ( !");
		}
		
		

		if (groundTruth.contains("else") && groundTruth.contains("if")
				&& (SUPREUtil.getRandomDouble() > 0.2 || perturbCode == null)) {
			if (perturbCode == null) {
				perturbCode = groundTruth;
			}
			if (SUPREUtil.getRandomDouble() > 0.5) {
				perturbCode = perturbCode.replace("else", "");
			} else {
				String before = perturbCode.split("else")[0];
				perturbCode = before + " else " + perturbCode.substring(perturbCode.indexOf("{"), perturbCode.length());
			}

		}

		
		
		if((groundTruth.equals(perturbCode) || perturbCode==null )  && count<3 ) {
			perturb( st, methStart, methEnd,  groundTruth, lineNo1,
					lineNo2, lineNo3,lineNo4,count+1);
		} else {					
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("lineNo1", lineNo1+"");
		map.put("lineNo2", lineNo2+"");
		map.put("lineNo3", lineNo3+"");
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
		System.out.println("replace condition");

		PerturbResult.getCorruptedResult(map);
		
		}

	}

}
