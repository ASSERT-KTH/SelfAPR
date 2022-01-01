package code.perturbation;

import java.util.List;

import code.analysis.MethodSignature;
import code.utils.SUPREUtil;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtConstructorCallImpl;
import spoon.support.reflect.code.CtInvocationImpl;
import spoon.support.reflect.code.CtVariableReadImpl;

public class InvocationPerturbation {

	public static String perturb(CtCodeElement st,String groundTruth)  {
		System.out.println("...perturbing Invocation......perturbing Invocation.....perturbing Invocation.........");
		double r = SUPREUtil.getRandomDouble();
		String corruptedCode = null;
		if(groundTruth==null) {
			return null;
		}
		
		System.out.println(groundTruth);
		
		/**filter invocation and arguments
		 * 
		 */
		TypeFilter<CtVariableReadImpl> argumentsfilter = new TypeFilter<CtVariableReadImpl>(
				CtVariableReadImpl.class);
		TypeFilter<CtInvocationImpl> invocationfilter = new TypeFilter<CtInvocationImpl>(
				CtInvocationImpl.class);
		List<CtVariableReadImpl> arguments = st.getElements(argumentsfilter);
		List<CtInvocationImpl> invocations = st.getElements(invocationfilter);
		

		if(invocations.size()>0) {
			int i = SUPREUtil.getRandomInt(invocations.size());
			CtInvocationImpl inv = invocations.get(i);			
			CtExecutableReference exc= inv.getExecutable();
			
			String excStr = SUPREUtil.getSimpleExecName(exc.toString());
			int argSize = SUPREUtil.getArgsSize(inv);

			
			String corruptedExe = MethodSignature.getRandomMethodWithSameParam(excStr,argSize);

		
			corruptedCode = groundTruth.replace(excStr, corruptedExe);

		
		}
		
		
		
		
		return corruptedCode;

		

	}		
}
