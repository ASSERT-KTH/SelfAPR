package code.perturbation.selfAPR;

import java.util.HashMap;
import java.util.List;

import code.analysis.Variables;
import code.output.result.PerturbResult;
import code.perturbation.utils.OperatorUtil;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;
import spoon.support.reflect.code.CtLiteralImpl;

public class P3_Replace_Literal {

	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5) {

		/**
		 * P3 Literal Perturbation
		 */

		String actionNo = "[P3_Replace_Literal]";

		TypeFilter<CtLiteralImpl> literalfilter = new TypeFilter<CtLiteralImpl>(CtLiteralImpl.class);
		List<CtLiteralImpl> literals = st.getElements(literalfilter);

		if (literals.size() > 0) {

			for (CtLiteralImpl literal : literals) {
				String perturbCode = null;
				String literalType = literal.getType().getSimpleName();
				String value = literal.toString();

				if (groundTruth.contains(value) || value.contains("E") || literalType.contains("double") || literalType.contains("float")) {

					if (literalType.contains("boolean")) {
						if (groundTruth.contains("true")) {
							perturbCode = groundTruth.replace("true", "false");
						} else if (groundTruth.contains("false")) {
							perturbCode = groundTruth.replace("false", "true");
						}
					}

					/**
					 * String
					 */
					else if (literalType.contains("String")) {
						if (value.length() > 2) {
							String newvalue = "";
							int index = SelfAPRUtil.getRandomInt(value.length() - 2) + 1;
							int start = 1;
							if (index > 1) {
								int rand = SelfAPRUtil.getRandomInt(index);
								start = rand == 0 ? 1 : rand;
							}
							Double r = SelfAPRUtil.getRandomDouble();
							if (r > 0.7) {
								// substring
								newvalue = value.substring(0, 1) + value.substring(start, index)
										+ value.substring(value.length() - 1, value.length());
							} else if (r > 0.35) {
								// repeat substring in the beginning
								newvalue = value.substring(0, 1) + value.substring(start, index)
										+ value.substring(2, value.length());
							} else {
								// repeat substring in the end
								newvalue = value.substring(0, value.length() - 1) + value.substring(start, index)
										+ value.substring(value.length() - 1, value.length());
							}

							perturbCode = groundTruth.replace(value, newvalue);
						}

					}

					else if (literalType.contains("int")) {

						// replace literature with the same type variable					
						String newInt = Variables.getRandomVariablesByStringType("int");
						if(newInt!=null && SelfAPRUtil.getRandomDouble()>0.5) {
							perturbCode = groundTruth.replace(value,newInt);
						}			
						
						
						if(perturbCode==null) {
							if(groundTruth.contains("+ "+value)) {
								perturbCode = groundTruth.replace("+ "+value,"");
							}else if(groundTruth.contains("- "+value)) {
								perturbCode = groundTruth.replace("- "+value,"");
							}
						}
							

						// modify old integer with + - * / a new random integer
						
						if(perturbCode==null) {
						
						if (SelfAPRUtil.getRandomDouble() > 0.5)
							perturbCode = groundTruth.replace(value,
									(Integer.parseInt(value) + SelfAPRUtil.getRandomInt(10)) + "");
						else {
							perturbCode = groundTruth.replace(value,
									(Integer.parseInt(value) - SelfAPRUtil.getRandomInt(10)) + "");
						}
						}
					}

					
					else if (literalType.contains("float")) {
						String newValue = "";
						if (value.contains("F") || value.contains("f")) {
							newValue = value.replace("F", "");
							newValue = value.replace("f", "");
						} else {
							if( SelfAPRUtil.getRandomDouble()>0.5) {
							newValue = (Double.parseDouble(value) * SelfAPRUtil.getRandomInt(10))+"";
							} else {
							newValue = (Double.parseDouble(value) / SelfAPRUtil.getRandomInt(10))+"";
							}
						}
						
						if(groundTruth.contains(value)) {
						perturbCode = groundTruth.replace(value, newValue);
						} else if (groundTruth.contains("F")) {
							perturbCode = groundTruth.replace("F", "");
						}								
					}
					
					else if (literalType.contains("double")) {
						String newValue = "";
						if (value.contains("D") || value.contains("d")) {
							newValue = value.replace("D", "");
							newValue = value.replace("d", "");
						} else {
							if (SelfAPRUtil.getRandomDouble() > 0.5) {
								newValue = (Double.parseDouble(value) * SelfAPRUtil.getRandomInt(10))+ "";
							} else {
								newValue = (Double.parseDouble(value) / SelfAPRUtil.getRandomInt(10)) + "";
							}
						}

						if (value.contains("E")) {
							if (value.contains("-")) {
								value = value.substring(value.indexOf("-") + 1, value.length());
								int newvalue = Integer.parseInt(value.trim()) + 1;
								perturbCode = groundTruth.replace(newvalue + "",
										newvalue - SelfAPRUtil.getRandomInt(10) + "");
							}
						} else if (groundTruth.contains(value)) {
							perturbCode = groundTruth.replace(value, newValue);
						}
						
						
						 if (perturbCode==null && groundTruth.contains("D")) {
								perturbCode = groundTruth.replace("D", "");
							}				
						
					}

					if (!groundTruth.equals(perturbCode) && perturbCode != null) {

						PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "",
								lineNo2, lineNo3, lineNo4, lineNo5, groundTruth);

					}

				}

			}
		}

		if (groundTruth.contains("size (  )") || groundTruth.contains("length (  )")) {
			String perturbCode = null;
			String randOp = SelfAPRUtil.getRandomDouble() > 0.5 ? " + " : " - ";
			if (groundTruth.contains("size (  )")) {
				perturbCode = groundTruth.replace("size (  )", "size()" + randOp + SelfAPRUtil.getRandomInt(10));
			} else if (groundTruth.contains("length (  )")) {
				perturbCode = groundTruth.replace("length (  )", "length()" + randOp + SelfAPRUtil.getRandomInt(10));
			}

			if (!groundTruth.equals(perturbCode) && perturbCode != null) {

				PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "", lineNo2,
						lineNo3, lineNo4, lineNo5, groundTruth);

			}

		}

	}
}
