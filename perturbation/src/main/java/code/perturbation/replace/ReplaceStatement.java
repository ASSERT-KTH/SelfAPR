package code.perturbation.replace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import code.analysis.MethodSignature;
import code.analysis.StatementAnalysis;
import code.analysis.Variables;
import code.output.result.PerturbResult;
import code.perturbation.ConstructorPerturbation;
import code.perturbation.InvocationPerturbation;
import code.perturbation.LiteralPerturbation;
import code.perturbation.OperatorPerturbation;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.TypePerturbation;
import code.perturbation.VariablePerturbation;
import code.perturbation.remove.FullyRemove;
import code.utils.SUPREUtil;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;
import spoon.support.reflect.code.CtConstructorCallImpl;
import spoon.support.reflect.code.CtFieldReadImpl;
import spoon.support.reflect.code.CtIfImpl;
import spoon.support.reflect.code.CtLiteralImpl;
import spoon.support.reflect.code.CtReturnImpl;
import spoon.support.reflect.code.CtVariableReadImpl;
import spoon.support.reflect.declaration.CtConstructorImpl;
import spoon.support.reflect.reference.CtExecutableReferenceImpl;

public class ReplaceStatement {

	public static void perturb(CtElement st,  int methStart, int methEnd, String groundTruth, int lineNo1,
			String lineNo2, String lineNo3, String lineNo4, int count) {

		TypeFilter<CtReturnImpl> returnfilter = new TypeFilter<CtReturnImpl>(CtReturnImpl.class);
		List<CtReturnImpl> returns = st.getElements(returnfilter);
		double r = SUPREUtil.getRandomDouble();

		String perturbCode = null;

		if( groundTruth.contains("try")) {
			groundTruth.contains("bb.release");
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
				System.out.print("");
				String newperturbCode = SimilarityPerturbation.perturb(st, groundTruth,"statement",0.75,null);
				System.out.print("");
				if(newperturbCode!=null) {

				newperturbCode =  newperturbCode.replace("\r", " ");
				newperturbCode =  newperturbCode.replace("\n", " ");
				
				if(newperturbCode!=null && !"".equals(newperturbCode)) {
					perturbCode = newperturbCode+" ;";
				}
				}

			}		
		}
		
		
		/**
		 * check if the perturbation fails,we iteratively perturb until the count
		 */
		if((groundTruth.equals(perturbCode) || perturbCode==null )  && count<3 ) {
			perturb( st, methStart, methEnd,  groundTruth, lineNo1,
					lineNo2, lineNo3,lineNo4, count+1);
		} else if(!(groundTruth.equals(perturbCode) && perturbCode!=null )){		

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("lineNo1", lineNo1 + "");
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
		System.out.println("replace STATEMENT");

		PerturbResult.getCorruptedResult(map);
		

		}
		


	}

}
