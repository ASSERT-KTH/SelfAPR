package code.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

import code.perturbation.utils.EditDistance;
import code.perturbation.utils.SelfAPRUtil;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtInvocationImpl;

public class ExecutableAnalysis {
	
	
	/**
	 * key: number of parameters values: key method names; value: parameters type
	 * split by space
	 */
	static List<String>  _executables = new ArrayList<String>() ;

	public static HashMap<Integer, LinkedHashSet<String>> _exectByParamSize = new HashMap<Integer, LinkedHashSet<String>>();

	/**
	 * key: method names values: parameters type split by space
	 */
	public static HashMap<String, LinkedHashSet<String>> _execByNameAndParams = new HashMap<String, LinkedHashSet<String>>();

	/**
	 * key: return type value: method names
	 */
	public static HashMap<String, LinkedHashSet<String>> _exectuableBydeclaringType = new HashMap<String, LinkedHashSet<String>>();

	/**
	 * key: method names value: return type
	 */
	public static HashMap<String, LinkedHashSet<String>> _exectuableByNames = new HashMap<String, LinkedHashSet<String>>();
	
	
	
	
	
	
	
	public static String getExecutables(String origName, int paramSize) {
		
		LinkedHashSet<String> declaringTypes  = _exectuableByNames.get(origName);
		String declaringType=null;
		if(declaringTypes!=null) {
			declaringType = (String) declaringTypes.toArray()[0];
		}
		
		if(declaringTypes==null) {
			return null;
		}
		
		
		//get the override methods
		LinkedHashSet<String> params = _execByNameAndParams.get(origName);
		if(params.size()>1) {
			//exist overriding methods
			System.out.println("");
			for(String paramstr : params) {
				String[] parray= paramstr.split(" ");
				if(parray.length!=paramSize) {
					return origName+"@@"+paramstr;
				}							
			}		
		}
		
		
		
		
		LinkedHashSet<String> names = _exectuableBydeclaringType.get(declaringType);
			
		//get the most similar exectuable
		double maxScore=0;
		String simExec=null;
		for(String execName : names) {
			if(!execName.equals(origName)) {
			double score = EditDistance.similarity(execName, origName);
			if (score > maxScore) {
				maxScore = score;
				simExec = execName;
			}
			}
		}
			
		
		LinkedHashSet<String> newParams = _execByNameAndParams.get(simExec);


		if(newParams!=null && newParams.size()>0) {
			return simExec+"@@"+newParams.toArray()[0];
		}else {
			return null;
		}
				
	}
	
	
	
	
	
	
	public static String getRandomExecWithSameParam(String origKey, int param) {
		String target = "";
		double maxScore = 0;
		LinkedHashSet<String> map = _exectByParamSize.get(param);

		if (map == null) {
			return null;
		}

		for (String keys : map) {
			if (!keys.equals(origKey)) {
				if(keys.contains("#") && origKey.contains("#")) {
					String declaringType1 = keys.split("#")[0];
					String declaringType2 = origKey.split("#")[0];
					if(declaringType1.equals(declaringType2)) {					
					double score = EditDistance.similarity(keys, origKey);
					if (score > maxScore) {
						maxScore = score;
						target = keys;
					}
					}
				}
				
				
				
			}
		}
		return SelfAPRUtil.getSimpleExecName(target);
	}
	
	
	
	
	
	
	
	

	public static void analysis(CtElement st){
		
	 _exectByParamSize = new HashMap<Integer, LinkedHashSet<String>>();

		/**
		 * key: method names values: parameters type split by space
		 */
		_execByNameAndParams = new HashMap<String, LinkedHashSet<String>>();

		/**
		 * key: return type value: method names
		 */
		 _exectuableBydeclaringType = new HashMap<String, LinkedHashSet<String>>();

		/**
		 * key: method names value: return type
		 */
		 _exectuableByNames = new HashMap<String, LinkedHashSet<String>>();
		
		
		
		List<CtInvocationImpl> invocations = st.getElements(new TypeFilter<CtInvocationImpl>(CtInvocationImpl.class));
		List<CtExecutableReference> executables = st.getElements(new TypeFilter<CtExecutableReference>(CtExecutableReference.class));
				
			
		
		for (CtExecutableReference exectuable : executables) {
			String signature = exectuable.getSignature();
			
			_executables.add(signature);

			
			
			String simpleName = signature.toString().split("#")[1].split("\\(")[0];
			String parameters = "";
			List paramList = exectuable.getParameters();
			if (paramList.size() > 0) {
				for (Object param : paramList) {
					String pa = param.toString();
					String[] pl = pa.split("\\.");
					String paras = pl[pl.length - 1];
					parameters += paras.split(" ")[0] + " ";
				}
			}

			String declaringType = signature.toString().split("#")[0];
//			String[] simpledeclaringTypeList = declaringType.split("\\.");
//			if (simpledeclaringTypeList.length > 0) {
//				declaringType = simpledeclaringTypeList[simpledeclaringTypeList.length - 1];
//			}

		

			// update _execByNameAndParams
			if (_execByNameAndParams.containsKey(simpleName)) {
				LinkedHashSet<String> lhset = _execByNameAndParams.get(simpleName);
				lhset.add(parameters);
				_execByNameAndParams.put(simpleName, lhset);
			} else {
				LinkedHashSet<String> lhset = new LinkedHashSet<String>();
				lhset.add(parameters);
				_execByNameAndParams.put(simpleName, lhset);
			}

			// _exectuableBydeclaringType
			if (_exectuableBydeclaringType.containsKey(declaringType)) {
				LinkedHashSet<String> lhset = _exectuableBydeclaringType.get(declaringType);
				lhset.add(simpleName);
				_exectuableBydeclaringType.put(declaringType, lhset);
			} else {
				LinkedHashSet<String> lhset = new LinkedHashSet<String>();
				lhset.add(simpleName);
				_exectuableBydeclaringType.put(declaringType, lhset);
			}

			// _exectuableByName and declaringType
			if (_exectuableByNames.containsKey(simpleName)) {
				LinkedHashSet<String> lhset = _exectuableByNames.get(simpleName);
				lhset.add(declaringType);
				_exectuableByNames.put(simpleName, lhset);
			} else {
				LinkedHashSet<String> lhset = new LinkedHashSet<String>();
				lhset.add(declaringType);
				_exectuableByNames.put(simpleName, lhset);
			}

			if (_exectByParamSize.containsKey(paramList.size())) {
				 LinkedHashSet<String> lhset = _exectByParamSize.get(paramList.size());
				lhset.add(signature);
				_exectByParamSize.put(paramList.size(), lhset);
			} else {
				LinkedHashSet<String> lhset = new LinkedHashSet<String>();
				lhset.add(parameters);
				_exectByParamSize.put(paramList.size(), lhset);
			}

		}
		
		
		
		
		
		
		
		System.out.print("");

		
		
	}
}
