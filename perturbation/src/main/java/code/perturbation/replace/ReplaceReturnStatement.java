package code.perturbation.replace;

import java.util.HashMap;
import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.InvocationPerturbation;
import code.perturbation.OperatorPerturbation;
import code.utils.SUPREUtil;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;
import spoon.support.reflect.code.CtInvocationImpl;
import spoon.support.reflect.code.CtReturnImpl;
import spoon.support.reflect.code.CtVariableReadImpl;

public class ReplaceReturnStatement {

	public static void replaceReturn(CtCodeElement  st, String type, int methodStart, int methodEnd) {
		
		int lineNo1 = st.getPosition().getLine();
		String lineNo2="";
		String lineNo3="";		
		String corruptedCode=null;
		double r = SUPREUtil.getRandomDouble();
		
		
		String groundTruth = SUPREUtil.getSpecificLine(st.getPosition(), lineNo1);
		if(groundTruth==null) {
			return;
		}
		
		/**
		 * We care about the complete block at most three lines
		 */
		groundTruth=groundTruth.trim();
		if(!";".equals(groundTruth.charAt(groundTruth.length()-1)) && !"}".equals(groundTruth.charAt(groundTruth.length()-1)) && !"{".equals(groundTruth.charAt(groundTruth.length()-1))) {
			 lineNo2 =lineNo1+1+"";
			 groundTruth +=SUPREUtil.getSpecificLine(st.getPosition(), lineNo1+1).trim();;	
			 if(!";".equals(groundTruth.charAt(groundTruth.length()-1)) && !"}".equals(groundTruth.charAt(groundTruth.length()-1)) && !"{".equals(groundTruth.charAt(groundTruth.length()-1)) ) {
			 lineNo3= lineNo1+2+"";
			 groundTruth +=SUPREUtil.getSpecificLine(st.getPosition(), lineNo1+2).trim();;	
			 }
		}
		
		
		
		
		//filter operators
		TypeFilter<CtBinaryOperatorImpl> bOfilter = new TypeFilter<CtBinaryOperatorImpl>(CtBinaryOperatorImpl.class);								
		List<CtBinaryOperatorImpl> ops = st.getElements(bOfilter);

		//filter variables
		TypeFilter<CtVariableReadImpl> argumentFilter = new TypeFilter<CtVariableReadImpl>(CtVariableReadImpl.class);
		List<CtVariableReadImpl> arguments = st.getElements(argumentFilter);

		
		TypeFilter<CtInvocationImpl> invocationfilter = new TypeFilter<CtInvocationImpl>(
				CtInvocationImpl.class);
		List<CtInvocationImpl> invocations = st.getElements(invocationfilter);
		
		
		
		
		
		
		
		
		
		if(r>0.7 && ops.size()>0 && corruptedCode == null) {
			corruptedCode = OperatorPerturbation.perturb(st,groundTruth);
		}
		if( r>0.5 && invocations.size()>0 && corruptedCode == null ) {
	     //return element w/o binary operator
			corruptedCode = InvocationPerturbation.perturb(st, groundTruth);
			
			
		}
		
		
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		
				
		map.put("lineNo1", lineNo1 + "");
		map.put("lineNo2", lineNo2 + "");
		map.put("lineNo3", lineNo3);
		map.put("lineNo4", "");
		map.put("lineNo5", "");
		map.put("line1", corruptedCode);
		map.put("line2", "");
		map.put("line3", "");
		map.put("line4", "");
		map.put("line5", "");
		map.put("groundTruth", groundTruth);
		map.put("methodStart", methodStart + "");
		map.put("methodEnd", methodEnd + "");
		map.put("repairAction", "[REPLACE]");
		map.put("targetFile", "");

		System.out.print("replace return");
		PerturbResult.getCorruptedResult(map);	
		
		
	}
	
	
	
	
		
}
