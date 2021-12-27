package code.analysis;

import java.util.List;

import spoon.reflect.declaration.CtVariable;

public class Variables {

	 static List<CtVariable> _variablesList;
	
	public static String getRandomVariables() {
		int vsize = _variablesList.size();
		int randint = (int) (Math.random()*(vsize - 1) + 1);
		CtVariable randV = _variablesList.get(randint);
		return randV.getSimpleName();
	}
	
	
	
	static String getVariables(List<CtVariable> variablesList) {
		_variablesList = variablesList;
		String variableInfo = "";
		for (CtVariable variable : variablesList) {
			String variableType = variable.getType().getSimpleName();
			String variableName = variable.getSimpleName();
			String defaultValue = "";
			if (variable.getDefaultExpression() != null) {
				String expression = variable.getDefaultExpression().toString();
				if (expression.contains("new")) {
					defaultValue = "";
				} else {
					defaultValue = expression;
				}

			}

			if ("".equals(defaultValue)) {
				variableInfo += " [VTYPE] " + variableType + " [VNAME] " + variableName;
			} else {
				// variableInfo+= " [TYPE] " + variableType +" [VNAME] "+ variableName + "
				// [VVALUE] " + defaultValue;
				variableInfo += " [VTYPE] " + variableType + " [VNAME] " + variableName;

			}
		}

		return variableInfo;
	}
}
