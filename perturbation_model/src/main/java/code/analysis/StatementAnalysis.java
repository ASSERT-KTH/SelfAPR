package code.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import code.perturbation.PerturbActions;
import code.perturbation.utils.EditDistance;
import code.perturbation.utils.SelfAPRUtil;
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
	
	static ArrayList<String> _statementInMethod = new ArrayList<String>();

	
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
				s = SelfAPRUtil.getSpecificLine(ctStatements.get(s), ctStatements.get(s).getLine());
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
	

	public static String getRandomStatementInMethod(CtElement st) {
		
		 ArrayList<String> targetList = _statementInMethod;
		if(targetList==null ||targetList.size()==0) {
			return null;
		}
		
		
		
		double maxScore=0;
		String simStatement=null;
		int count=0;
		for(String s : targetList) {
			count+=1;
			if(!st.toString().equals(s)) {	
				double score = EditDistance.similarity(s, st.toString());
				if (score > maxScore && score>0.5) {
					maxScore = score;
					simStatement = s;
				}		
				
				if(SelfAPRUtil.getRandomDouble()>0.6 && simStatement!=null) {
					break;
				}				
			}			
		}	
		
		
		if(simStatement!=null) {					
			String simpleSimStatement = "";
			String[] strs = simStatement.split(" ");
			for(String s: strs) {
				if(s.contains(".")) {
					String[] dotSize = s.split("\\.");				
					if(dotSize.length>2) {
						s=s.substring(s.lastIndexOf(".")+1);	
						simpleSimStatement+=s+" ";
					} else {
						simpleSimStatement+=s+" ";
				}															
				} else {
					simpleSimStatement+=s+" ";
				}
			}						
		return simpleSimStatement;		
		
		} else {
			return null;
		}				
	}


	public static void analysis(CtElement method) {
		_statementInMethod = new ArrayList<String>();

		List<CtStatement> statementsList = method.getElements(new TypeFilter<CtStatement>(CtStatement.class));
		for(CtStatement s :statementsList) {
			try {
			_statementInMethod.add(s.toString());
			} catch (Exception e) {
				System.out.println("=============exception=========" + e.getLocalizedMessage());
			}
		}
		
	}

}
