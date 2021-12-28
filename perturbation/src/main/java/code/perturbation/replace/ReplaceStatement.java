package code.perturbation.replace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import code.analysis.Variables;
import code.output.result.PerturbResult;
import code.utils.SUPREUtil;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;
import spoon.support.reflect.code.CtFieldReadImpl;
import spoon.support.reflect.code.CtIfImpl;
import spoon.support.reflect.code.CtReturnImpl;
import spoon.support.reflect.reference.CtExecutableReferenceImpl;

public class ReplaceStatement {
	
	public static void replace(CtCodeElement st, String type, int methStart, 
			int methEnd) {
		
		TypeFilter<CtReturnImpl> returnfilter = new TypeFilter<CtReturnImpl>(CtReturnImpl.class);
		List<CtReturnImpl> returns = st.getElements(returnfilter);	
		
		
		if(returns.size()>0) {
			ReplaceReturnStatement.replaceReturn(returns,type,methStart,methEnd);
		} else {
			ReplaceStatement.replaceRandom(st,type,methStart,methEnd);
		}		
		
	}

	private static void replaceRandom(CtCodeElement st, String type, int methStart, int methEnd) {
		TypeFilter<CtExecutableReferenceImpl> executableFilter = new TypeFilter<CtExecutableReferenceImpl>(CtExecutableReferenceImpl.class);
		TypeFilter<CtFieldReadImpl> argumentFilter = new TypeFilter<CtFieldReadImpl>(CtFieldReadImpl.class);

		List<CtExecutableReferenceImpl> executables = st.getElements(executableFilter);
		List<CtFieldReadImpl> arguments = st.getElements(argumentFilter);

		if(executables.size()>0) {
			String execStr = executables.get(0).toString();
			String simExec = SUPREUtil.getSimilaryExecution(execStr);
			int lineNo1=st.getPosition().getLine();
			String groundTruth = SUPREUtil.getSpecificLine(st.getPosition(), lineNo1);
			
			execStr = SUPREUtil.getSimpleExecName( execStr);

			String perturbCode = groundTruth.replace(execStr, simExec);
			
			HashMap<String, String> map = new HashMap<String, String>();

			map.put("lineNo1", lineNo1 + "");
			map.put("lineNo2",  "");
			map.put("lineNo3", "");
			map.put("lineNo4", "");
			map.put("lineNo5", "");
			map.put("line1", perturbCode);
			map.put("line2", "");
			map.put("line3", "");
			map.put("line4", "");
			map.put("line5", "");
			map.put("groundTruth", groundTruth);
			map.put("methodStart", methStart + "");
			map.put("methodEnd", methEnd + "");
			map.put("repairAction", "[REPLACE]");
			System.out.println("replace condition");

			PerturbResult.getCorruptedResult(map);	
			
			System.out.println(st);

		}
		
		
		
		
		st = st;
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
}
