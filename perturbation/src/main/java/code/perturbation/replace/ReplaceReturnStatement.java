package code.perturbation.replace;

import java.util.HashMap;
import java.util.List;

import code.output.result.PerturbResult;
import code.utils.SUPREUtil;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtExpression;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;
import spoon.support.reflect.code.CtReturnImpl;

public class ReplaceReturnStatement {

	public static void replaceReturn(List<CtReturnImpl>  st, String type, int methodStart, int methodEnd) {
		
		TypeFilter<CtBinaryOperatorImpl> bOfilter = new TypeFilter<CtBinaryOperatorImpl>(CtBinaryOperatorImpl.class);

		
		
		
		List<CtBinaryOperatorImpl> operators = st.get(0).getElements(bOfilter);
		
		
		String returnStr = st.get(0).toString();
		
		int lineNo1 = st.get(0).getPosition().getLine();
		
		String corruptedCode="";
		String groundTruth = SUPREUtil.getSpecificLine(st.get(0).getPosition(), lineNo1);
		double r = SUPREUtil.getRandomDouble();
		
		if ((groundTruth.contains("&&") || groundTruth.contains("||") ) && r>0.5) {
			
			 r = SUPREUtil.getRandomDouble();
			if(groundTruth.contains("&&")) {
			if(r>0.7) {
			corruptedCode = groundTruth.split("&&")[0]+";";
			}else if(r>0.4) {
				corruptedCode = "return  "+groundTruth.split("&&")[1];
			} else {
				corruptedCode = groundTruth.replace("&&","||" );
			}
			}
			
			
			if(groundTruth.contains("||")) {
				if(r>0.7) {
				corruptedCode = groundTruth.split("||")[0]+";";
				}else if(r>0.4) {
					corruptedCode = "return  "+groundTruth.split("||")[1];
				} else {
					corruptedCode = groundTruth.replace("||","&&" );
				}
			}
			
			
			if(SUPREUtil.getRandomDouble()>0.5 && operators.size()>0) {
				
				CtBinaryOperatorImpl logicOperator = operators.get(SUPREUtil.getRandomInt(operators.size()));
				String origOpKind = logicOperator.getKind().toString();
				String origOperator = SUPREUtil.getOperatorValue(origOpKind);
				String perturbedOperator = SUPREUtil.getRandomLogicOperator(origOperator);				
				corruptedCode = corruptedCode.replace(origOperator, perturbedOperator);								
			}
			
			
			
		}else if (operators.size()>0) {	
			
			CtBinaryOperatorImpl logicOperator = operators.get(SUPREUtil.getRandomInt(operators.size()));
		  //return element with binary operator
			String origOpKind = logicOperator.getKind().toString();
			String origOperator = SUPREUtil.getOperatorValue(origOpKind);
			String perturbedOperator = SUPREUtil.getRandomLogicOperator(origOperator);

			if(logicOperator.getKind().equals(BinaryOperatorKind.EQ)) {
				if(r>0.6) {
					perturbedOperator="!=";
					corruptedCode = groundTruth.replace(origOperator, perturbedOperator);				
				}else if(r>0.5) {
					perturbedOperator="=";
					corruptedCode = groundTruth.replace(origOperator, perturbedOperator);				
				} else {
					CtExpression left = logicOperator.getLeftHandOperand();
					corruptedCode=groundTruth.replace(left.toString(), SUPREUtil.getRandomVariable(left));
				}
			}
			
			
			else if(logicOperator.getKind().equals(BinaryOperatorKind.NE)) {
				if(r>0.6) {
					perturbedOperator="==";
					corruptedCode = groundTruth.replace(origOperator, perturbedOperator);				
				}else if(r>0.5) {
					perturbedOperator="=";
					corruptedCode = groundTruth.replace(origOperator, perturbedOperator);				
				} else {
					CtExpression left = logicOperator.getLeftHandOperand();
					corruptedCode=groundTruth.replace(left.toString(), SUPREUtil.getRandomVariable(left));
				}
			}
			
		
		} else {
	     //return element w/o binary operator
		if(r>0.9) {
		 corruptedCode = "return "+ SUPREUtil.randomReturnElement();
		}else if (r>0.5) {
			corruptedCode = "return "+ SUPREUtil.randomReturnElement()+";";			
		}else if (r>0.3) {
			corruptedCode = groundTruth.replace("return","" );
		} else {
			corruptedCode = "return;";
		}
		}
		
		HashMap<String, String> map = new HashMap<String, String>();
		String lineNo2 = "";
		
		map.put("lineNo1", lineNo1 + "");
		map.put("lineNo2", lineNo2 + "");
		map.put("lineNo3", "");
		map.put("lineNo4", "");
		map.put("lineNo5", "");
		map.put("line1", corruptedCode);
		map.put("line2", "");
		map.put("line3", "");
		map.put("line4", "");
		map.put("line5", "");
		map.put("groundTruth", groundTruth);
		map.put("methodStart", methodStart + "");
		map.put("methodEnd", methodEnd + "");
		map.put("repairAction", "[REPLACE]");
		map.put("targetFile", "");

		System.out.print("replace return");
		PerturbResult.getCorruptedResult(map);	
		
		
	}
	
	
	
	
		
}
