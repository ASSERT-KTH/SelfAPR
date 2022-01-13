package code.perturbation;

import java.util.List;

import code.analysis.MethodSignature;
import code.analysis.Variables;
import code.utils.SUPREUtil;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;

public class OperatorPerturbation {

	public static String perturb(CtElement st, String groundTruth) {

		String corruptedCode = null;

		double r = SUPREUtil.getRandomDouble();
		TypeFilter<CtBinaryOperatorImpl> bOfilter = new TypeFilter<CtBinaryOperatorImpl>(CtBinaryOperatorImpl.class);
		List<CtBinaryOperatorImpl> operators = st.getElements(bOfilter);

		
		
		
		
		
		if (operators.size() == 0) {
			return null;
		}

		CtBinaryOperatorImpl logicOperator = null;
		if (operators.size() > 0) {
			logicOperator = operators.get(0);
		}
		
		
		
		
		

		/**
		 * a = (b == c) ? d: e;
		 * 
		 */
		if (groundTruth.contains("?") && r > 0.2) {

			if (groundTruth.contains("=") && groundTruth.contains(":")) {

				int eq = groundTruth.indexOf("=");
				String tmp = groundTruth.charAt(eq + 1)+"";
				if (!"=".equals(tmp)) {
					if (SUPREUtil.getRandomDouble() > 0.5) {
						// after : a = e;
						String start = groundTruth.split("\\=")[0];
						String end = groundTruth.split("\\:")[1];
						corruptedCode = start + " = " + end;
					} else {
						// a = d;
						String start = groundTruth.split("\\=")[0];
						String end = groundTruth.split("\\?")[1];
						if (end.contains(":")) {
							end = end.split("\\:")[0];
							corruptedCode = start + " = " + end + ";";
						}
					}

				} else {

					String start = groundTruth.split(" ")[0];
					if (SUPREUtil.getRandomDouble() > 0.5) {
						String end = groundTruth.split("\\:")[1];

						corruptedCode = start + end;
					} else {
						String end = groundTruth.split("\\?")[1];
						if (end.contains(":")) {
							end = end.split("\\:")[0];
							corruptedCode = start + "  " + end + ";";
						}
					}
				}
			}
		}
		
		
		
		//check getLeftHandOperand length & size
				if(groundTruth.contains("length") || groundTruth.contains("size")  ){
					groundTruth = groundTruth.replace(" ( ", "(");
					groundTruth = groundTruth.replace(" ) ", ")");		
					
					
					String oldstr="";
					String newstr = "";
					
					if(groundTruth.contains("size()")){
						oldstr = "size()";
						newstr = "length()";
					} else if(groundTruth.contains("length()")){
						oldstr = "length()";
						newstr = "size()";

					} else {
						oldstr = "length";
						newstr = "length()";
					}
					
					if(groundTruth.contains(oldstr)){
						r = SUPREUtil.getRandomDouble();
						if(r>0.8) {
						corruptedCode = groundTruth.replace(oldstr, newstr);
						} else if(r>0.4) {
						String newop = SUPREUtil.getRandomDouble()>0.5 ? " + ":" - ";
						String newint = 	SUPREUtil.getRandomInt(5)+1+"";	
						newstr = oldstr+newop+newint;
						corruptedCode = groundTruth.replace(oldstr, newstr);
						} else  {
							String newop = SUPREUtil.getRandomDouble()>0.5 ? " * ":" / ";
							if(SUPREUtil.getRandomDouble()>0.7) {
								newop = " % ";
							}
							String newint = SUPREUtil.getRandomDouble()>0.5 ? " 0.5 ":" 2";		
							newstr = oldstr+newop+newint;

							
							corruptedCode = groundTruth.replace(oldstr, newstr);					
						}				
					}								
					
					
					if(corruptedCode!=null) {
						
						corruptedCode = corruptedCode.replace("(", " ( ");
						corruptedCode = corruptedCode.replace(")", " ) ");
						
						return corruptedCode;
						
					}
				
				}
		
		
		
		
		
		
		
		
		
		
		
		
		

		/**
		 * 
		 * we care about && and || in statement
		 * 
		 */
		if (!groundTruth.contains("if") && ((groundTruth.contains("&&") || groundTruth.contains("||")))
				&& corruptedCode == null) {

			r = SUPREUtil.getRandomDouble();
			String sep = "";

			if (groundTruth.contains("&&")) {
				sep = "&&";
			} else if (groundTruth.contains("||")) {
				sep = "||";
			}
			int index = groundTruth.indexOf(sep);

			if (r > 0.5) {
				corruptedCode = groundTruth.substring(0, index) + ";";
			} else if (r > 0.2) {
				if (!groundTruth.contains("return")) {
					corruptedCode = groundTruth.replace(sep, SUPREUtil.getRandomLogicOperator(sep));
				} else {
					corruptedCode = "return  " + groundTruth.substring(index + 2, groundTruth.length());
				}
			} else {
				if ("&&".equals(sep)) {
					corruptedCode = groundTruth.replace("&&", "||");
				} else {
					corruptedCode = groundTruth.replace("||", "&&");
				}
			}
		}
		
		
		
		
		
		
		
		
		

		/**
		 * we care about other operators == != operators
		 * 
		 * 
		 */
		if (operators.size() > 0 && (SUPREUtil.getRandomDouble() > 0.7 || corruptedCode == null)) {
			// get a random operator
			// return element with binary operator

			if (corruptedCode != null) {
				groundTruth = corruptedCode;
			}

			if (groundTruth.contains("==") && groundTruth.contains("null")) {
				corruptedCode = groundTruth.replaceFirst("==", "!=");
			}

			else if (groundTruth.contains("!=") && groundTruth.contains("null")) {
				corruptedCode = groundTruth.replaceFirst("!=", "==");
			}

			else if (groundTruth.contains("instanceof")) {
				corruptedCode = groundTruth.replaceFirst("\\(" + "", "\\( !");
				System.out.print(corruptedCode);

			}

			else if (groundTruth.contains("!") && !groundTruth.contains("!=")) {
				corruptedCode = groundTruth.replaceFirst("!", "");
			}
			
			else {
				String op = SUPREUtil.getOperatorValue(operators.get(0).getKind().toString());
				if(groundTruth.contains(op)) {
					String newop = "";
//					if(op.length()==1) {
//						op="\\"+"\\"+op;
//					}
					
					if(op.contains("|")) {
						newop = op.replace("|", "&");
					}else if(op.contains("&")) {
						newop = op.replace("&", "|");
					}else if(op.contains(">=")) {
						String[] choice = {">","==","<=","<","!="};		
						newop = " "	+choice[ SUPREUtil.getRandomInt(5)]+" ";
					}else if(op.contains(">")) {
						String[] choice = {">=","==","<=","<","!="};		
						newop = " "	+choice[ SUPREUtil.getRandomInt(5)]+" ";
					}else if(op.contains("<=")) {
						String[] choice = {">=","==",">","<","!="};		
						newop = " "	+choice[ SUPREUtil.getRandomInt(5)]+" ";
					} else if(op.contains("<")) {
						String[] choice = {">=","==",">","<=","!="};		
						newop = " "	+choice[ SUPREUtil.getRandomInt(5)]+" ";
					}else if(op.contains("==")) {
						String[] choice = {"||","!=","&&"};		
						newop = " "	+choice[ SUPREUtil.getRandomInt(3)]+" ";
					}else if(op.contains("!=")) {
						String[] choice = {"==","=="};		
						newop = " "	+choice[ SUPREUtil.getRandomInt(2)]+" ";
					}					
					
					corruptedCode = groundTruth.replace(op, newop );
					corruptedCode = corruptedCode;
				}
				
			}

		}

		if (logicOperator != null && (r > 0.5 || corruptedCode == null)) {
			/**
			 * we replace Left and right Hand Operand
			 */

			if (corruptedCode != null) {
				groundTruth = corruptedCode;
			}

			r = SUPREUtil.getRandomDouble();
			CtExpression left = logicOperator.getLeftHandOperand();
			CtExpression right = logicOperator.getRightHandOperand();

			String leftStr = SUPREUtil.getSimpleVarName(left.toString());
			String rightStr = SUPREUtil.getSimpleVarName(right.toString());

			String origOpKind = logicOperator.getKind().toString();
			String origOperator = SUPREUtil.getOperatorValue(origOpKind);

			if (groundTruth.contains("instanceof") && r > 0.2) {
				// the right hand is a class
				String newConstruct = MethodSignature.getRandomClass(rightStr);
				if(groundTruth.contains(" "+leftStr) && newConstruct!=null) {
				corruptedCode = groundTruth.replaceFirst(" "+leftStr, newConstruct);
				}

			}

			else if (r > 0.5) {
				// replace left
				String newleft = "";
				if (!"null".equals(rightStr)) {
					newleft = Variables.getRandomVariablesForAssignment(left, right);
				} else {
					newleft = Variables.getRandomVariables(left);
				}

				if ( groundTruth.contains(" "+leftStr) &&   newleft != null && !"".equals(newleft) && !"null".equals(newleft)) {
					corruptedCode = groundTruth.replaceFirst(" "+leftStr, newleft);
				}

			} else if (r > 0.2) {
				// replace right
				String newright = Variables.getRandomVariables(right);

				if (!"null".equals(leftStr) && !"null".equals(rightStr)) {
					newright = Variables.getRandomVariablesForAssignment(left, right);
				} else if ("null".equals(rightStr) || "this".equals(rightStr)) {

					if (SUPREUtil.getRandomDouble() > 0.4) {
						newright = Variables.getRandomVariables(left);
					} else {
						newright = "null".equals(rightStr) ? " this " : " null ";
					}
				}

				if (  groundTruth.contains(" "+rightStr) &&   newright != null && !"".equals(newright)) {
					corruptedCode = groundTruth.replace(" "+rightStr, newright);
				}

			} else {
				// replace both
				String newleft = Variables.getRandomVariablesForAssignment(left,right);
				if (newleft != null && !"".equals(newleft)   && groundTruth.contains(" "+leftStr) ) {
					corruptedCode = groundTruth.replaceFirst(leftStr, newleft);
				}
				String newright = Variables.getRandomVariables(right);
				if (newright != null && !"".equals(newright) && corruptedCode != null  && groundTruth.contains(" "+rightStr)) {
					corruptedCode = corruptedCode.replaceFirst(rightStr, newright);
				}
			}

		}

		// if ( operators.size() > 0 && corruptedCode==null) {
		//
		// /**
		// * - a + b; + a * b; + a;
		// */
		// logicOperator = operators.get(SUPREUtil.getRandomInt(operators.size() - 1));
		// String origOpKind = logicOperator.getKind().toString();
		// String origOperator = SUPREUtil.getOperatorValue(origOpKind);
		// String perturbedOperator = SUPREUtil.getRandomLogicOperator(origOperator);
		// if (SUPREUtil.getRandomDouble() > 0.5) {
		// corruptedCode = corruptedCode.replace(origOperator, perturbedOperator);
		// }
		// }

		if (corruptedCode == null && logicOperator != null) {
			String origOpKind = logicOperator.getKind().toString();
			String origOperator = SUPREUtil.getOperatorValue(origOpKind);
			String perturbedOperator = SUPREUtil.getRandomLogicOperator(origOperator);
			if (corruptedCode == null) {
				corruptedCode = groundTruth.replace(origOperator, perturbedOperator);
			} else {
				corruptedCode = corruptedCode.replace(origOperator, perturbedOperator);
			}
		}
		
		
		
		
		
		
		
		
		groundTruth = groundTruth.trim();
		if(groundTruth.startsWith("return")) {
			if(corruptedCode==null) {
			String element = ( SUPREUtil.getRandomDouble() )>0.5 ? "true ;":"false ;" ;
			if(groundTruth.contains("==")) {				
				corruptedCode = groundTruth.split("==")[0]+";";	
				if(SUPREUtil.getRandomDouble() >0.7){
				corruptedCode =  "return "+ element;}
			}
			else if(groundTruth.contains("!=")) {				
				corruptedCode = groundTruth.split("==")[0]+";";
				if(SUPREUtil.getRandomDouble() >0.7){
					corruptedCode =  "return "+ element;}
			}
			else if(groundTruth.contains(">=")) {				
				corruptedCode = groundTruth.split(">=")[0]+";";
				if(SUPREUtil.getRandomDouble() >0.7){
					corruptedCode =  "return "+ element;}
			}
			else if(groundTruth.contains("<=")) {				
				corruptedCode = groundTruth.split("<=")[0]+";";
				if(SUPREUtil.getRandomDouble() >0.7){
					corruptedCode =  "return "+ element;}
			}
			else if(groundTruth.contains("<")) {				
				corruptedCode = groundTruth.split("<")[0]+";";
				if(SUPREUtil.getRandomDouble() >0.7){
					corruptedCode =  "return "+ element;}
			}else if(groundTruth.contains(">")) {				
				corruptedCode = groundTruth.split(">")[0]+";";
				if(SUPREUtil.getRandomDouble() >0.7){
					corruptedCode =  "return "+ element;}
			}
			
			
			
						
		}else {
			String element = ( SUPREUtil.getRandomDouble() )>0.5 ? "true ;":"false ;" ;
			if(corruptedCode.contains("==")) {				
				corruptedCode = corruptedCode.split("==")[0]+";";	
				if(SUPREUtil.getRandomDouble() >0.7){
				corruptedCode =  "return "+ element;}
			}
			else if(corruptedCode.contains("!=")) {				
				corruptedCode = corruptedCode.split("==")[0]+";";
				if(SUPREUtil.getRandomDouble() >0.7){
					corruptedCode =  "return "+ element;}
			}
			else if(corruptedCode.contains(">=")) {				
				corruptedCode = corruptedCode.split(">=")[0]+";";
				if(SUPREUtil.getRandomDouble() >0.7){
					corruptedCode =  "return "+ element;}
			}
			else if(corruptedCode.contains("<=")) {				
				corruptedCode = corruptedCode.split("<=")[0]+";";
				if(SUPREUtil.getRandomDouble() >0.7){
					corruptedCode =  "return "+ element;}
			}
			else if(corruptedCode.contains("<")) {				
				corruptedCode = corruptedCode.split("<")[0]+";";
				if(SUPREUtil.getRandomDouble() >0.7){
					corruptedCode =  "return "+ element;}
			}else if(corruptedCode.contains(">")) {				
				corruptedCode = corruptedCode.split(">")[0]+";";
				if(SUPREUtil.getRandomDouble() >0.7){
					corruptedCode =  "return "+ element;}
			}
		}
				
	}
		return corruptedCode;

	}
}
