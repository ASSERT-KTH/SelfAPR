package code.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import code.perturbation.PerturbActions;
import code.utils.SUPREUtil;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtNamedElement;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.reference.CtTypeReference;

public class Variables {
	 static String _variableinfo = "";
	 static List<CtVariable> _variablesList;
	 static HashMap<String,Set<String>> map = new HashMap<String,Set<String>>();
	
	public static String getRandomVariables(CtExpression var) {
		if (var==null) {
		int vsize = _variablesList.size();
		int randint = (int) (Math.random()*(vsize - 1) + 1);
		CtVariable randV = _variablesList.get(randint);
		
		return randV.getSimpleName();
		
		} else {
			try {
			HashMap<String,Set<String>>	map2 = map;
			String type = var.getType().toString();
			type = SUPREUtil.getSimpleVarName(type);
			
			String origValue= SUPREUtil.getSimpleVarName(var.toString());

			for(String key : map.keySet()) {
				if(key.equals(type)) {
					Set<String> values =map.get(key);	
					for (String v: values) {
						v = (String) values.toArray()[SUPREUtil.getRandomInt(values.size()-1)];
						if(!v.equals(origValue)) {
							return v;
						}
					}
				}
			} } catch(Exception e) {	
				return  SUPREUtil.randomReturnElement();
			}
			
			return  SUPREUtil.randomReturnElement();
		}
	}
	
	
	
	static void getVariables(List<CtVariable> variablesList) {
		_variablesList = variablesList;
		String variableInfo = "";
		for (CtVariable variable : variablesList) {
			String variableType = variable.getType().getSimpleName();
			String variableName = variable.getSimpleName();
			if(!map.containsKey(variableType)) {
				Set<String> lst = new TreeSet<String>();
				lst.add(variableName);
				map.put(variableType, lst);
			}else {
				Set<String> lst= map.get(variableType);
				lst.add(variableName);
				map.put(variableType, lst);
			}		
		}
		
		for(String key : map.keySet()) {
			Set<String> values =map.get(key);	
			String valStr = "";
			for(String s:values) {
				valStr+=" "+s+" ";
			}
			
			_variableinfo+= " [VTYPE] "+key+valStr;
		}
		
		
		//perturb
		for (CtVariable variable : variablesList) {
			
			System.out.print(variable);

			System.out.print(variable);
			
			int start = variable.getPosition().getLine();
			int end = variable.getPosition().getEndLine();

			
			PerturbActions.randomPerturb(variable,"declaration",start,end);	

			
			
			
			
		}
		
		
		
			
		
	}
	
	
	public static String getVariableInfo(){
		return _variableinfo;
	}
}
