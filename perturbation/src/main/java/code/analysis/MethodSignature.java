package code.analysis;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import code.perturbation.utils.EditDistance;
import code.perturbation.utils.SelfAPRUtil;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtNamedElement;
import spoon.reflect.visitor.filter.TypeFilter;

public class MethodSignature {

	public static String _methodInfo = "";
	public static String _currentMethodInfo = "";

	public static LinkedHashSet<String> _constructClassSet = new LinkedHashSet<String>();

	/**
	 * key: number of parameters values: key method names; value: parameters type
	 * split by space
	 */

	public static HashMap<Integer, HashMap<String, LinkedHashSet<String>>> _methByParamSize = new HashMap<Integer, HashMap<String, LinkedHashSet<String>>>();

	/**
	 * key: method names values: parameters type split by space
	 */
	public static HashMap<String, LinkedHashSet<String>> _methByNameAndParams = new HashMap<String, LinkedHashSet<String>>();

	/**
	 * key: return type value: method names
	 */
	public static HashMap<String, LinkedHashSet<String>> _methodByReturnType = new HashMap<String, LinkedHashSet<String>>();

	/**
	 * key: method names value: return type
	 */
	public static HashMap<String, LinkedHashSet<String>> _methodByMethodNames = new HashMap<String, LinkedHashSet<String>>();

	
	public static String getOverridingMethods(String methName, Integer params) {
		
		if (_methByNameAndParams.size() == 0 || methName == null || "".equals(methName)) {
			return null;
		}

		return constructInvocation( methName, params); 
				
	}
	
	
	
	
	
	public static String constructInvocation(String methName,Integer paramSize) {
		
		String paramStr=null;
		String exec = ExecutableAnalysis.getExecutables(methName,paramSize);
		LinkedHashSet<String> params = _methByNameAndParams.get(methName);
		
		
			
		if(exec==null) {
			if(params==null) {
			return null;
			}
		} else {
			methName = exec.split("@@")[0];
			String sub = exec.substring(exec.indexOf("@@"), exec.length());
			if(sub.length()>2) {
			paramStr = exec.split("@@")[1];		
			} else {
				paramStr="";
			}
		}
		
	
		
		if(paramStr==null) {
		int i = SelfAPRUtil.getRandomInt(params.size());
		paramStr = (String) params.toArray()[i];
	    
		if(paramSize != null ) {	 
		for(String p:params) {
			String[] paramList = p.split(" ");
			if(paramList.length != paramSize) {
				paramStr = p;
				break;
			}				
		}
	} }

		methName += " ( ";
		// Now we construct a method call
		if (!" ".equals(paramStr) && !"".equals(paramStr) && paramStr!=null) {
			String[] paramList = paramStr.split(" ");
			
			for (String t : paramList) {
				if (!"".equals(t)) {
					String var = Variables.getRandomVariablesByStringType(t);
					if("".equals(var) || var==null) {
						return null;
					}
					methName += var + " , ";
				}
			}
			methName = (String) methName.subSequence(0, methName.lastIndexOf(",")) + ")";
		} else {
			methName += " )";
		}

		return methName;
	}
	
	
	
	
	
	
	
	
	public static String getMethodTypeByName(String methName) {
		if (_methodByMethodNames.size() == 0 || methName == null) {
			return null;
		}

		LinkedHashSet<String> types = _methodByMethodNames.get(methName);

		if (types != null && types.size() > 0) {
			return (String) types.toArray()[0];
		} else {
			return null;
		}
	}

	public static String getMethodByType(String origType, String origMethodName) {
		String methName = "";
		double maxScore = 0;
		if (_methodByReturnType.size() == 0 || origType == null) {
			return null;
		}

		LinkedHashSet<String> sets = _methodByReturnType.get(origType);

		if (sets != null && sets.size() > 0) {
			// find the most similar
			for (String st : sets) {
				if ( (origMethodName!=null && !st.equals(origMethodName)) || origMethodName == null) {
					double score = EditDistance.similarity(st, origMethodName);
					if (score > maxScore) {
						methName = st;
					}
				}
			}
		}

		if (methName != null && !"".equals(methName)) {
			methName = constructInvocation(methName, null); 
		}

		return methName;
	}

	public static String getRandomClass(String orig) {

		if (_constructClassSet.size() == 0) {
			return null;
		}

		int i = SelfAPRUtil.getRandomInt(_constructClassSet.size() - 1);
		String s = (String) _constructClassSet.toArray()[i];
		if (!s.equals(orig)) {
			return s;
		} else {
			if (i > 0) {
				s = (String) _constructClassSet.toArray()[i - 1];
			} else if(_constructClassSet.toArray().length>1){
				s = (String) _constructClassSet.toArray()[i + 1];
			} else {
				s = null;
			}
			return s;

		}
	}

