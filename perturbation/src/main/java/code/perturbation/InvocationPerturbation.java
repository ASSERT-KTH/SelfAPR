package code.perturbation;

import java.util.List;

import code.analysis.ExecutableAnalysis;
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
		List<CtInvocationImpl> invocations = st.getElements(new TypeFilter<CtInvocationImpl>(CtInvocationImpl.class));

		if (invocations.size() > 0) {
			CtInvocationImpl inv = invocations.get(SUPREUtil.getRandomInt(invocations.size()));
			CtExecutableReference exc = inv.getExecutable();
			// com.fasterxml.jackson.databind.BeanDescription#getClassInfo()
			List<CtVariableReadImpl> arguments = inv
					.getElements(new TypeFilter<CtVariableReadImpl>(CtVariableReadImpl.class));

			// replace the overloaded method

			String excStr = SUPREUtil.getSimpleExecName(exc.toString());
			int argSize = SUPREUtil.getArgsSize(inv);
			if (groundTruth.contains("."+excStr)) {
				
				if(SUPREUtil.getRandomDouble()>0.3) {
					System.out.print("");

					String newMethod   = ExecutableAnalysis.getRandomExecWithSameParam(exc.toString(),argSize);
					if(newMethod!=null && !"".equals(newMethod)  && !" ".equals(newMethod)) {				
					corruptedCode = groundTruth.replaceFirst("."+excStr, "."+newMethod);
					System.out.print("");
					}
				
				
				} else {
				String newMethod = MethodSignature.getOverridingMethods(excStr, argSize);

				if (newMethod != null && !"".equals(newMethod)) {
					if (newMethod != null && !"".equals(newMethod)) {
						String start = groundTruth.split("."+excStr)[0];
						String later = groundTruth.split("."+excStr)[1];
						String end = "";
						int lst = later.indexOf(")");
						if (later.length() > 2 && lst > 2) {
							String check = later.substring(2, lst);
							if (check.contains("(")) {
								lst = later.indexOf(")");
								later = later.substring(lst + 1, later.length());
								lst = later.indexOf(")");
							}
						}

						end = (String) later.subSequence(lst + 1, later.length());

						corruptedCode = start + " " + "."+newMethod + " " + end;
						System.out.print("");
					}

				}
			}
			}
		}
		return corruptedCode;
	}

}
