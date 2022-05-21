package code.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.PerturbActions;
import code.perturbation.utils.EditDistance;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtIfImpl;

public class ConditionAnalysis {

	static List<String> _booleanExpCurrentMethod = new ArrayList<String>();
	static List<String> _booleanExpCurrentClass = new ArrayList<String>();

	public static String getConditions(String originCondition, Double similarity) {

		if (originCondition == null || "".equals(originCondition)) {
			return null;
		}

		if (similarity == null) {
			similarity = 0.1;
		}

		
		if(_booleanExpCurrentMethod.size()==0) {
			return null;
		}
		
		
		// get the most similar statement
		double minScore = 1;
		String simStatement = null;

		for (String s : _booleanExpCurrentMethod) {
			if (!originCondition.equals(s) &&! s.contains("null")) {
				double score = EditDistance.similarity(s, originCondition);
				if (score < minScore && score > similarity) {
					minScore = score;
					simStatement = s;
				}
			}
		}

		if (simStatement != null) {
			simStatement = simStatement.replace("(", " ( ");
			simStatement = simStatement.replace(")", " ) ");

			String simpleSimStatement = "";
			String[] strs = simStatement.split(" ");
			for (String s : strs) {
				if (s.contains(".")) {
					String[] dotSize = s.split("\\.");
					if (dotSize.length > 2) {
						s = s.substring(s.lastIndexOf(".") + 1);
						simpleSimStatement += s + " ";
					} else {
						simpleSimStatement += s + " ";
					}
				} else {
					simpleSimStatement += s + " ";
				}
			}
			return simpleSimStatement;

		} else {
			return null;
		}

	}

	public static void currentConditions(CtMethod method) {
		
		_booleanExpCurrentMethod =  new ArrayList<String>();

		List<CtIfImpl> conditions = method.getElements(new TypeFilter<CtIfImpl>(CtIfImpl.class));

		for (CtIfImpl cond : conditions) {
			// condition
//			CtExpression<Boolean> booleanExpression = cond.getCondition();
//			_booleanExpCurrentMethod.add(booleanExpression.toString());
//			_booleanExpCurrentClass.add(booleanExpression.toString());

			System.out.print("");
		}

	}

}
