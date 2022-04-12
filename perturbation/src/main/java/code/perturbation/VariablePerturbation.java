package code.perturbation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import code.analysis.MethodSignature;
import code.analysis.Variables;
import code.perturbation.utils.SelfAPRUtil;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtLocalVariableImpl;
import spoon.support.reflect.code.CtVariableReadImpl;
import spoon.support.reflect.code.CtVariableWriteImpl;

public class VariablePerturbation {

	public static String perturb(CtElement st, String groundTruth) {
		List<CtVariableReadImpl> argumentsDuplicates = st
				.getElements(new TypeFilter<CtVariableReadImpl>(CtVariableReadImpl.class));
		List<CtVariableWriteImpl> argumentsWDuplicates = st
				.getElements(new TypeFilter<CtVariableWriteImpl>(CtVariableWriteImpl.class));
		
		
		String corruptedCode = null;

		  List<CtVariableReadImpl> arguments = new ArrayList<CtVariableReadImpl>(new LinkedHashSet<CtVariableReadImpl>(argumentsDuplicates));
		
		  List<CtVariableWriteImpl> argumentsWrite = new ArrayList<CtVariableWriteImpl>(new LinkedHashSet<CtVariableWriteImpl>(argumentsWDuplicates));

		
		// replace argument with the same type argument
		if (arguments.size() > 0 ) {
			int i = SelfAPRUtil.getRandomInt(arguments.size());
            int j=i;
			if (arguments.size() > 1) {
				while(i==j) {
				i = SelfAPRUtil.getRandomInt(arguments.size());
				}
			}

			CtVariableReadImpl arg = arguments.get(i);
			CtVariableReadImpl argAnother = arguments.get(j);

			String varStr = SelfAPRUtil.getSimpleVarName(arg.toString());

			if (groundTruth.contains(" " + varStr) || groundTruth.contains( varStr+" " ) ) {
				
				String corruptedVar = Variables.getRandomVariablesForAssignment(arg,argAnother);

				if (corruptedVar != null && !"".equals(corruptedVar)) {
					if(groundTruth.contains(" " + varStr)) {
					corruptedCode = groundTruth.replaceFirst(" " + varStr, " "+corruptedVar);
					} else {
						corruptedCode = groundTruth.replaceFirst(varStr+" " , corruptedVar+" ");
					}
				}
			}
		}

		return corruptedCode;
	}
}
