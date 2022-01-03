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
	
	/**
	 * key: number of parameters
	 * values: key method names; value: parameters type split by space
	 */
	
	public static HashMap<Integer,HashMap<String,LinkedHashSet<String>>> _methByParamSize=  new HashMap<Integer,HashMap<String,LinkedHashSet<String>>>();		
	
	/**
	 * key: method names
	 * values: parameters type split by space
	 */
	public static HashMap<String,LinkedHashSet<String>> _methByNameAndParams= new HashMap<String,LinkedHashSet<String>>();
	
	/**
	 * key: return type
	 * value: method names
	 */
	public static HashMap<String,LinkedHashSet<String>> _methodByReturnType= new HashMap<String,LinkedHashSet<String>>();
	
	
	/**
	 * key: method names
	 * value:  return type
	 */
	public static HashMap<String,LinkedHashSet<String>> _methodByMethodNames= new HashMap<String,LinkedHashSet<String>>();

	
	
	public static String getMethodTypeByName(String methName) {
		if(_methodByMethodNames.size()==0 || methName==null) {
			return null;
		} 
		
		LinkedHashSet<String> types= _methodByMethodNames.get(methName);
		
		if(types!=null && types.size()>0) {
			return (String) types.toArray()[0];		
		} else {
			return null;
		}	
	}

		
	public static String getMethodByType(String origType, String origMethodName) {
		String methName = "";
		if(_methodByReturnType.size()==0 || origType==null) {
			return null;
		} 
		
	   LinkedHashSet<String> sets = _methodByReturnType.get(origType);
	   
	   if (sets!=null && sets.size()>0) {
		int i = SUPREUtil.getRandomInt(sets.size());
		methName = (String) sets.toArray()[i];
		   if(methName.equals(origMethodName)) {
		   if(i>0) {
			   methName = (String) sets.toArray()[i-1];
			}else { 
				if (i+1<sets.size()) {
				methName = (String) sets.toArray()[i+1];
				}else {
					methName =  null;
				}
			}
		   }
	   }
	   
	   if(methName!=null && !"".equals(methName) ) {
		   LinkedHashSet<String>  params=  _methByNameAndParams.get(methName);
		   int i = SUPREUtil.getRandomInt(params.size());
		    String paramStr = (String) params.toArray()[i];
		    
		    methName+=" ( ";
		    //Now we construct a method call

		    if(!" ".equals(paramStr) && !"".equals(paramStr) ) {
		    String[] paramList = paramStr.split(" ");
		    for(String t : paramList) {
		    	if(!"".equals(t)) {
		    String var = 	Variables.getRandomVariablesByStringType(t);		    	
		    	methName+=var+" , ";  
		    	} 
		    }
		    methName = (String) methName.subSequence(0, methName.lastIndexOf(",")) + ")";
		    } else {
		    	methName += " )";
		    }
		    
		    
		    return methName;
		    
	   }
	   
		
		return methName;
	}
	
	
	
	
	
	
	
	public static String getRandomClass(String orig){
		
		if(_constructClassSet.size()==0) {
			return null;
		}
		
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
	HashMap<String,LinkedHashSet<String>> map = _methByParamSize.get(param);
		for(String keys : map.keySet()) {
			if(!keys.equals(origKey)) {				
				double score = EditDistance.similarity(keys, origKey);
				if (score > maxScore) {
					maxScore = score;
					target = keys;
				}	
				
				if(SUPREUtil.getRandomDouble()>0.7 && maxScore>0.7) {
					return keys;
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
			
			
			// update _methByNameAndParams
			if (_methByNameAndParams.containsKey(simpleName)) {
				LinkedHashSet<String> lhset = _methByNameAndParams.get(simpleName);
				lhset.add(parameters);
				_methByNameAndParams.put(simpleName, lhset);
			}else {
				LinkedHashSet<String> lhset = new LinkedHashSet<String>();
				lhset.add(parameters);
				_methByNameAndParams.put(simpleName, lhset);				
			}
			
			
			//_methodByReturnType
			if (_methodByReturnType.containsKey(returnType)) {
				LinkedHashSet<String> lhset = _methodByReturnType.get(returnType);
				lhset.add(simpleName);
				_methodByReturnType.put(returnType, lhset);
			}else {
				LinkedHashSet<String> lhset = new LinkedHashSet<String>();
				lhset.add(simpleName);
				_methodByReturnType.put(returnType, lhset);				
			}
			
			
			
			
			
			//_methodByName and ReturnType
			if (_methodByMethodNames.containsKey(simpleName)) {
				LinkedHashSet<String> lhset = _methodByMethodNames.get(simpleName);
				lhset.add(returnType);
				_methodByMethodNames.put(simpleName, lhset);
			}else {
				LinkedHashSet<String> lhset = new LinkedHashSet<String>();
				lhset.add(returnType);
				_methodByMethodNames.put(simpleName, lhset);				
			}
			
			
			
			
			
			
			
			if(_methByParamSize.containsKey(paramList.size())){
				HashMap<String,LinkedHashSet<String>> m =   _methByParamSize.get(paramList.size());
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
				_methByParamSize.put(paramList.size(), m);				
			}
			
			
			
			
			
			
					
			}
		
			for(String key : _methByNameAndParams.keySet()) {
				LinkedHashSet<String> lhset = _methByNameAndParams.get(key);
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
