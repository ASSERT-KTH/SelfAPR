package code.perturbation;

import java.util.List;

import code.utils.SUPREUtil;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;
import spoon.support.reflect.code.CtInvocationImpl;
import spoon.support.reflect.code.CtLiteralImpl;
import spoon.support.reflect.code.CtVariableReadImpl;

public class LiteralPerturbation {

	public static String perturb(CtElement st, String groundTruth) {

		String perturbCode = null;
		TypeFilter<CtLiteralImpl> literalfilter = new TypeFilter<CtLiteralImpl>(CtLiteralImpl.class);
		List<CtLiteralImpl> literals = st.getElements(literalfilter);

		if (literals.size() > 0) {
			CtLiteralImpl i = literals.get(0);
			String type = i.getType().getSimpleName();
			String value = i.toString();
			Object valueObj = i.getValue();

			double r = SUPREUtil.getRandomDouble();

			if (type.contains("int")) {
				String randInt = value + "";
				while (randInt.equals(value + "")) {
					
				if(groundTruth.contains("size") || groundTruth.contains("length") ) {
					randInt = SUPREUtil.getRandomInt(1)+" ";
					perturbCode = groundTruth.replace(value + "", randInt + "");
					
					//operator:
					List<CtBinaryOperatorImpl> ops = st.getElements(new TypeFilter<CtBinaryOperatorImpl>(CtBinaryOperatorImpl.class));
					System.out.print("");

				}
					
					
				else {
					if (r > 0.7) {
						randInt = SUPREUtil.getRandomInt((Integer) valueObj) + SUPREUtil.getRandomInt(5)+"";
					} else if (r > 0.4) {
						randInt = SUPREUtil.getRandomInt(5) + "";
					} else if (r > 0.3) {
						randInt = randInt + "L";
					}else  {
						randInt = randInt + SUPREUtil.getRandomActionOperator("") + SUPREUtil.getRandomInt(5);
					}
				}						
				perturbCode = groundTruth.replace(value + "", randInt + "");

				}
			}

			else if (type.contains("long")) {
				String randLong = value + "";
				if (randLong.contains("L")) {
					randLong = randLong.replace("L", "");
				} else if (r > 0.7) {
					randLong = SUPREUtil.getRandomInt(100) + "";
				} else if(r>0.5){
					randLong = value + "D";
				} else {
					randLong = randLong + SUPREUtil.getRandomActionOperator("") + SUPREUtil.getRandomInt(5);
				}
				perturbCode = groundTruth.replace(value + "", randLong + "");
			}

			else if (type.contains("double")) {
				String randLong = value + "";
				if (randLong.contains("D") || randLong.contains("d")) {
					if (SUPREUtil.getRandomDouble() > 0.5) {
						randLong = randLong.replace("D", "");
						randLong = randLong.replace("d", "");
					} else {
						randLong = randLong.replace("D", "f");
						randLong = randLong.replace("d", "f");
					}
				} else if (r > 0.5) {
					randLong = SUPREUtil.getRandomInt(5) + ".0d";
				} else {
					randLong = value + "D";
				}
				perturbCode = groundTruth.replace(value + "", randLong + "");
			}

			else if (type.contains("double")) {
				String randLong = value + "";
				if (randLong.contains("F") || randLong.contains("f")) {
					if (SUPREUtil.getRandomDouble() > 0.2) {
						randLong = randLong.replace("F", "");
						randLong = randLong.replace("f", "");
					}
				} else if (r > 0.5) {
					randLong = SUPREUtil.getRandomInt(5) + "";
				}
				perturbCode = groundTruth.replace(value + "", randLong + "");
			}

			else if (type.contains("string")) {
				String randString = value + "";
				int index = SUPREUtil.getRandomInt(randString.length()) ;
				int start=0;
				if(index>0) {	
					start = SUPREUtil.getRandomInt(index) ;
				}
				if (r > 0.7) {
				//return substring
				randString = randString.substring(start, index);
				} else if(r>0.35) {
				//repeat substring
				randString = randString.substring(start, index)+randString;	
				} else {
				//repeat substring
				randString = randString+randString.substring(start, index);
				}

			}

			else if (type.contains("boolean")) {
				if (groundTruth.contains("true")) {
					if (SUPREUtil.getRandomDouble() > 0.6) {
						perturbCode = groundTruth.replaceFirst(value + "", "false");
					} else if (SUPREUtil.getRandomDouble() > 0.3) {
						perturbCode = groundTruth.replace(value + "", "false");
					} else {
						//replace last currence
						int index = groundTruth.lastIndexOf("true");
						String before = groundTruth.substring(0, index);
						String later = groundTruth.substring(index, groundTruth.length());
						later=later.replace("true", "false");
						perturbCode = before+later;
					}
				} else if (groundTruth.contains("false")) {
					if (SUPREUtil.getRandomDouble() > 0.6) {
						perturbCode = groundTruth.replaceFirst(value + "", "true");
					} else if (SUPREUtil.getRandomDouble() > 0.3) {
						perturbCode = groundTruth.replace(value + "", "true");
					}else {
						//replace last currence
						int index = groundTruth.lastIndexOf("false");
						String before = groundTruth.substring(0, index);
						String later = groundTruth.substring(index, groundTruth.length());
						later=later.replace("false", "true");
						perturbCode = before+later;
					}
				}
			}

		}

		return perturbCode;

	}

}
