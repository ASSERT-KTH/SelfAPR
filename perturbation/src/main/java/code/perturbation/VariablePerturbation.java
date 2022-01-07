package code.perturbation;

import java.util.List;

import code.analysis.MethodSignature;
import code.analysis.Variables;
import code.utils.SUPREUtil;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtVariableReadImpl;

public class VariablePerturbation {

	public static String perturb(CtElement st, String groundTruth) {
		List<CtVariableReadImpl> arguments = st
				.getElements(new TypeFilter<CtVariableReadImpl>(CtVariableReadImpl.class));
		String corruptedCode = null;

		// replace argument with the same type argument
		if (arguments.size() > 0 && SUPREUtil.getRandomDouble() > 0.3) {
			int i = SUPREUtil.getRandomInt(arguments.size());

			if (i == 0 && arguments.size() > 1) {
				i = SUPREUtil.getRandomInt(arguments.size());
			}

			CtVariableReadImpl arg = arguments.get(i);
			String varStr = SUPREUtil.getSimpleVarName(arg.toString());

			if (groundTruth.contains(" " + varStr)) {
				
				String corruptedVar = Variables.getRandomVariables(arg);

				if (corruptedVar != null && !"".equals(corruptedVar)) {
					corruptedCode = groundTruth.replaceFirst(" " + varStr, corruptedVar);
				}
			}
		}

		return corruptedCode;
	}
}
