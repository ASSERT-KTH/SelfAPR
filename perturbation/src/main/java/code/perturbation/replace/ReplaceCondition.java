package code.perturbation.replace;

import java.util.HashMap;
import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.OperatorPerturbation;
import code.utils.SUPREUtil;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.Filter;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;
import spoon.support.reflect.code.CtIfImpl;

public class ReplaceCondition {

	public static void perturb(CtElement st, int methStart, 
			int methEnd, String groundTruth, int lineNo1,
			String lineNo2, String lineNo3) {
		TypeFilter<CtBinaryOperatorImpl> bOfilter = new TypeFilter<CtBinaryOperatorImpl>(CtBinaryOperatorImpl.class);

		String perturbCode = null;
		
		List<CtBinaryOperatorImpl> operators = st.getElements(bOfilter);
		for(CtBinaryOperatorImpl logicOperator:operators) {
			
			String origOpKind = logicOperator.getKind().toString();
			String origOperator = SUPREUtil.getOperatorValue(origOpKind);
			double r = SUPREUtil.getRandomDouble();
			if(r>0.6 && operators.size()>0) {
				//we perturb operators only
							
				perturbCode = OperatorPerturbation.perturb(st,groundTruth);
				
				
			}else if (perturbCode == null && r>0.4) {
				//we perturb left
				CtExpression left = logicOperator.getLeftHandOperand();
				String leftstr = SUPREUtil.getSimpleVarName(left.toString());
				leftstr = SUPREUtil.getSimpleVarName(leftstr);
				
				perturbCode=groundTruth.replace(leftstr+" ", SUPREUtil.getRandomVariable(left)+" ");
				
			} else if(r>0.0) {
				//we perturb right
				CtExpression right = logicOperator.getRightHandOperand();
				
				String rightstr = right.toString();
				rightstr = SUPREUtil.getSimpleVarName(rightstr);
				
				perturbCode=groundTruth.replace(rightstr+" ",SUPREUtil.randomReturnElement()+"");


			} else {
				
			}
			
			HashMap<String, String> map = new HashMap<String, String>();

			map.put("lineNo1", lineNo1 + "");
			map.put("lineNo2",  "");
			map.put("lineNo3", "");
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
			System.out.println("replace condition");

			PerturbResult.getCorruptedResult(map);	


		}
		

		
		
	}

}
