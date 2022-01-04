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
			int i = SUPREUtil.getRandomInt(invocations.size());
			CtInvocationImpl inv = invocations.get(i);
			CtExecutableReference exc = inv.getExecutable();
			List<CtVariableReadImpl> arguments = inv.getElements(argumentsfilter);

			
			
			
			if(SUPREUtil.getRandomDouble() > 0.2) {
				
				String excStr = SUPREUtil.getSimpleExecName(exc.toString());
				String  targetType = MethodSignature.getMethodTypeByName(excStr);
				if(targetType!=null) {
					String  newMethod = MethodSignature . getMethodByType (targetType, excStr);
					if(newMethod!=null && "".equals(newMethod)) {
					String start = groundTruth.split(excStr)[0];
					int lst = groundTruth.lastIndexOf(")");
					String end = (String) groundTruth.subSequence(lst, groundTruth.length()-1);

					corruptedCode = start+ " "+newMethod+" "+end;				
					System.out.print("");
					}
				}

				
				
			}
			
			
			// replace invocation with same param

			else if (corruptedCode == null || SUPREUtil.getRandomDouble() > 0.85 ) {
				String excStr = SUPREUtil.getSimpleExecName(exc.toString());
				int argSize = SUPREUtil.getArgsSize(inv);
				String corruptedExe = MethodSignature.getRandomMethodWithSameParam(excStr, argSize);
				if(corruptedExe!=null &&excStr!=null &&  !"".equals(corruptedExe)) {
				corruptedCode = groundTruth.replace(excStr, corruptedExe);
				}
			}

			
			// replace argument with the same type argument
			if ((arguments.size() > 0 && SUPREUtil.getRandomDouble() > 0.7) || (arguments.size() > 0 && corruptedCode == null)) {
				i = SUPREUtil.getRandomInt(arguments.size() );
				if (i==0 && arguments.size()>1) {
					i = arguments.size()-1;
				}
					

				CtVariableReadImpl arg = arguments.get(i);
				String varStr = SUPREUtil.getSimpleVarName(arg.toString());
				String corruptedVar = Variables.getRandomVariables(arg);
				if(corruptedVar!=null && !"".equals(corruptedVar)) {
				corruptedCode = groundTruth . replaceFirst(varStr, corruptedVar);
				}
				} 
			
			
			// replace argument with the same type invocation

			if ((arguments.size() > 0 && SUPREUtil.getRandomDouble() > 0.7) || (arguments.size() > 0 && corruptedCode == null)) {
				i = SUPREUtil.getRandomInt(arguments.size());
				
				if (i==0 && arguments.size()>1) {
					i = arguments.size()-1;
				}
				
				CtVariableReadImpl arg = arguments.get(i);
				String varStr = SUPREUtil.getSimpleVarName(arg.toString());			
				CtTypeReference type = arg.getType();		
				String typeStr = SUPREUtil.getSimpleVarName(type.toString());	
				String corruptedVar =  MethodSignature . getMethodByType (typeStr, null);
				if(corruptedVar!=null && !"".equals(corruptedVar)) {
				corruptedCode = groundTruth .replaceFirst(varStr, corruptedVar);
				}
				} 
			
			
			
			

			if ((arguments.size() > 1 && SUPREUtil.getRandomDouble() > 0.85 && groundTruth.contains(",")) || (arguments.size() > 1 && corruptedCode == null)) {
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

			
			
			
			if ((SUPREUtil.getRandomDouble() > 0.9 && arguments.size() > 0) || (arguments.size() > 0 && corruptedCode == null)) {
				// add one more parameter
				 i = SUPREUtil.getRandomInt(arguments.size());
				String origin = arguments.get(i).toString();
				origin = SUPREUtil.getSimpleVarName(origin);
				String randomVar = SUPREUtil.getRandomVariable(arguments.get(i));
				
				if(randomVar!=null && !"".equals(randomVar)) {
				if (corruptedCode == null) {
					corruptedCode = groundTruth.replace(origin, origin + ", " + randomVar);
				} else {
					corruptedCode = corruptedCode.replace(origin, origin + ", " + randomVar);
				}
				}
			}
		}

		return corruptedCode;

	}
}
