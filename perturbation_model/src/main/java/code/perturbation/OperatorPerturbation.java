package code.perturbation;

import java.util.List;

import code.perturbation.utils.OperatorUtil;
import code.perturbation.utils.SelfAPRUtil;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;

public class OperatorPerturbation {

	public static String perturb(CtElement st, String groundTruth) {

		String corruptedCode = null;
		
		//CtBinaryOperatorImpl expression
		List<CtBinaryOperatorImpl> operators = st.getElements(new TypeFilter<CtBinaryOperatorImpl>(CtBinaryOperatorImpl.class));
		
		if(operators.size()>0) {
			
			CtBinaryOperatorImpl expression = operators.get(SelfAPRUtil.getRandomInt(operators.size()-1));
			String origOpKind = expression.getKind().toString();

			String origOpKindValue = OperatorUtil.getOperatorValue(origOpKind);	
			String perturbOpKindValue = OperatorUtil.getRandomLogicOperator(origOpKindValue,groundTruth);
			
			corruptedCode = groundTruth.replaceFirst(" "+origOpKindValue+" ", " "+perturbOpKindValue+" ");
			return corruptedCode;

		}
		
		return corruptedCode;
	}
}
