package code.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import code.perturbation.PerturbActions;
import code.perturbation.utils.EditDistance;
import code.perturbation.utils.SelfAPRUtil;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtNamedElement;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.declaration.CtFieldImpl;

public class Variables {
	// static List<CtVariable> _variablesList = new ArrayList<CtVariable>();
	/**
	 * key: type value: a set of variable names
	 */
	static HashMap<String, Set<String>> _variableByTypeMap = new HashMap<String, Set<String>>();

	static HashMap<String, Set<String>> _fieldByTypeMap = new HashMap<String, Set<String>>();

	public static String getRandomVariablesForAssignment(CtElement var1, Object var2) {

		String type = null;
		String target = null;
		double maxScore = 0;
		int count = 0;
		if (var1 == null || var2 == null) {
			return null;
		} 
		
		if(((CtTypedElement) var1).getType()==null) {
			return null;
		}
		
		type = ((CtTypedElement) var1).getType().toString();

		try {

			if (type!=null && SelfAPRUtil.getRandomDouble() > 0.1) {
				type = SelfAPRUtil.getSimpleVarName(type);

				String origValue1 = SelfAPRUtil.getSimpleVarName(var1.toString());
				String origValue2 = SelfAPRUtil.getSimpleVarName(var2.toString());

				Set<String> values = _variableByTypeMap.get(type);
				for (String v : values) {
					if (!v.equals(origValue1) && !v.equals(origValue2)) {
						double score = EditDistance.similarity(v, origValue1);
						if (score >= maxScore) {
							target = v;
							count++;
							if (count > values.size() / 2 && SelfAPRUtil.getRandomDouble() > 0.7) {
								return target;
							}
						}
					}
				}
					return target;
			} else if(type!=null){
				return MethodSignature.getMethodByType(type, null);
			}
		} catch (Exception e) {
			return SelfAPRUtil.randomReturnElement();
		}

		if (SelfAPRUtil.getRandomDouble() > 0.8) {
			return SelfAPRUtil.randomReturnElement();
		} else if(type!=null) {
			return MethodSignature.getMethodByType(type, null);
		}
		return null;
		}
	

	public static String getRandomVariables(CtExpression var) {
		if (var == null) {
			return null;

		}
		CtTypeReference t = var.getType();
		if (t == null || "".equals(t.toString())) {
			return null;
		}

		String type = SelfAPRUtil.getSimpleVarName(t.toString());
		if (SelfAPRUtil.getRandomDouble() > 0.15) {
			try {
				String origValue = SelfAPRUtil.getSimpleVarName(var.toString());

				Set<String> values = _variableByTypeMap.get(type);

				if (values == null || values.size() == 0) {
					return null;
				}

				else {

					double maxScore = 0;
					String target = null;
					int count = 0;
					for (String v : values) {
						if (!v.equals(origValue)) {
							//
							double score = EditDistance.similarity(v, origValue);
							if (score > maxScore) {
								target = v;
								count++;
								if (count > values.size() / 2 && SelfAPRUtil.getRandomDouble() > 0.85) {
									return target;
								}
							}
						}
					}
					return target;

				}
			} catch (Exception e) {
				return MethodSignature.getMethodByType(type, null);
			}
		} else {
			return MethodSignature.getMethodByType(type, null);

		}
	}

	public static String getRandomVariablesByStringType(String type) {
		if (type == null || type == "") {
			return SelfAPRUtil.randomReturnElement();
		} else {
			try {
				type = SelfAPRUtil.getSimpleVarName(type);

				if (SelfAPRUtil.getRandomDouble() > 0.1) {
					// get variable
					Set<String> values = _variableByTypeMap.get(type);
					if (values == null || values.size() == 0) {
						String me = MethodSignature.getMethodByType(type, null);
						return SelfAPRUtil.randomReturnElement();
					}
					for (String v : values) {
						v = (String) values.toArray()[SelfAPRUtil.getRandomInt(values.size())];
						return v;
					}
				} else {
					// construct invocation
					return MethodSignature.getMethodByType(type, null);

				}

			} catch (Exception e) {
				return SelfAPRUtil.randomReturnElement();			
			}

			return SelfAPRUtil.randomReturnElement();	
		}
	}

	public static void getFiles(List<CtFieldImpl> fieldsList) {

		 _fieldByTypeMap = new HashMap<String, Set<String>>();

		
		for (CtFieldImpl variable : fieldsList) {
			String variableType = variable.getType().getSimpleName();
			String variableName = variable.getSimpleName();
			if (!_fieldByTypeMap.containsKey(variableType)) {
				Set<String> lst = new TreeSet<String>();
				lst.add(variableName);
				_fieldByTypeMap.put(variableType, lst);
			} else {
				Set<String> lst = _fieldByTypeMap.get(variableType);
				lst.add(variableName);
				_fieldByTypeMap.put(variableType, lst);
			}
		}

	}

	static HashMap<String, Set<String>> getFieldMap() {
		return _fieldByTypeMap;
	}

	public static void getVariables(List<CtVariable> variablesList) {

		_variableByTypeMap = new HashMap<String, Set<String>>();
		_variableByTypeMap = (HashMap<String, Set<String>>) getFieldMap().clone();

		String variableInfo = "";
		for (CtVariable variable : variablesList) {
			String variableType = variable.getType().getSimpleName();
			String variableName = variable.getSimpleName();
			if (!_variableByTypeMap.containsKey(variableType)) {
				Set<String> lst = new TreeSet<String>();
				lst.add(variableName);
				_variableByTypeMap.put(variableType, lst);
			} else {
				Set<String> lst = _variableByTypeMap.get(variableType);
				lst.add(variableName);
				_variableByTypeMap.put(variableType, lst);
			}
		}

		// add true false in boolean
		if (_variableByTypeMap.containsKey("boolean")) {
			Set<String> lst = _variableByTypeMap.get("boolean");
//			lst.add("true");
//			lst.add("false");
			_variableByTypeMap.put("boolean", lst);
		} else {
			Set<String> lst = new TreeSet<String>();
//			lst.add("true");
//			lst.add("false");
			_variableByTypeMap.put("boolean", lst);
		}

	}

	public static String getVariableInfo() {
		String info = "";
		// _variableinfo

		for (String key : _variableByTypeMap.keySet()) {
			Set<String> values = _variableByTypeMap.get(key);
			String valStr = "";
			for (String s : values) {
				valStr += " " + s + " ";
			}
			info +=  key +" "+ valStr+" ";
		}

		return info;
	}
}
