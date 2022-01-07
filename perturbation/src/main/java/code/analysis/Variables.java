package code.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import code.perturbation.PerturbActions;
import code.utils.EditDistance;
import code.utils.SUPREUtil;
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
	static String _variableinfo = "";
	static List<CtVariable> _variablesList = new ArrayList<CtVariable>();
	/**
	 * key: type value: a set of variable names
	 */
	static HashMap<String, Set<String>> _variableByTypeMap = new HashMap<String, Set<String>>();

	public static String getRandomVariablesForAssignment(CtElement var1, CtElement var2) {

		String type = "";

		if (var1 == null || var2 == null) {
			int vsize = _variablesList.size();
			int randint = (int) (Math.random() * (vsize - 1) + 1);
			CtVariable randV = _variablesList.get(randint);
			return randV.getSimpleName();

		} else {
			try {
				
				if(SUPREUtil.getRandomDouble()>0.15) {
				type = ((CtTypedElement) var1).getType().toString();
				type = SUPREUtil.getSimpleVarName(type);

				String origValue1 = SUPREUtil.getSimpleVarName(var1.toString());
				String origValue2 = SUPREUtil.getSimpleVarName(var2.toString());

				for (String key : _variableByTypeMap.keySet()) {
					if (key.equals(type)) {
						Set<String> values = _variableByTypeMap.get(key);
						for (String v : values) {
							if (!v.equals(origValue1) && !v.equals(origValue2)) {
								return v;
							}
						}
					}
				}
				} else {
					return MethodSignature.getMethodByType(type, null);

				}
			} catch (Exception e) {
				return SUPREUtil.randomReturnElement();
			}

			if (SUPREUtil.getRandomDouble() > 0.8) {
				return SUPREUtil.randomReturnElement();
			} else {
				return MethodSignature.getMethodByType(type, null);
			}
		}
	}

	public static String getRandomVariables(CtExpression var) {
		if (var == null) {
			return null;

		}
		CtTypeReference t = var.getType();
		if (t == null || "".equals(t.toString())) {
			return null;
		}

		String type = SUPREUtil.getSimpleVarName(t.toString());
		if (SUPREUtil.getRandomDouble() > 0.15) {
			try {
				String origValue = SUPREUtil.getSimpleVarName(var.toString());

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
								if (count > values.size() / 2 && SUPREUtil.getRandomDouble() > 0.75) {
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
			return SUPREUtil.randomReturnElement();
		} else {
			try {
				type = SUPREUtil.getSimpleVarName(type);

				if (SUPREUtil.getRandomDouble() > 0.1) {
					// get variable
					Set<String> values = _variableByTypeMap.get(type);
					if (values == null || values.size() == 0) {
						return SUPREUtil.randomReturnElement();
					}
					for (String v : values) {
						v = (String) values.toArray()[SUPREUtil.getRandomInt(values.size())];
						return v;
					}
				} else {
					// construct invocation
					return MethodSignature.getMethodByType(type, null);

				}

			} catch (Exception e) {
				return SUPREUtil.randomReturnElement();
			}

			return SUPREUtil.randomReturnElement();
		}
	}

	public static String getVariables(List<CtVariable> variablesList) {
		_variablesList = variablesList;
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
			lst.add("true");
			lst.add("false");
			_variableByTypeMap.put("boolean", lst);
		} else {
			Set<String> lst = new TreeSet<String>();
			lst.add("true");
			lst.add("false");
			_variableByTypeMap.put("boolean", lst);
		}


		
		//_variableinfo
		for (String key : _variableByTypeMap.keySet()) {
			Set<String> values = _variableByTypeMap.get(key);
			String valStr = "";
			for (String s : values) {
				valStr += " " + s + " ";
			}
			_variableinfo += " [VTYPE] " + key + valStr;
		}
				
		return _variableinfo;		
	}

	
	public static String getVariableInfo() {
		return _variableinfo;
	}
}
