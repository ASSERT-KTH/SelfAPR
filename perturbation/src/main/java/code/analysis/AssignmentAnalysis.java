package code.analysis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import code.perturbation.utils.EditDistance;
import code.perturbation.utils.SelfAPRUtil;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtAssignmentImpl;
import spoon.support.reflect.code.CtFieldReadImpl;

public class AssignmentAnalysis {
	static HashSet<String> _assignments = new HashSet<String>();
	
	
	public static String getSimilarAssignment (String orig){
				
		if(orig == null) {
			return null;
		}
		orig = orig.trim();
		if(_assignments.size()==0) {
			return null;
		}
		
		String target="";
		double maxScore=0;
		for(String s : _assignments) {
			s = s.trim();
		if(!orig.equals(s)) {
		double score = EditDistance.similarity(s, orig);
		if (score > maxScore) {
			maxScore = score;
			target = s;
			if(SelfAPRUtil.getRandomDouble()>0.6 && score>0.7) {
				return target;
			}
		}							
		}
		}
			return target;
		
	}
	
	

	public static void analysis(CtElement rootElement) {

		List<CtAssignmentImpl> assignmentList = rootElement
				.getElements(new TypeFilter<CtAssignmentImpl>(CtAssignmentImpl.class));

		for (CtAssignmentImpl assignment : assignmentList) {
			List<CtFieldReadImpl> assigns = assignment
					.getElements(new TypeFilter<CtFieldReadImpl>(CtFieldReadImpl.class));
			for (CtFieldReadImpl ass : assigns) {
				
				String assignmentStr = ass.toString();
				if(assignmentStr.contains(".")) {
					String[] dots = assignmentStr.split("\\.");
					if(dots.length>3) {
						assignmentStr = assignmentStr.split("(?=[A-Z])")[1];
					}
				}
				
				_assignments.add(assignmentStr);
			}
		}

	}

}
