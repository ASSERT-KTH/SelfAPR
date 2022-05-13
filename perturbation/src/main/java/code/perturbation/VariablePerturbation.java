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
import spoon.reflect.declaration.CtTypedElement;
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

	//case 1 : replace; case 2: remove; case 3: swap;
	public static List<String> perturb(CtElement st, String groundTruth, Integer cases) {
		
		List<CtVariableReadImpl> argumentsDuplicates = st
				.getElements(new TypeFilter<CtVariableReadImpl>(CtVariableReadImpl.class));
		List<CtLocalVariableImpl> argumentsWDuplicates = st
				.getElements(new TypeFilter<CtLocalVariableImpl>(CtLocalVariableImpl.class));
		
		
		List<CtFieldReadImpl> filedsDuplicates = st
				.getElements(new TypeFilter<CtFieldReadImpl>(CtFieldReadImpl.class));
		
		List<String> corruptedCodeList = new ArrayList();
		
		
		List<CtElement> allist = new ArrayList();
		
		for(CtVariableReadImpl a : argumentsDuplicates) {
			allist.add(a);
		}
		
		for(CtFieldReadImpl f : filedsDuplicates) {
			allist.add(f);
		}
	  
		  
		  //deduplicate arguments
		  List<CtElement> arguments = new ArrayList<CtElement>(new LinkedHashSet<CtElement>(allist));
		
		  List<CtLocalVariableImpl> argumentsWrite = new ArrayList<CtLocalVariableImpl>(new LinkedHashSet<CtLocalVariableImpl>(argumentsWDuplicates));
		  
		  
		  
		  
		
		// replace argument with the same type argument
		if (arguments.size() > 0 && cases==1) {
			
			for(int i = 0; i<arguments.size(); i ++) {
			String corruptedCode = null;
            int j=i;
            
            if(((CtTypedElement) arguments.get(i)).getType()==null) {
				return null;
			}
			String typei = ((CtTypedElement) arguments.get(i)).getType().toString();
			
			if (arguments.size() > 1) {
				
	            int count=0;
	            boolean typeEquals=false;
				while((i==j||!typeEquals) && count<10 ) {
					count++;
					j = SelfAPRUtil.getRandomInt(arguments.size());
					if(((CtTypedElement) arguments.get(j)).getType()!=null) {
					String typej = ((CtTypedElement) arguments.get(j)).getType().toString();
					if(typei.equals(typej)) {
						typeEquals=true;
					}
					}
				} 
				
				while(i==j) {
					j = SelfAPRUtil.getRandomInt(arguments.size());
				}
				
			}
			
			
			

			CtElement arg = arguments.get(i);
			Object argAnother = arguments.get(j);
			
			if(argumentsWrite.size()>0) {
				 argAnother = argumentsWrite.get(0).getSimpleName();
			}
			

			String varStr = SelfAPRUtil.getSimpleVarName(arg.toString());
			

			if (groundTruth.contains(" " + varStr) || groundTruth.contains( varStr+" " ) ) {
				
				String corruptedVar = Variables.getRandomVariablesForAssignment(arg,argAnother);

				if (corruptedVar != null && !"".equals(corruptedVar)) {
					if(groundTruth.contains(" " + varStr)) {
					corruptedCode = groundTruth.replaceFirst(" " + varStr, " "+corruptedVar);
					} else {
						corruptedCode = groundTruth.replaceFirst(varStr+" " , corruptedVar+" ");
					}
					corruptedCodeList.add(corruptedCode);
				}
			}
		} 

		}
	
	
	//remove
	else if(arguments.size() > 1  && cases==2 ) {
		
		for(int i = 0; i<arguments.size(); i ++) {
			String corruptedCode = null;
			//remove last one
			CtElement arg = arguments.get(i);
			String varStr = SelfAPRUtil.getSimpleVarName(arg.toString());
			if(groundTruth.contains(varStr+",")) {
			corruptedCode = groundTruth.replaceFirst(varStr+"," , "");
			corruptedCodeList.add(corruptedCode);
			} else if(groundTruth.contains(", "+varStr)) {
				corruptedCode = groundTruth.replaceFirst(", "+varStr, "");
				corruptedCodeList.add(corruptedCode);
			}			
		}
			
	}
			
	//swap
		else if(arguments.size() > 1 && cases==3) {
			for(int i = 0; i<arguments.size(); i ++) {
			String corruptedCode = null;
			if(((CtTypedElement) arguments.get(i)).getType()==null) {
				return null;
			}
			String typei = ((CtTypedElement) arguments.get(i)).getType().toString();
			
            int j=i;
            int count=0;
            boolean typeEquals=false;
			while((i==j||!typeEquals) && count<10 ) {
				count++;
				j = SelfAPRUtil.getRandomInt(arguments.size());
				if(((CtTypedElement) arguments.get(j)).getType()!=null) {
				String typej = ((CtTypedElement) arguments.get(j)).getType().toString();
				if(typei.equals(typej)) {
					typeEquals=true;
				}
				}
			} 
			
			while(i==j) {
				j = SelfAPRUtil.getRandomInt(arguments.size());
			}
						
			
			CtElement arg = arguments.get(i);
			CtElement argAnother = arguments.get(j);
			
			String varStr = SelfAPRUtil.getSimpleVarName(arg.toString());
			String varAnotherStr = SelfAPRUtil.getSimpleVarName(argAnother.toString());
			if(groundTruth.contains(" "+varStr) && groundTruth.contains(" "+varAnotherStr)  ) {
				corruptedCode = groundTruth.replaceFirst(" "+varStr , "_tmp_");
				corruptedCode = corruptedCode.replaceFirst(" "+varAnotherStr , " "+varStr);
				corruptedCode = corruptedCode.replaceFirst("_tmp_" , " "+varAnotherStr);
				corruptedCodeList.add(corruptedCode);
			}
			
			
		}
			
						
	}
		return corruptedCodeList;

} }

