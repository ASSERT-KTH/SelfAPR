package code.perturbation;

import java.util.List;

import code.analysis.MethodSignature;
import code.analysis.Variables;
import code.utils.SUPREUtil;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtConstructorCallImpl;
import spoon.support.reflect.code.CtInvocationImpl;
import spoon.support.reflect.code.CtVariableReadImpl;

public class InvocationPerturbation {

	public static String perturb(CtElement st, String groundTruth) {
		double r = SUPREUtil.getRandomDouble();
		String corruptedCode = null;
		if (groundTruth == null) {
			return null;
		}

		/**
		 * filter invocation and arguments
		 * 
		 */
		TypeFilter<CtVariableReadImpl> argumentsfilter = new TypeFilter<CtVariableReadImpl>(CtVariableReadImpl.class);
		TypeFilter<CtInvocationImpl> invocationfilter = new TypeFilter<CtInvocationImpl>(CtInvocationImpl.class);
		List<CtInvocationImpl> invocations = st.getElements(invocationfilter);

		if (invocations.size() > 0) {
			CtInvocationImpl inv = invocations.get(0);
			CtExecutableReference exc = inv.getExecutable();
			List<CtVariableReadImpl> arguments = inv.getElements(argumentsfilter);

			// replace the overloaded method
			if (r > 0.2) {
				String excStr = SUPREUtil.getSimpleExecName(exc.toString());
				int argSize = SUPREUtil.getArgsSize(inv);
				if (groundTruth.contains(excStr)) {
					String newMethod = MethodSignature.getOverridingMethods(excStr, argSize);

					if (newMethod != null && !"".equals(newMethod)) {
						if (newMethod != null && !"".equals(newMethod)) {
							String start = groundTruth.split(excStr)[0];
							String later = groundTruth.split(excStr)[1];
							String end = "";
							int lst = later.indexOf(")");
							if(later.length()> 2 && lst>2) {
							String check = later.substring(2, lst);
							if (check.contains("(")) {
								lst = later.indexOf(")");
								later = later.substring(lst + 1, later.length());
								lst = later.indexOf(")");
							} 
							}

							end = (String) later.subSequence(lst + 1, later.length());

							corruptedCode = start + " " + newMethod + " " + end;
							System.out.print("");
						}

					}
				}
			}

			// replace invocation method that returns the same type

			if (SUPREUtil.getRandomDouble() > 0.75 || corruptedCode == null) {

				if (corruptedCode != null && SUPREUtil.getRandomDouble() > 0.5) {
					groundTruth = corruptedCode;
				}

				String excStr = SUPREUtil.getSimpleExecName(exc.toString());
				String targetType = MethodSignature.getMethodTypeByName(excStr);
				if (targetType != null && groundTruth.contains(excStr)) {
					String newMethod = MethodSignature.getMethodByType(targetType, excStr);
					if (newMethod != null && !"".equals(newMethod)) {
						
						
						String start = groundTruth.split(excStr)[0];
						String later = groundTruth.split(excStr)[1];
						String end = "";
						int lst = later.indexOf(")");
						String check = later.substring(2, lst);
						if(later.length()> 2 && lst>2) {
						if (check.contains("(")) {
							lst = later.indexOf(")");
							later = later.substring(lst + 1, later.length());
							lst = later.indexOf(")");
						}}

						end = (String) later.subSequence(lst + 1, later.length());

						corruptedCode = start + " " + newMethod + " " + end;
						
											
						System.out.print("");
					}
				}
			}

	

			// replace argument with the same type invocation

			if ((arguments.size() > 0 && SUPREUtil.getRandomDouble() > 0.8)
					|| (arguments.size() > 0 && corruptedCode == null)) {

				int i = SUPREUtil.getRandomInt(arguments.size());
				if (i == 0 && arguments.size() > 1) {
					i = arguments.size() - 1;
				}
				CtVariableReadImpl arg = arguments.get(i);

				if (corruptedCode != null && SUPREUtil.getRandomDouble() > 0.5) {
					groundTruth = corruptedCode;
				}

				if (groundTruth.contains(arg.toString())) {
					String varStr = SUPREUtil.getSimpleVarName(arg.toString());
					CtTypeReference type = arg.getType();
					if(groundTruth.contains(" "+varStr)) {
					String typeStr = SUPREUtil.getSimpleVarName(type.toString());
					String corruptedVar = MethodSignature.getMethodByType(typeStr, null);
					if (corruptedVar != null && !"".equals(corruptedVar)) {
						corruptedCode = groundTruth.replaceFirst(" "+varStr, corruptedVar);
					}
					}
				}
			}

			// replace invocation with most similar method name in literature and same
			// parameters

			if (corruptedCode == null && SUPREUtil.getRandomDouble() > 0.6) {
				String excStr = SUPREUtil.getSimpleExecName(exc.toString());
				int argSize = SUPREUtil.getArgsSize(inv);
				String corruptedExe = MethodSignature.getRandomMethodWithSameParam(excStr, argSize);
				if (corruptedExe != null && excStr != null && !"".equals(corruptedExe)) {
					corruptedCode = groundTruth.replace(excStr, corruptedExe);
				}
			}
		}

		return corruptedCode;

	}
}
