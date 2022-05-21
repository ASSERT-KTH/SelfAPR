package code.perturbation;

import java.util.ArrayList;
import java.util.List;

import code.analysis.ExecutableAnalysis;
import code.analysis.MethodSignature;
import code.analysis.Variables;
import code.perturbation.utils.SelfAPRUtil;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtConstructorCallImpl;
import spoon.support.reflect.code.CtInvocationImpl;
import spoon.support.reflect.code.CtVariableReadImpl;

public class InvocationPerturbation {

	public static List<String> perturb(CtElement st, String groundTruth) {
		double r = SelfAPRUtil.getRandomDouble();
		String corruptedCode = null;
		if (groundTruth == null) {
			return null;
		}

		/**
		 * filter invocation and arguments
		 * 
		 */

		List<String> perturbCodeList = new ArrayList<String>();

		List<CtInvocationImpl> invocations = st.getElements(new TypeFilter<CtInvocationImpl>(CtInvocationImpl.class));

		for (CtInvocationImpl inv : invocations) {

			CtExecutableReference exc = inv.getExecutable();
			// com.fasterxml.jackson.databind.BeanDescription#getClassInfo()
			List<CtVariableReadImpl> arguments = inv
					.getElements(new TypeFilter<CtVariableReadImpl>(CtVariableReadImpl.class));

			// replace the overloaded method

			String excStr = SelfAPRUtil.getSimpleExecName(exc.toString());
			int argSize = SelfAPRUtil.getArgsSize(inv);

			// #java.lang.Math
			if (exc.getDeclaringType() != null && "java.lang.Math".equals(exc.getDeclaringType().toString())) {
				String declarSring = "Math." + excStr + " ( ";
				if (groundTruth.contains(declarSring)) {
					String start = groundTruth.split("Math")[0];
					String later_ori = groundTruth.split(excStr)[1];
					String later = groundTruth.split(excStr)[1];

					// end
					String end = "";
					int lst = later.indexOf(")");
					int finalstr = lst;
					if (later.length() > 2 && lst > 2) {
						String check = later.substring(2, lst);
						if (check.contains("(")) {
							lst = later.indexOf(")") + 1;
							later = later.substring(lst, later.length());
							finalstr = later.indexOf(")");
						}
					}

					end = (String) later.subSequence(finalstr + 1, later.length());
					String origV=null;
					if(later_ori.length()>2 && lst>2&&later_ori.length()>lst) {
					 origV = later_ori.substring(2, lst);
					}

					// varaible

					String[] vs = null;
					if (origV != null && origV.contains(",")) {
						vs = origV.split(",");
					}

					// THE longest in length
					String targetV = "";
					if (vs != null && vs.length > 0) {
						for (String s : vs) {
							if (s.length() > targetV.length()) {
								targetV = s;
							}
						}
					} else {
						targetV = origV;
					}

					corruptedCode = start + " " + targetV + " " + end;
					System.out.println("=============corruptedCode=========");

				}
			}

			 if (groundTruth.contains(excStr)) {

				System.out.print("getRandomExecWithSameParam");
				// getRandomExecWithSameParam
				String newMethod = ExecutableAnalysis.getRandomExecWithSameParam(exc.toString(), argSize);
				if (newMethod != null && !"".equals(newMethod) && !" ".equals(newMethod)) {
					if (groundTruth.contains("." + excStr)) {
						corruptedCode = groundTruth.replaceFirst("\\." + excStr, "\\." + newMethod);
						perturbCodeList.add(corruptedCode);
					} else {
						corruptedCode = groundTruth.replaceFirst(excStr, newMethod);
						perturbCodeList.add(corruptedCode);
					}
				}
				// getOverridingMethods
				if(groundTruth.contains("." + excStr) && SelfAPRUtil.getRandomDouble()>0.6) {
				newMethod = MethodSignature.getOverridingMethods(excStr, argSize);
				if (newMethod != null && !"".equals(newMethod) ) {

					String start = groundTruth.split("\\." + excStr)[0];
					String later = groundTruth.split("\\." + excStr)[1];
					String end = "";
					int lst = later.indexOf(")");
					if (later.length() > 2 && lst > 2) {
						String check = later.substring(2, lst);
						if (check.contains("(")) {
							lst = later.indexOf(")");
							later = later.substring(lst + 1, later.length());
							lst = later.indexOf(")");
						}
					}

					end = (String) later.subSequence(lst + 1, later.length());

					corruptedCode = start + " " + "." + newMethod + " " + end;
					perturbCodeList.add(corruptedCode);
				} }			
			}

			// unwrap invocation and only keep varaible!!!
			if (exc.getDeclaringType() != null && corruptedCode == null && argSize == 1) {

				String declarSring = SelfAPRUtil.getSimpleVarName(exc.getDeclaringType().toString()) + "." + excStr
						+ " ( ";

				if (groundTruth.contains(declarSring)) {
					String de = SelfAPRUtil.getSimpleVarName(exc.getDeclaringType().toString());
					String start = groundTruth.split(de)[0];
					String later_ori = groundTruth.split(excStr)[1];
					String later = groundTruth.split(excStr)[1];
					// end
					String end = "";
					int lst = later.indexOf(")");
					int finalstr = lst;
					if (later.length() > 2 && lst > 2) {
						String check = later.substring(2, lst);
						if (check.contains("(")) {
							lst = later.indexOf(")") + 1;
							later = later.substring(lst, later.length());
							finalstr = later.indexOf(")");
						}
					}

					end = (String) later.subSequence(finalstr + 1, later.length());

					String origV = later_ori.substring(2, lst);

					corruptedCode = start + " " + origV + " " + end;
					System.out.println("=============corruptedCode=========");

				}

			}
			
			
			
		}

		return perturbCodeList;

	}
}
