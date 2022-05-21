package code.perturbation.buglab;

import java.util.List;

import code.analysis.Variables;
import code.output.result.PerturbResult;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtLiteralImpl;

public class WrongLiteral {

	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5) {
		/**
		 * Wrong Literal Perturbation
		 */

		String actionNo = "[BugLab_Wrong_Literal]";

		TypeFilter<CtLiteralImpl> literalfilter = new TypeFilter<CtLiteralImpl>(CtLiteralImpl.class);
		List<CtLiteralImpl> literals = st.getElements(literalfilter);

		if (literals.size() > 0) {

			for (CtLiteralImpl literal : literals) {
				String perturbCode = null;
				String literalType = literal.getType().getSimpleName();
				String value = literal.toString();

				if (groundTruth.contains(value) || value.contains("E") || literalType.contains("double")
						|| literalType.contains("float")) {

					if (literalType.contains("boolean")) {
						if (groundTruth.contains("true")) {
							perturbCode = groundTruth.replace("true", "false");
						} else if (groundTruth.contains("false")) {
							perturbCode = groundTruth.replace("false", "true");
						}
					}

					else if (literalType.contains("int")) {

						// replace literature with the same type variable
						String newInt = Variables.getRandomVariablesByStringType("int");
						if (newInt != null && SelfAPRUtil.getRandomDouble() > 0.5) {
							perturbCode = groundTruth.replace(value, newInt);
						}

						if (perturbCode == null) {
							if (groundTruth.contains("+ " + value)) {
								perturbCode = groundTruth.replace("+ " + value, "");
							} else if (groundTruth.contains("- " + value)) {
								perturbCode = groundTruth.replace("- " + value, "");
							}
						}

						// modify old integer with + - * / a new random integer

						if (perturbCode == null) {

							if (SelfAPRUtil.getRandomDouble() > 0.5)
								perturbCode = groundTruth.replace(value,
										(Integer.parseInt(value) + SelfAPRUtil.getRandomInt(2)) + "");
							else {
								perturbCode = groundTruth.replace(value,
										(Integer.parseInt(value) - SelfAPRUtil.getRandomInt(2)) + "");
							}
						}
					}

					if (!groundTruth.equals(perturbCode) && perturbCode != null) {

						PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "",
								lineNo2, lineNo3, lineNo4, lineNo5, groundTruth);

					}

				}

			}
		}

	}
}
