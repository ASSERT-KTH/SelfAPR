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
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtNamedElement;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.reference.CtTypeReference;

public class Variables {
	 static String _variableinfo = "";
	 static List<CtVariable> _variablesList;
	 static HashMap<String,Set<String>> _variableByTypeMap= new HashMap<String,Set<String>>();
	 
	 
	 
	 public static String getRandomVariablesForAssignment(CtElement var1,CtElement var2) {
			
			String type = "";

		 if (var1==null || var2==null) {
			int vsize = _variablesList.size();
			int randint = (int) (Math.random()*(vsize - 1) + 1);
			CtVariable randV = _variablesList.get(randint);
			return randV.getSimpleName();
			
			} else {
				try {
				type = ((CtTypedElement) var1).getType().toString();
				type = SUPREUtil.getSimpleVarName(type);
				
				String origValue1= SUPREUtil.getSimpleVarName(var1.toString());
				String origValue2= SUPREUtil.getSimpleVarName(var2.toString());


				for(String key : _variableByTypeMap.keySet()) {
					if(key.equals(type)) {
						Set<String> values =_variableByTypeMap.get(key);	
						for (String v: values) {
							if(!v.equals(origValue1) && !v.equals(origValue2)) {
								return v;
							}
						}
					}
				} } catch(Exception e) {	
					return  SUPREUtil.randomReturnElement();
				}
				
				if(SUPREUtil.getRandomDouble()>0.8) {
				return  SUPREUtil.randomReturnElement();
				} else {
					return MethodSignature.getMethodByType(type,null);
				}
			}
		}
	 
	 
	
	public static String getRandomVariables(CtVariable var) {
		if (var==null) {
		int vsize = _variablesList.size();
		int randint = (int) (Math.random()*(vsize - 1) + 1);
		CtVariable randV = _variablesList.get(randint);
		
		return randV.getSimpleName();
		
		} else {
			try {
			String type = var.getType().toString();
			type = SUPREUtil.getSimpleVarName(type);
			
			String origValue= SUPREUtil.getSimpleVarName(var.toString());

			for(String key : _variableByTypeMap.keySet()) {
				if(key.equals(type)) {
					Set<String> values =_variableByTypeMap.get(key);	
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
	
	
	public static String getRandomVariables(CtExpression var) {
		if (var==null) {
		int vsize = _variablesList.size();
		int randint = (int) (Math.random()*(vsize - 1) + 1);
		CtVariable randV = _variablesList.get(randint);
		
		return randV.getSimpleName();
		
		} else {
			try {
			String type = var.getType().toString();
			type = SUPREUtil.getSimpleVarName(type);
			
			String origValue= SUPREUtil.getSimpleVarName(var.toString());

			for(String key : _variableByTypeMap.keySet()) {
				if(key.equals(type)) {
					Set<String> values =_variableByTypeMap.get(key);	
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
	
	
	
	
	public static String getRandomVariablesByStringType(String type) {
		if (type==null || type=="") {
			return SUPREUtil.randomReturnElement();
		} else {
			try {
			type = SUPREUtil.getSimpleVarName(type);		

			Set<String> values =_variableByTypeMap.get(type);
			if(values==null || values.size()==0) {
				return SUPREUtil.randomReturnElement();
			}
			for (String v: values) {
				v = (String) values.toArray()[SUPREUtil.getRandomInt(values.size())];
				return v;
			}
				
			 } catch(Exception e) {	
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
			if(!_variableByTypeMap.containsKey(variableType)) {
				Set<String> lst = new TreeSet<String>();
				lst.add(variableName);
				_variableByTypeMap.put(variableType, lst);
			}else {
				Set<String> lst= _variableByTypeMap.get(variableType);
				lst.add(variableName);
				_variableByTypeMap.put(variableType, lst);
			}		
		}
		
		for(String key : _variableByTypeMap.keySet()) {
			Set<String> values =_variableByTypeMap.get(key);	
			String valStr = "";
			for(String s:values) {
				valStr+=" "+s+" ";
			}
			
			_variableinfo+= " [VTYPE] "+key+valStr;
		}
		
		System.out.println(_variableinfo);
	}
	
	
	public static String getVariableInfo(){
		return _variableinfo;
	}
}
