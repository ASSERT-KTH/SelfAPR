package code.perturbation;

import java.util.List;

import code.analysis.MethodSignature;
import code.analysis.Variables;
import code.utils.SUPREUtil;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtConstructorCallImpl;
import spoon.support.reflect.code.CtInvocationImpl;
import spoon.support.reflect.code.CtVariableReadImpl;

public class ConstructorPerturbation {

	public static String perturb(CtElement st, String groundTruth) {
		double r = SUPREUtil.getRandomDouble();
		String corruptedCode = null;
		if (groundTruth == null) {
			return null;
		}

		System.out.println(groundTruth);
		TypeFilter<CtConstructorCallImpl> constructorfilter = new TypeFilter<CtConstructorCallImpl>(
				CtConstructorCallImpl.class);
		TypeFilter<CtVariableReadImpl> argumentsfilter = new TypeFilter<CtVariableReadImpl>(CtVariableReadImpl.class);
		TypeFilter<CtInvocationImpl> invocationfilter = new TypeFilter<CtInvocationImpl>(CtInvocationImpl.class);

		List<CtConstructorCallImpl> constructors = st.getElements(constructorfilter);
		List<CtVariableReadImpl> arguments = st.getElements(argumentsfilter);
		List<CtInvocationImpl> invocations = st.getElements(invocationfilter);
		CtExecutableReference construct = null;

		if (constructors != null && constructors.size() > 0) {
			CtConstructorCallImpl constructor = constructors.get(0);
			if (constructor != null) {
				construct = constructor.getExecutable();
			}
		}

		// invocations

		if (constructors.size() > 0) {

			CtConstructorCallImpl inv = constructors.get(0);
			List<CtVariableReadImpl> vars = inv.getElements(argumentsfilter);
			CtExecutableReference exc = inv.getExecutable();

			int argSize = SUPREUtil.getArgsSize(inv);

			String excStr = SUPREUtil.getSimpleExecName(exc.toString());

			if (groundTruth.contains(excStr)) {

				String corruptedExe = SimilarityPerturbation.perturb(inv, groundTruth, "constructor", 0.65, null);

				if (corruptedExe != null) {

					int index = groundTruth.indexOf(excStr);
					String before = groundTruth.substring(0, index);
					if (before.contains("new")) {
						before = before.replace("new", "");
					}

					String after = groundTruth.substring(index, groundTruth.length());

					if (after.contains(")")) {
						int c = after.indexOf(")");
						String end = after.substring(c + 1, after.length());
						corruptedCode = before + corruptedExe + end;
					}

				}
			}
		}

		return corruptedCode;

	}
}
