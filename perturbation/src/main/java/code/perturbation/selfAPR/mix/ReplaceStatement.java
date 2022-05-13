package code.perturbation.selfAPR.mix;

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
import code.perturbation.OperatorPerturbation_bak;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.TypePerturbation;
import code.perturbation.VariablePerturbation;
import code.perturbation.selfAPR.FullyRemove;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
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

	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5, String actionNo) {
		String originGroundTruth = groundTruth;

		TypeFilter<CtReturnImpl> returnfilter = new TypeFilter<CtReturnImpl>(CtReturnImpl.class);
		List<CtReturnImpl> returns = st.getElements(returnfilter);
		double r = SelfAPRUtil.getRandomDouble();

		String perturbCode = null;

		

		/**
		 * variable
		 */
		if (perturbCode == null) {
			List<String> l = VariablePerturbation.perturb(st, groundTruth, 1);
			if (l!=null && l.size() > 0) {
				perturbCode = l.get(SelfAPRUtil.getRandomInt(l.size()));
			}
		} else if (SelfAPRUtil.getRandomDouble() > 0.7) {
			List<String> l = VariablePerturbation.perturb(st, perturbCode, 1);
			if (l!=null && l.size() > 0) {
				String newperturbCode = l.get(SelfAPRUtil.getRandomInt(l.size()));
				if (newperturbCode != null) {
					perturbCode = newperturbCode;
				}
			}
		}

		/**
		 * Invocation
		 */
		if (perturbCode == null) {
			List<String> l = InvocationPerturbation.perturb(st, groundTruth);
			if (l.size()>0) {
				 perturbCode = l.get(SelfAPRUtil.getRandomInt(l.size()));
			}

		} else if (SelfAPRUtil.getRandomDouble() > 0.7) {
			List<String> l = InvocationPerturbation.perturb(st, perturbCode);
			if (l!=null && l.size()>0) {
			String newperturbCode = l.get(SelfAPRUtil.getRandomInt(l.size()));
			if (newperturbCode != null) {
				perturbCode = newperturbCode;
			}
			}
		}

		if (!groundTruth.equals(perturbCode) && perturbCode != null) {
			PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "", lineNo2,
					lineNo3, lineNo4, lineNo5, groundTruth);
		}

	}

}
