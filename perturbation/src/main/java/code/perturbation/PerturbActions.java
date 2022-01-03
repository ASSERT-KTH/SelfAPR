package code.perturbation;

import java.util.HashMap;
import java.util.List;

import code.analysis.StatementAnalysis;
import code.perturbation.remove.Remove;
import code.perturbation.replace.Replace;
import code.utils.SUPREUtil;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.cu.position.NoSourcePosition;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtAssignmentImpl;
import spoon.support.reflect.code.CtIfImpl;
import spoon.support.reflect.code.CtReturnImpl;
import spoon.support.reflect.declaration.CtFieldImpl;

public class PerturbActions {

	public static void randomPerturb(CtElement st, String type, int methStart, int methEnd) {

		double r = SUPREUtil.getRandomDouble();

		Object o = st.getPosition();

		if (o instanceof NoSourcePosition) {
			return;
		}

		if (type.contains("declaration")) {
			Replace.replace(st, type, methStart, methEnd);
		}

		else if (r > 0.0) {
			Replace.replace(st, type, methStart, methEnd);
		} else {
			Remove.remove(st, type, methStart, methEnd);
		}

	}

	/**
	 * This is where we start to perturb the code!
	 * 
	 * @param fieldList
	 * @param constructorList
	 * @param methodList
	 */
	public static void perturb(List<CtFieldImpl> fieldList, List<CtConstructor> constructorList,
			List<CtMethod> methodList) {
		 fieldPerturb(fieldList);
		constructorPerturb(constructorList);

	}

	public static void fieldPerturb(List<CtFieldImpl> fieldList) {
		for (CtFieldImpl variable : fieldList) {
			int start = variable.getPosition().getLine();
			int end = variable.getPosition().getEndLine();
			PerturbActions.randomPerturb(variable, "declaration", start, end);
		}

	}

	public static void constructorPerturb(List<CtConstructor> constructors) {
		for (CtConstructor cons : constructors) {

			SourcePosition position = cons.getPosition();
			int methStart = position.getLine();
			int methEnd = position.getEndLine();

			CtBlock block = cons.getBody();
			if (block != null) {
				List<CtStatement> statements = block.getStatements();
				for (CtStatement st : statements) {

					TypeFilter<CtIfImpl> condfilter = new TypeFilter<CtIfImpl>(CtIfImpl.class);
					TypeFilter<CtReturnImpl> returnfilter = new TypeFilter<CtReturnImpl>(CtReturnImpl.class);
					TypeFilter<CtStatement> statesFilter = new TypeFilter<CtStatement>(CtStatement.class);
					List<CtStatement> states = st.getElements(statesFilter);

					// conditions
					List<CtIfImpl> conditions = st.getElements(condfilter);
					if (conditions.size() > 0) {
						PerturbActions.randomPerturb(st, "condition", methStart, methEnd);

					} else if (states.size() > 0) {
						// CtAssignmentImpl
						
						TypeFilter<CtAssignmentImpl> assignmentfilter = new TypeFilter<CtAssignmentImpl>(CtAssignmentImpl.class);
						List<CtAssignmentImpl> assignments = st.getElements(assignmentfilter);
						
						if(assignments.size()>0) {
							PerturbActions.randomPerturb(st, "assignment", methStart, methEnd);
						}

						

					}

				}
			}
		}
	}

}