	public static String getRandomMethodWithSameParam(String origKey, int param) {
		String target = "";
		double maxScore = 0;
		HashMap<String, LinkedHashSet<String>> map = _methByParamSize.get(param);

		if (map == null) {
			return null;
		}

		for (String keys : map.keySet()) {
			if (!keys.equals(origKey)) {
				double score = EditDistance.similarity(keys, origKey);
				if (score > maxScore) {
					maxScore = score;
					target = keys;
				}

				if (SelfAPRUtil.getRandomDouble() > 0.7 && maxScore > 0.8) {
					return keys;
				}

			}
		}
		return target;
	}
	
	

	
	public static void currentMethod(CtElement method) {
		
		_currentMethodInfo = "";
		String signature = ((CtExecutable) method).getSignature();
		String simpleName = ((CtNamedElement) method).getSimpleName();
		String parameters = " ";
		String paras = "";
		List paramList = ((CtExecutable) method).getParameters();
		if (paramList.size() > 0) {
			for (Object param : paramList) {
				String pa = param.toString();
				String[] pl = pa.split("\\.");
				paras = pl[pl.length - 1];
				parameters += " "+paras;
			}
		}
		
		String returnType = signature.split(" ")[0];
		String[] simpleReturnTypeList = returnType.split("\\.");
		if (simpleReturnTypeList.length > 0) {
			returnType = simpleReturnTypeList[simpleReturnTypeList.length - 1];
		}
		

		_currentMethodInfo = "[METHOD] "+ simpleName +" [RETURN_TYPE] " + returnType + " "+parameters ;
		
	}
	
	
	public static String getCurrentMethod() {

		return _currentMethodInfo;
		
	}
	
	
	

	

	public static String getMethodSignature(List<CtMethod> methodList) {
		
		 _methByParamSize = new HashMap<Integer, HashMap<String, LinkedHashSet<String>>>();

	
	 _methByNameAndParams = new HashMap<String, LinkedHashSet<String>>();

		 _methodByReturnType = new HashMap<String, LinkedHashSet<String>>();

		 _methodByMethodNames = new HashMap<String, LinkedHashSet<String>>();

		
		
		
		

		for (CtMethod method : methodList) {
			String signature = method.getSignature();
			String simpleName = method.getSimpleName();
			String parameters = "";
			String paras = "";
			List paramList = method.getParameters();
			if (paramList.size() > 0) {
				for (Object param : paramList) {
					String pa = param.toString();
					String[] pl = pa.split("\\.");
					paras = pl[pl.length - 1];
					parameters += paras.split(" ")[0] + " ";
				}
			}

			String returnType = signature.split(" ")[0];
			String[] simpleReturnTypeList = returnType.split("\\.");
			if (simpleReturnTypeList.length > 0) {
				returnType = simpleReturnTypeList[simpleReturnTypeList.length - 1];
			}

			// the first character is type
//			if (Character.isUpperCase(returnType.charAt(0))) {
//				_constructClassSet.add(returnType);
//			}

			// update _methByNameAndParams
			if (_methByNameAndParams.containsKey(simpleName)) {
				LinkedHashSet<String> lhset = _methByNameAndParams.get(simpleName);
				lhset.add(parameters);
				_methByNameAndParams.put(simpleName, lhset);
			} else {
				LinkedHashSet<String> lhset = new LinkedHashSet<String>();
				lhset.add(parameters);
				_methByNameAndParams.put(simpleName, lhset);
			}

			// _methodByReturnType
			if (_methodByReturnType.containsKey(returnType)) {
				LinkedHashSet<String> lhset = _methodByReturnType.get(returnType);
				lhset.add(simpleName);
				_methodByReturnType.put(returnType, lhset);
			} else {
				LinkedHashSet<String> lhset = new LinkedHashSet<String>();
				lhset.add(simpleName);
				_methodByReturnType.put(returnType, lhset);
			}

			// _methodByName and ReturnType
			if (_methodByMethodNames.containsKey(simpleName)) {
				LinkedHashSet<String> lhset = _methodByMethodNames.get(simpleName);
				lhset.add(returnType);
				_methodByMethodNames.put(simpleName, lhset);
			} else {
				LinkedHashSet<String> lhset = new LinkedHashSet<String>();
				lhset.add(returnType);
				_methodByMethodNames.put(simpleName, lhset);
			}

			if (_methByParamSize.containsKey(paramList.size())) {
				HashMap<String, LinkedHashSet<String>> m = _methByParamSize.get(paramList.size());
				LinkedHashSet<String> lhset = new LinkedHashSet<String>();

				if (m.containsKey(simpleName)) {
					lhset = m.get(simpleName);
					lhset.add(parameters);
					m.put(simpleName, lhset);

				} else {
					lhset.add(parameters);
					m.put(simpleName, lhset);
				}
			} else {
				HashMap<String, LinkedHashSet<String>> m = new HashMap<String, LinkedHashSet<String>>();
				LinkedHashSet<String> lhset = new LinkedHashSet<String>();
				lhset.add(parameters);
				m.put(simpleName, lhset);
				_methByParamSize.put(paramList.size(), m);
			}

		}

		for (String key : _methByNameAndParams.keySet()) {
			LinkedHashSet<String> lhset = _methByNameAndParams.get(key);

			LinkedHashSet<String> types = _methodByMethodNames.get(key);

			for (String methodParam : lhset) {
				_methodInfo += " [METHOD] " + types.toArray()[0] + " " + key + " [PARAMETERS] " + methodParam;
			}
		}

		System.out.print(_methodInfo);
		return _methodInfo;
	}

	public static String getMethodInfo() {
		return _methodInfo;
	}

	public static String getConstructInfo() {
		String consInfo = "[CLASS]";
		for (String cons : _constructClassSet) {
			consInfo += " " + cons;
		}
		return consInfo;
	}

}
