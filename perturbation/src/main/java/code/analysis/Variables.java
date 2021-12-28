package code.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtNamedElement;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.reference.CtTypeReference;

public class Variables {

	 static List<CtVariable> _variablesList;
	 static HashMap<String,List<String>> map = new HashMap<String,List<String>>();
	
	public static String getRandomVariables(CtExpression var) {
		if (var==null) {
		int vsize = _variablesList.size();
		int randint = (int) (Math.random()*(vsize - 1) + 1);
		CtVariable randV = _variablesList.get(randint);
		
		return randV.getSimpleName();
		
		} else {
			try {
			String type = var.getType().toString();
			String origValue= ((CtNamedElement) var).getSimpleName();

			for(String key : map.keySet()) {
				if(key.equals(type)) {
					List<String> values =map.get(key);	
					for (String v: values) {
						if(!v.equals(origValue)) {
							return v;
						}
					}
				}
			} } catch(Exception e) {	
				return  _variablesList.get(0).getSimpleName();
			}
			
			return  _variablesList.get(0).getSimpleName();
		}
	}
	
	
	
	static String getVariables(List<CtVariable> variablesList) {
		_variablesList = variablesList;
		String variableInfo = "";
		for (CtVariable variable : variablesList) {
			String variableType = variable.getType().getSimpleName();
			String variableName = variable.getSimpleName();
			if(!map.containsKey(variableType)) {
				List<String> lst = new ArrayList<String>();
				lst.add(variableName);
				map.put(variableType, lst);
			}else {
				List<String> lst= map.get(variableType);
				lst.add(variableName);
				map.put(variableType, lst);
			}		
		}
		
		for(String key : map.keySet()) {
			List<String> values =map.get(key);	
			String valStr = "";
			for(String s:values) {
				valStr+=" "+s+" ";
			}
			
			variableInfo+= " [VTYPE] "+key+valStr;
		}
			
		return variableInfo;
		
	}
}
