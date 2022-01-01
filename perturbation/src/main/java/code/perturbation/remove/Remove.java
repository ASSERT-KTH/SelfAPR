package code.perturbation.remove;

import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBlockImpl;
import spoon.support.reflect.code.CtIfImpl;

import java.lang.Math;
import java.util.HashMap;
import java.util.List;

import code.utils.SUPREUtil;


public class Remove {

	public static void  remove(CtElement exp, String type, int methStart, int methEnd) {		
		
		double r = SUPREUtil.getRandomDouble();
		
	//	partial remove conditions
		if(r>0.8 && type.contains("cond")) {
			FullyRemoveCondBlock.remove(exp, type, methStart, methEnd);
		}else if(r>0.4) {
			PartialRemoveCond.remove(exp, type, methStart,methEnd);
		} else {
			FullyRemove.remove(exp, type, methStart,methEnd);	
		}
		
	
//		fully remove
//		if(r>0.8) {
//		FullyRemoveCond.remove(exp, type, methStart,methEnd);	
//		}
//		
//		

//		
//		
	}
	
	
}
