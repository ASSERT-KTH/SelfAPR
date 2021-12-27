package code.perturbation.replace;

import java.util.HashMap;
import java.util.List;

import code.analysis.Variables;
import code.output.result.PerturbResult;
import code.utils.SUPREUtil;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtIfImpl;
import spoon.support.reflect.code.CtReturnImpl;

public class ReplaceStatement {
	
	public static void replace(CtCodeElement st, String type, int methStart, 
			int methEnd) {
		// TODO Auto-generated method stub
		
		st = st;
		TypeFilter<CtReturnImpl> returnfilter = new TypeFilter<CtReturnImpl>(CtReturnImpl.class);
		List<CtReturnImpl> returns = st.getElements(returnfilter);	
		
		if(returns.size()>0) {
		ReplaceStatement.replaceReturn(returns,type,methStart,methEnd);
		}
		
		
		ReplaceStatement.replaceRandom(st,type,methStart,methEnd);
		
		
		
		
		CtElement parents = st.getParent();
		parents=parents;
		
		
		
		
		
	}

	private static void replaceRandom(CtCodeElement st, String type, int methStart, int methEnd) {
		st = st;		
		System.out.print(st);
	}

	private static void replaceReturn(List<CtReturnImpl>  st, String type, int methodStart, int methodEnd) {
		String returnStr = st.get(0).toString();
		
		int lineNo1 = st.get(0).getPosition().getLine();
		
		String corruptedCode="";
		String groundTruth = SUPREUtil.getSpecificLine(st.get(0).getPosition(), lineNo1);
		
		if(SUPREUtil.getRandomDouble()>0.7) {
		 corruptedCode = "return "+ randomReturnElement();
		}else if (SUPREUtil.getRandomDouble()>0.5) {
			corruptedCode = "return "+ randomReturnElement()+";";			
		}else if (SUPREUtil.getRandomDouble()>0.3) {
			corruptedCode = groundTruth.replace("return","" );
		}
		
		HashMap<String, String> map = new HashMap<String, String>();
		String lineNo2 = "";
		
		map.put("lineNo1", lineNo1 + "");
		map.put("lineNo2", lineNo2 + "");
		map.put("lineNo3", "");
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

		PerturbResult.getCorruptedResult(map);	
		
		
		
		
		
		
		
		
		
		System.out.print("corruptedCode:"+corruptedCode);
		
	}
	
	
	private static String randomReturnElement() {
		
		String randV = "";
		double r = Math.random();
		
		String[] lst = {"","false","true","null"};
		
		if(r>0.8) {
			randV=lst[SUPREUtil.getRandomInt(4)];
		}else {
			randV = Variables.getRandomVariables();
		}

		return randV;
		
	}
	
	
	
	
	
}
