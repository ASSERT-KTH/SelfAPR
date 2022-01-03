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

public class InvocationPerturbation {

	public static String perturb(CtElement st, String groundTruth) {
		double r = SUPREUtil.getRandomDouble();
		String corruptedCode = null;
		if (groundTruth == null) {
			return null;
		}

		System.out.println(groundTruth);

		/**
		 * filter invocation and arguments
		 * 
		 */
		TypeFilter<CtVariableReadImpl> argumentsfilter = new TypeFilter<CtVariableReadImpl>(CtVariableReadImpl.class);
		TypeFilter<CtInvocationImpl> invocationfilter = new TypeFilter<CtInvocationImpl>(CtInvocationImpl.class);
		List<CtVariableReadImpl> arguments = st.getElements(argumentsfilter);
		List<CtInvocationImpl> invocations = st.getElements(invocationfilter);

		if (invocations.size() > 0) {
			int i = SUPREUtil.getRandomInt(invocations.size());
			CtInvocationImpl inv = invocations.get(i);
			CtExecutableReference exc = inv.getExecutable();

			
			
			
			if(SUPREUtil.getRandomDouble() > 0.0) {
				
				String excStr = SUPREUtil.getSimpleExecName(exc.toString());
				String  targetType = MethodSignature.getMethodTypeByName(excStr);
				if(targetType!=null) {
					String  newMethod = MethodSignature . getMethodByType (targetType, excStr);
					String start = groundTruth.split(excStr)[0];
					String end = groundTruth.split("\\)")[1];				
					corruptedCode = start+ " "+newMethod+" "+end;				
					System.out.print("");

				}

				
				
			}
			
			
			// replace invocation with same param

			else if (corruptedCode == null && arguments.size() == 0 || SUPREUtil.getRandomDouble() > 0.3) {

				String excStr = SUPREUtil.getSimpleExecName(exc.toString());
				int argSize = SUPREUtil.getArgsSize(inv);
				String corruptedExe = MethodSignature.getRandomMethodWithSameParam(excStr, argSize);
				corruptedCode = groundTruth.replace(excStr, corruptedExe);
			}

			// replace arguments
			if ((arguments.size() > 0 && SUPREUtil.getRandomDouble() > 0.7) || corruptedCode == null) {
				i = SUPREUtil.getRandomInt(arguments.size() - 1);
				CtVariableReadImpl arg = arguments.get(i);
				String varStr = SUPREUtil.getSimpleVarName(arg.toString());
				String corruptedVar = Variables.getRandomVariables(arg);
				corruptedCode = groundTruth . replace(varStr, corruptedVar);
				} 
			

			if ((arguments.size() > 1 && SUPREUtil.getRandomDouble() > 0.8 && groundTruth.contains(",")) || corruptedCode == null) {
				// minus one argument
				String start;
				String end;
				String mid;

				if (corruptedCode == null) {
					start = groundTruth.split("\\(")[0];
					end = groundTruth.split("\\)")[1];
					mid = groundTruth.split("\\(")[1];
				} else {
					start = corruptedCode.split("\\(")[0];
					end = corruptedCode.split("\\)")[1];
					mid = corruptedCode.split("\\(")[1];
				}

				mid = mid.split("\\)")[0];
				String arg0 = "";
				 i = SUPREUtil.getRandomInt(arguments.size());
				arg0 = arguments.get(i).toString();

				if (mid.contains(arg0 + ",")) {
					mid = mid.replace(arg0 + ",", " ");
				} else if (mid.contains("," + arg0)) {
					mid = mid.replace("," + arg0, " ");
				} else if (mid.contains(arg0 + " ,")) {
					mid = mid.replace(arg0 + " ,", " ");
				} else if (mid.contains(", " + arg0)) {
					mid = mid.replace(", " + arg0, " ");
				} else {
					mid = mid.replace(arg0, " ");
				}
				corruptedCode = start + " ( " + mid + " ) " + end;
			}

			
			
			
			if ((SUPREUtil.getRandomDouble() > 0.9 && arguments.size() > 0) || corruptedCode == null) {
				// add one more parameter

				 i = SUPREUtil.getRandomInt(arguments.size());
				String origin = arguments.get(i).toString();
				origin = SUPREUtil.getSimpleVarName(origin);
				String randomVar = SUPREUtil.getRandomVariable(arguments.get(i));
				if (corruptedCode == null) {
					corruptedCode = groundTruth.replace(origin, origin + ", " + randomVar);
				} else {
					corruptedCode = corruptedCode.replace(origin, origin + ", " + randomVar);
				}
			}
		}

		return corruptedCode;

	}
}
