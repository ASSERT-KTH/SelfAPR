package code.analysis;

import java.util.HashMap;
import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.RandomPerturb;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.support.reflect.code.CtIfImpl;

public class ConditionAnalysis {

	
	public static List<HashMap<String,String>> getPerturbated(List<CtIfImpl> conditions,int methStart, int methEnd ) {
		
	 	for (CtIfImpl cond : conditions) {
    		//condition
    		CtExpression<Boolean> condition = cond.getCondition();	
    		
    		
    		
    		//condition statement		
    		 RandomPerturb.randomPerturb(condition,"cond",methStart,methEnd);   		
		//then statement
		 CtStatement thenstm = cond.getThenStatement();	
//		 if (thenstm!=null) {
//	    		RandomPerturb.randomPerturb(thenstm,"statement",methStart,methEnd);   		
//		 }
		 
		 
		 
    		//else statement
	    CtStatement elsestm = cond.getElseStatement();	
	    if(elsestm!=null) {
	    	
	    }
		System.out.println(thenstm);	
    	}											
		return null;		
	}

	
}
