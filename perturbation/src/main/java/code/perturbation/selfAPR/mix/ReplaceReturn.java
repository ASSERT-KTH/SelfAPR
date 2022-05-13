package code.perturbation.selfAPR.mix;

import java.util.HashMap;
import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.ConstructorPerturbation;
import code.perturbation.InvocationPerturbation;
import code.perturbation.LiteralPerturbation;
import code.perturbation.OperatorPerturbation_bak;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.VariablePerturbation;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
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

	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth, int lineNo1,
			String lineNo2, String lineNo3, String lineNo4,String lineNo5,double prob,String actionNo) {
		
		String perturbCode = null;
		String originGroundTruth = groundTruth;
		
		
		/**
		 * Invocation
		 */
		if (perturbCode == null) {
			List<String> l = InvocationPerturbation.perturb(st, groundTruth);	
			if (l!=null && l.size()>0) {
			perturbCode = l.get(SelfAPRUtil.getRandomInt(l.size()));
			}
		}else if (SelfAPRUtil.getRandomDouble() > prob) {
				List<String> l = InvocationPerturbation.perturb(st, perturbCode);	
				if (l!=null && l.size()>0) {
				String newperturbCode = l.get(SelfAPRUtil.getRandomInt(l.size()));
				
				if(newperturbCode!=null) {
				perturbCode = newperturbCode;
				}
			}
		}

		/**
		 * operators
		 */
		if (perturbCode == null) {
			perturbCode = OperatorPerturbation_bak.perturb(st, groundTruth);
		} else if (SelfAPRUtil.getRandomDouble() > prob) {
			String newperturbCode = OperatorPerturbation_bak.perturb(st, perturbCode);
			if(newperturbCode!=null) {
				perturbCode = newperturbCode;
			}
		}

		/**
		 * Literal
		 */
		if (perturbCode == null) {
			perturbCode = LiteralPerturbation.perturb(st, groundTruth);
		} else if (SelfAPRUtil.getRandomDouble() > prob) {
			String newperturbCode = LiteralPerturbation.perturb(st, perturbCode);
			if(newperturbCode!=null) {
				perturbCode = newperturbCode;
			}
		}
		
		
		
		/**
		 * constructor
		 */
		if (perturbCode == null) {
			perturbCode = ConstructorPerturbation.perturb(st, groundTruth);
		} else if (SelfAPRUtil.getRandomDouble() > prob) {
			String newperturbCode = ConstructorPerturbation.perturb(st, perturbCode);
			if(newperturbCode!=null) {
				perturbCode = newperturbCode;
			}
		}
		
		
		
		
		/**
		 * variable
		 */
		if (perturbCode == null) {
			List<String> l = VariablePerturbation.perturb(st, groundTruth, 1);		
			if (l.size()>0) {
			perturbCode = l.get(SelfAPRUtil.getRandomInt(l.size()));	
			}
			} else if (SelfAPRUtil.getRandomDouble() > prob) {
				List<String> l = VariablePerturbation.perturb(st, perturbCode, 1);	
				if (l.size()>0) {
				String newperturbCode = l.get(SelfAPRUtil.getRandomInt(l.size()));			if(newperturbCode!=null) {
					perturbCode = newperturbCode;
				}
			}
		}
		
		
		
		
		
		if ((groundTruth.equals(perturbCode) || perturbCode==null) && groundTruth.contains("this")) {
			
			if(!groundTruth.contains("this.")) {
			perturbCode = groundTruth.replace("this", "null");
			}
		}

		
		

		
	
		
		
		
		
				
	
		if (!groundTruth.equals(perturbCode) && perturbCode != null) {
			PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "",
					lineNo2, lineNo3, lineNo4, lineNo5, groundTruth);
		}	
	}
	
	
	
	
		
}
