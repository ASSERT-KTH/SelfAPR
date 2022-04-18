package code.perturbation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import code.analysis.MethodSignature;
import code.analysis.Variables;
import code.perturbation.utils.SelfAPRUtil;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtFieldReadImpl;
import spoon.support.reflect.code.CtInvocationImpl;
import spoon.support.reflect.code.CtLiteralImpl;
import spoon.support.reflect.code.CtLocalVariableImpl;
import spoon.support.reflect.code.CtVariableReadImpl;
import spoon.support.reflect.code.CtVariableWriteImpl;

public class VariablePerturbation {

	public static String perturb(CtElement st, String groundTruth) {
		List<CtVariableReadImpl> argumentsDuplicates = st
				.getElements(new TypeFilter<CtVariableReadImpl>(CtVariableReadImpl.class));
		List<CtVariableWriteImpl> argumentsWDuplicates = st
				.getElements(new TypeFilter<CtVariableWriteImpl>(CtVariableWriteImpl.class));
		
		List<CtFieldReadImpl> filedsDuplicates = st
				.getElements(new TypeFilter<CtFieldReadImpl>(CtFieldReadImpl.class));
		
		String corruptedCode = null;
		
		
		List<CtElement> allist = new ArrayList();
		
		for(CtVariableReadImpl a : argumentsDuplicates) {
			allist.add(a);
		}
		
		for(CtFieldReadImpl f : filedsDuplicates) {
			allist.add(f);
		}



		  //todo: recursively find arguments
//
//		  TypeFilter<CtInvocationImpl> invocationFilter = new TypeFilter<CtInvocationImpl>(CtInvocationImpl.class);
//		  List<CtInvocationImpl> invocations = st.getElements(invocationFilter);
//		  for(CtInvocationImpl inv : invocations) {
//			  CtExpression targets = inv.getTarget();
//			  List<CtVariableReadImpl> args = inv.getElements(new TypeFilter<CtVariableReadImpl>(CtVariableReadImpl.class));
//			  List<CtFieldReadImpl> fields = inv.getElements(new TypeFilter<CtFieldReadImpl>(CtFieldReadImpl.class));
//			  for(CtVariableReadImpl v : args) {
//				  argumentsDuplicates.add(v);
//			  }
//			  for(CtFieldReadImpl f : fields) {
//				  argumentsDuplicates.add(f);
//			  }
//			  System.out.print("");
//		  }
		  
		  
		  
		  
		  //deduplicate arguments
		  List<CtElement> arguments = new ArrayList<CtElement>(new LinkedHashSet<CtElement>(allist));
		
		  List<CtVariableWriteImpl> argumentsWrite = new ArrayList<CtVariableWriteImpl>(new LinkedHashSet<CtVariableWriteImpl>(argumentsWDuplicates));
		  
		  
		  
		  
		
		// replace argument with the same type argument
		if (allist.size() > 0 ) {
			int i = SelfAPRUtil.getRandomInt(arguments.size());
            int j=i;
			if (allist.size() > 1) {
				while(i==j) {
				i = SelfAPRUtil.getRandomInt(arguments.size());
				}
			}

			CtElement arg = allist.get(i);
			CtElement argAnother = allist.get(j);

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
