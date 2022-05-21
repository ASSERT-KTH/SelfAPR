package code.perturbation.selfAPR.mix;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import code.analysis.AssignmentAnalysis;
import code.analysis.Variables;
import code.output.result.PerturbResult;
import code.perturbation.ConstructorPerturbation;
import code.perturbation.InvocationPerturbation;
import code.perturbation.LiteralPerturbation;
import code.perturbation.ModifiersPerturbation;
import code.perturbation.OperatorPerturbation_bak;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.TypePerturbation;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtFieldReadImpl;
import spoon.support.reflect.code.CtFieldWriteImpl;
import spoon.support.reflect.code.CtVariableReadImpl;
import spoon.support.reflect.code.CtVariableWriteImpl;

public class ReplaceAssignment {

	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth, int lineNo1,
			String lineNo2, String lineNo3,String lineNo4, String lineNo5,double prob,String actionNo) {
		String perturbCode = null;
		String originGroundTruth = groundTruth;

		/**
		 * This is a random number to decide the perturbation
		 */
		double r = SelfAPRUtil.getRandomDouble();

	

		
		
		/**
		 * We try to perturb the literals
		 */

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
				
		


		

		// replace with similar variables
		if (perturbCode == null) {
			List<CtVariableReadImpl> varaibleList = st
					.getElements(new TypeFilter<CtVariableReadImpl>(CtVariableReadImpl.class));
			List assignedList = st.getElements(new TypeFilter<CtVariableWriteImpl>(CtVariableWriteImpl.class));
			if (assignedList.size() == 0) {
				assignedList = st.getElements(new TypeFilter<CtFieldWriteImpl>(CtFieldWriteImpl.class));
			}

			if (varaibleList.size() > 0 && assignedList.size() > 0) {

				String var = SelfAPRUtil.getSimpleVarName(varaibleList.get(0).toString());

				CtElement a = varaibleList.get(0);
				CtElement b = (CtElement) assignedList.get(0);
				String perturbVar = Variables.getRandomVariablesForAssignment(a, b);
				if (perturbVar == null || "".equals(perturbVar)) {
					perturbVar = "null";
				}
				if (groundTruth.contains("=")) {
					String start = groundTruth.split("\\=")[0];
					String end = groundTruth.split("\\=")[1];
					if (end != null) {
						perturbCode = start + "= " + end.replace(var, perturbVar);
					}
				}
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

		// replace type
		if (perturbCode == null) {
			perturbCode = TypePerturbation.perturb(st, groundTruth);
		}

		// remove assignment
		if (perturbCode == null && groundTruth.contains("=")) {
			r = SelfAPRUtil.getRandomDouble();
			if (r > 0.7) {
				perturbCode = groundTruth.split("=")[0] + ";";
			} else if (r > 0.5) {
				perturbCode = groundTruth.split("=")[0] + " = null ;";
			} else {
				perturbCode = groundTruth.split("=")[0] + " =  " + groundTruth.split("=")[0] + ";";
			}

		}
		
		
		if (!groundTruth.equals(perturbCode) && perturbCode != null) {
			PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "",
					lineNo2, lineNo3, lineNo4, lineNo5, groundTruth);
		}
		
		
		
		

	}
} 
