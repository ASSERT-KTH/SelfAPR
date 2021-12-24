package code.analysis;

import java.util.List;

import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.filter.TypeFilter;

public class MethodSignature {

	static String getMethodSignature(List<CtMethod> methodList) {

		String methodInfo = "";

		for (CtMethod method : methodList) {
			String signature = method.getSignature();
			String simpleName = method.getSimpleName();
			String parameters = "";
			List paramList = method.getParameters();
			if (paramList.size() > 0) {
				for (Object param : paramList) {
					String pa = param.toString();
					String[] pl = pa.split("\\.");
					parameters += pl[pl.length - 1];
					parameters = parameters.split(" ")[1];
				}
			}

			String returnType = signature.split(" ")[0];
			String[] simpleReturnTypeList = returnType.split("\\.");
			if (simpleReturnTypeList.length > 0) {
				returnType = simpleReturnTypeList[simpleReturnTypeList.length - 1];
			}

			if ("".equals(parameters)) {
				methodInfo += " [RTYPE] " + returnType + " [MNAME] " + simpleName;
			} else {
				methodInfo += " [RTYPE] " + returnType + " [MNAME] " + simpleName + " [PARAM] " + parameters;
			}

		}

		return methodInfo;
	}
}
