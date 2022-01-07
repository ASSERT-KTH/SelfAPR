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

	public static String perturb(CtElement st,String groundTruth)  {
		double r = SUPREUtil.getRandomDouble();
		String corruptedCode = null;
		if(groundTruth==null) {
			return null;
		}
		
		System.out.println(groundTruth);
		TypeFilter<CtConstructorCallImpl> constructorfilter = new TypeFilter<CtConstructorCallImpl>(
				CtConstructorCallImpl.class);
		TypeFilter<CtVariableReadImpl> argumentsfilter = new TypeFilter<CtVariableReadImpl>(
				CtVariableReadImpl.class);
		TypeFilter<CtInvocationImpl> invocationfilter = new TypeFilter<CtInvocationImpl>(
				CtInvocationImpl.class);
		
		
		
		List<CtConstructorCallImpl> constructors = st.getElements(constructorfilter);
		List<CtVariableReadImpl> arguments = st.getElements(argumentsfilter);
		List<CtInvocationImpl> invocations = st.getElements(invocationfilter);
		CtExecutableReference construct =  null;
		
		if(constructors!=null && constructors.size()>0) {
		CtConstructorCallImpl constructor = constructors.get(0);		
		if(constructor!=null) {
			construct = constructor.getExecutable();
		}
		}
		
		
	//invocations
		
	if( constructors.size()>0) {


		int i = SUPREUtil.getRandomInt(constructors.size());
		CtConstructorCallImpl inv = constructors.get(i);
		List<CtVariableReadImpl> vars= inv.getElements(argumentsfilter);
		CtExecutableReference exc= inv.getExecutable();
		
		
		int argSize = SUPREUtil.getArgsSize(inv);
		
		String excStr = SUPREUtil.getSimpleExecName(exc.toString());
		
		String corruptedExe = MethodSignature.getRandomClass(excStr);
		
		if(groundTruth.contains(excStr)) {
		corruptedCode = groundTruth.replace(excStr, corruptedExe);
		
		if(vars.size()>0 && SUPREUtil.getRandomDouble()>0.5) {
			CtVariableReadImpl ctv = vars.get(SUPREUtil.getRandomInt(vars.size()));
			String ctvStr = SUPREUtil.getSimpleVarName(ctv.toString());
			String randomVar = Variables.getRandomVariables(ctv);
			corruptedCode = corruptedCode.replace(ctvStr, randomVar);
		} 		
		
		}
	}
		
		
	//arguments	
	else if(r>0.6 && arguments.size()>1) {
			//1. switch the positions of arguments
			if(groundTruth.contains("(") && groundTruth.contains(")")) {
			String start = groundTruth.split("\\(")[0];
			String end = groundTruth.split("\\)")[1];
			String mid = groundTruth.split("\\(")[1];
			mid = mid.split("\\)")[0];
			String arg0="";
			String arg1="";
			int max = arguments.size();
			int i = SUPREUtil.getRandomInt(max);
			arg0= arguments.get(i).toString();
			if(i>0) {
				arg1= arguments.get(i-1).toString();
			}else {
				arg1= arguments.get(i+1).toString();
			}
				
			arg0 =  SUPREUtil.getSimpleVarName(arg0);
			arg1 =  SUPREUtil.getSimpleVarName(arg1);		
			String arg1tmp = arg1+"tmp";

			mid = mid.replace(arg1, arg1tmp);
			mid = mid.replace(arg0, arg1);
			mid = mid.replace(arg1tmp, arg0);
			
			corruptedCode = start+" ( "+mid+" ) "+end;
			}
					
		} else if(r>0.5 && arguments.size()>0) {	
			//2. replace with different arguments
			int i = SUPREUtil.getRandomInt(arguments.size());
			String origin = arguments.get(i).toString();
			if(groundTruth.contains(origin))

			origin = SUPREUtil.getSimpleVarName(origin);
			String randomVar = Variables.getRandomVariables(arguments.get(i));
			if(randomVar!=null &&!"".equals(randomVar) ) {
			corruptedCode = groundTruth.replace(origin, randomVar);	
			}
		}
		
			
		else if(r>0.2 && arguments.size()>1 && invocations.size()>0 && groundTruth.contains(",")) {
			//2. minus one argument

			
			String start = groundTruth.split("\\(")[0];
			String end = groundTruth.split("\\)")[1];
			String mid = groundTruth.split("\\(")[1];
			mid = mid.split("\\)")[0];
			String arg0="";
			int max = arguments.size();
			int i = SUPREUtil.getRandomInt(max);
			arg0= arguments.get(i).toString();
			
			if (mid.contains(arg0+",")) {
				mid = mid.replace(arg0+","," ");
			}else if  (mid.contains(","+ arg0)) {
				mid = mid.replace(","+ arg0, " ");
			} 
			else if (mid.contains(arg0+" ,")) {
				mid = mid.replace(arg0+" ,"," ");
			} else if  (mid.contains(", "+ arg0)) {
				mid = mid.replace(", "+ arg0, " ");
			} else {
				mid = mid.replace(arg0, " ");
			}
			
			
			corruptedCode = start+" ( "+mid+" ) "+end;
			
		}
		
		
		else if(r>0.2 && arguments.size()>0) {	
			//3. replace with overloaded constructor
			int i = SUPREUtil.getRandomInt(arguments.size());
			String origin = arguments.get(i).toString();
			origin = SUPREUtil.getSimpleVarName(origin);
			String randomVar = Variables.getRandomVariables(arguments.get(i));
			corruptedCode = groundTruth.replace(origin, origin+", "+randomVar);			
		}
		
		
		
		else if (arguments.size()>0) {
			//4. mix replace constructor and arguments
			if(construct!=null) {
			String executableStr = SUPREUtil.getSimpleExecName(construct.toString());
			String newConstruct = MethodSignature.getRandomClass(executableStr);
			corruptedCode = groundTruth.replace(executableStr, newConstruct);
			
			int i = SUPREUtil.getRandomInt(arguments.size());
			String origin = arguments.get(i).toString();
			origin = SUPREUtil.getSimpleVarName(origin);
			String randomVar = Variables.getRandomVariables(arguments.get(i));
			corruptedCode = corruptedCode.replace(origin, origin+", "+randomVar);			
			}
		} 	
	
		
		else {
			//5. replace constructor
			if(construct!=null) {
			String executableStr = SUPREUtil.getSimpleExecName(construct.toString());
			String newConstruct = MethodSignature.getRandomClass(executableStr);
			corruptedCode = groundTruth.replace(executableStr, newConstruct);
			System.out.print("");
			}
		}
		
				
	
		return corruptedCode;
	}
}
