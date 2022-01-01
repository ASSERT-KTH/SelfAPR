package code.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

import code.perturbation.PerturbActions;
import code.utils.EditDistance;
import code.utils.SUPREUtil;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtNamedElement;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.reference.CtExecutableReferenceImpl;

public class StatementAnalysis {
	static HashMap<String,SourcePosition>  ctStatements = new HashMap<String,SourcePosition> ();
	

	
	public static void storeStatement(List<CtStatement> states) {
		for(CtStatement st : states) {
			String s = st.toString().trim();
			ctStatements.put(s,st.getPosition());
		}	
	}
	
	
	
	public static String getSimStatement(String origState,SourcePosition origPosition) {
		
		String origNoSpace = origState.replace(" ", "");
		origState = origState.trim();
		if (origState=="") {
		int vsize = ctStatements.size();
		int randint = (int) (Math.random()*(vsize - 1) + 1);
//		String randStatement = (String) ctStatements.get(randint);
		
		return "";
		
		} else {
			String target = "";
			SourcePosition targetLine;
			double maxScore=0;
			for(String s : ctStatements.keySet()) {
				if(ctStatements.get(s).getLine() != origPosition.getLine()) {
				s = SUPREUtil.getSpecificLine(ctStatements.get(s), ctStatements.get(s).getLine());
				if(s==null) {
					break;
				}
				String nospcaceS  = s.replace(" ", "");
				if(!nospcaceS.equals(origNoSpace)) {
				double score = EditDistance.similarity(s, origState);
				if (score > maxScore) {
					maxScore = score;
					target = s;
				}
				}
				}
			}
			

			return target;
		}
		
			
	}
	

	
	
	


	public static void getPerturbated(List<CtStatement> states, int methStart, int methEnd) {	
		
		for(CtStatement st : states) {
			PerturbActions.randomPerturb(st,"statement",methStart,methEnd);		
		}
		
	}



	public static void analysis(CtElement rootElement) {

		List<CtStatement> statements = rootElement
				.getElements(new TypeFilter<CtStatement>(CtStatement.class));
		
		storeStatement(statements);
	}

}
