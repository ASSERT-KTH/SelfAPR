package code.perturbation;

import java.util.ArrayList;
import java.util.List;

import code.analysis.Variables;
import code.utils.EditDistance;
import code.utils.SUPREUtil;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtAssignmentImpl;
import spoon.support.reflect.code.CtIfImpl;
import spoon.support.reflect.code.CtReturnImpl;

public class SimilarityPerturbation {
	
	static List<String> _statementList = new ArrayList<String>();
	static List<String> _returnList = new ArrayList<String>();
	static List<String> _conditionList = new ArrayList<String>();
	static List<String> _assignmentList = new ArrayList<String>();


	
	
	
	public static String perturb(CtElement st, String groundTruth, String type) {

		List<String> targetList = new ArrayList<String>();

		
		if("return".equals(type)) {
			targetList = _returnList;		
		} else if("condition".equals(type)) {
			targetList = _conditionList;		
		} else if("statement".equals(type)) {
			targetList = _statementList;
		}else if("assignment".equals(type)) {
			targetList = _assignmentList;
		}
		
		
		if(targetList==null ||targetList.size()==0) {
			return null;
		}
		
		
		//get the most similar statement
		double maxScore=0;
		String simStatement=null;
		
		for(String s : targetList) {
			if(!st.toString().equals(s)) {		
				double score = EditDistance.similarity(s, st.toString());
				if (score > maxScore && score>0.75) {
					maxScore = score;
					simStatement = s;
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
	
	
	public static void analysis(CtElement root) {
		List<CtMethod> methodList = root.getElements(new TypeFilter<CtMethod>(CtMethod.class));				

		for (CtMethod method : methodList) {
			CtBlock block = method.getBody();
			if (block != null) {
				List<CtStatement> statements = block.getStatements();
				for (CtStatement st : statements) {			
					List<CtStatement> states = st.getElements(new TypeFilter<CtStatement>(CtStatement.class));
					List<CtIfImpl> conditions = st.getElements(new TypeFilter<CtIfImpl>(CtIfImpl.class));
					List<CtReturnImpl> returns = st.getElements(new TypeFilter<CtReturnImpl>(CtReturnImpl.class));
					List<CtAssignmentImpl> assignments = st.getElements(new TypeFilter<CtAssignmentImpl>(CtAssignmentImpl.class));						

					for(CtStatement s:  states) {
						_statementList.add(s.toString());
					}
					
					for(CtIfImpl c:  conditions) {
						_conditionList.add(c.toString());			
					}
					
					
					for(CtReturnImpl r:  returns) {
						_returnList.add(r.toString());
					}
					
					for(CtAssignmentImpl a:  assignments) {
						_assignmentList.add(a.toString());
					}
					
					
				}
					
				}

		}
}
	
	
	
}
