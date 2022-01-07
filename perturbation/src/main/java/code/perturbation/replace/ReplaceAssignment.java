package code.perturbation.replace;

import java.util.HashMap;
import java.util.List;

import code.analysis.AssignmentAnalysis;
import code.analysis.Variables;
import code.output.result.PerturbResult;
import code.perturbation.InvocationPerturbation;
import code.perturbation.LiteralPerturbation;
import code.perturbation.ModifiersPerturbation;
import code.perturbation.OperatorPerturbation;
import code.perturbation.TypePerturbation;
import code.utils.SUPREUtil;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtFieldReadImpl;
import spoon.support.reflect.code.CtFieldWriteImpl;
import spoon.support.reflect.code.CtVariableReadImpl;
import spoon.support.reflect.code.CtVariableWriteImpl;

public class ReplaceAssignment {

	public static void perturb(CtElement st, int methStart, int methEnd, String groundTruth, int lineNo1,
			String lineNo2, String lineNo3) {
		String perturbCode = null;
		/**
		 * This is a random number to decide the perturbation
		 */
		double r = SUPREUtil.getRandomDouble();

		if (groundTruth.contains("valueSerializer = ser;")) {
			System.out.print("");
		}

		/**
		 * We try to perturb the operators
		 */

		perturbCode = OperatorPerturbation.perturb(st, groundTruth);

		// replace with similar invocation
		if (perturbCode == null) {
			perturbCode = InvocationPerturbation.perturb(st, groundTruth);
		}

		// replace with similar assignments
		if (perturbCode == null) {
			List<CtFieldReadImpl> assignmentList = st
					.getElements(new TypeFilter<CtFieldReadImpl>(CtFieldReadImpl.class));
			if (assignmentList.size() > 0) {

				String assignment = assignmentList.get(0).toString();

				if (groundTruth.contains(assignment)) {

					String perturbAssignment = AssignmentAnalysis.getSimilarAssignment(assignment);
					if (perturbAssignment != null) {
						perturbCode = groundTruth.replace(assignment, perturbAssignment);
					}

				}
				System.out.print("");

			}

		}

		// replace with similar variables
		if (perturbCode == null) {
			List<CtVariableReadImpl> varaibleList = st
					.getElements(new TypeFilter<CtVariableReadImpl>(CtVariableReadImpl.class));
			List assignedList = st.getElements(new TypeFilter<CtVariableWriteImpl>(CtVariableWriteImpl.class));
			if (assignedList.size() == 0) {
				assignedList = st.getElements(new TypeFilter<CtFieldWriteImpl>(CtFieldWriteImpl.class));
			}

			if (varaibleList.size() > 0 && assignedList.size() > 0) {

				String var = SUPREUtil.getSimpleVarName(varaibleList.get(0).toString());

				CtElement a = varaibleList.get(0);
				CtElement b = (CtElement) assignedList.get(0);
				String perturbVar = Variables.getRandomVariablesForAssignment(a, b);
				if (perturbVar == null || "".equals(perturbVar)) {
					perturbVar = "null";
				}
				if (groundTruth.contains("=")) {
					String start = groundTruth.split("\\=")[0];
					String end = groundTruth.split("\\=")[1];
					if (end != null) {
						perturbCode = start + "= " + end.replace(var, perturbVar);
					}
				}
			}

		}

		/**
		 * We try to perturb the literals
		 */

		if (perturbCode == null) {
			perturbCode = LiteralPerturbation.perturb(st, groundTruth);
		}

		// replace type
		if (perturbCode == null) {
			perturbCode = TypePerturbation.perturb(st, groundTruth);
		}

		// remove assignment
		if (perturbCode == null && groundTruth.contains("=")) {
			r = SUPREUtil.getRandomDouble();
			if (r > 0.7) {
				perturbCode = groundTruth.split("=")[0] + ";";
			} else if (r > 0.5) {
				perturbCode = groundTruth.split("=")[0] + " = null ;";
			} else {
				perturbCode = groundTruth.split("=")[0] + " =  " + groundTruth.split("=")[0] + ";";
			}

		}

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("lineNo1", lineNo1 + "");
		map.put("lineNo2", lineNo2 + "");
		map.put("lineNo3", lineNo3 + "");
		map.put("lineNo4", "");
		map.put("lineNo5", "");
		map.put("line1", perturbCode);
		map.put("line2", "");
		map.put("line3", "");
		map.put("line4", "");
		map.put("line5", "");
		map.put("groundTruth", groundTruth);
		map.put("methodStart", methStart + "");
		map.put("methodEnd", methEnd + "");
		map.put("repairAction", "[REPLACE]");
		System.out.println("replace assignment");

		PerturbResult.getCorruptedResult(map);

	}
}
