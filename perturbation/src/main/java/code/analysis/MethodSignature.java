package code.analysis;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import code.utils.EditDistance;
import code.utils.SUPREUtil;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.filter.TypeFilter;

public class MethodSignature {
	
	public static String _methodInfo="";
	public static LinkedHashSet<String> _constructClassSet = new LinkedHashSet<String>();
	public static HashMap<Integer,HashMap<String,LinkedHashSet<String>>> _methSearch=  new HashMap<Integer,HashMap<String,LinkedHashSet<String>>>();	
	public static HashMap<String,LinkedHashSet<String>> _methList= new HashMap<String,LinkedHashSet<String>>();

	
	
	public static String getRandomClass(String orig){
		
		int i = SUPREUtil.getRandomInt(_constructClassSet.size()-1);
		String s = (String) _constructClassSet.toArray()[i];
		if(!s.equals(orig)) {
			return s;
		} else {
			if(i>0) {
				s = (String) _constructClassSet.toArray()[i-1];
			}else {
				s = (String) _constructClassSet.toArray()[i+1];
			}
			return s;
			
		}
	}
	
	
	
	
	
	
	
public static String getRandomMethodWithSameParam(String origKey,int param){
	String target="";
	double maxScore=0;
	HashMap<String,LinkedHashSet<String>> map = _methSearch.get(param);
		for(String keys : map.keySet()) {
			if(!keys.equals(origKey)) {
				if(SUPREUtil.getRandomDouble()>0.7) {
					return keys;
				}
				double score = EditDistance.similarity(keys, origKey);
				if (score > maxScore) {
					maxScore = score;
					target = keys;
				}				
			}
		}			
		return target;
	}
	

	static String getMethodSignature(List<CtMethod> methodList) {

		for (CtMethod method : methodList) {
			String signature = method.getSignature();
			String simpleName = method.getSimpleName();
			String parameters = "";
			String paras="";
			List paramList = method.getParameters();
			if (paramList.size() > 0) {
				for (Object param : paramList) {
					String pa = param.toString();
					String[] pl = pa.split("\\.");
					paras = pl[pl.length - 1];
					parameters += paras.split(" ")[0]+" ";
				}
			}

			String returnType = signature.split(" ")[0];
			String[] simpleReturnTypeList = returnType.split("\\.");
			if (simpleReturnTypeList.length > 0) {
				returnType = simpleReturnTypeList[simpleReturnTypeList.length - 1];
			}

			//the first character is type
			if(Character.isUpperCase(returnType.charAt(0))){
				_constructClassSet.add(returnType);
			} 
			
			
			// update _methList
			if (_methList.containsKey(simpleName)) {
				LinkedHashSet<String> lhset = _methList.get(simpleName);
				lhset.add(parameters);
				_methList.put(simpleName, lhset);
			}else {
				LinkedHashSet<String> lhset = new LinkedHashSet<String>();
				lhset.add(parameters);
				_methList.put(simpleName, lhset);
				
			}
			
			if(_methSearch.containsKey(paramList.size())){
				HashMap<String,LinkedHashSet<String>> m =   _methSearch.get(paramList.size());
				LinkedHashSet<String> lhset = new LinkedHashSet<String>();

				if (m.containsKey(simpleName)) {
					lhset = m.get(simpleName);
					lhset.add(parameters);	
					m.put(simpleName, lhset);

				}else {
					lhset.add(parameters);		
					m.put(simpleName, lhset);
				}							
			}else {
				HashMap<String,LinkedHashSet<String>> m =  new HashMap<String,LinkedHashSet<String>>();
				LinkedHashSet<String> lhset = new LinkedHashSet<String>();
				lhset.add(parameters);	
				m.put(simpleName, lhset);
				_methSearch.put(paramList.size(), m);				
			}
			
			
			
			
			
			
					
			}
		
			for(String key : _methList.keySet()) {
				LinkedHashSet<String> lhset = _methList.get(key);
				for(String methodParam:lhset) {
					_methodInfo += " [METHOD] "+key +" "+methodParam;
				}
			}
			
			
		

			
		System.out.print(getConstructInfo());
		return _methodInfo;
	}
	
	
	public static String getMethodInfo() {
		return _methodInfo;
	}
	
	
	public static String getConstructInfo() {
		String consInfo = "[CLASS]";
		for(String cons : _constructClassSet) {
			consInfo+=" "+cons;
		}
		return consInfo;
	}
	
	
}
