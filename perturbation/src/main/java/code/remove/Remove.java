package code.remove;

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

import code.utils.Util;


public class Remove {

	public static void  remove(CtCodeElement exp, String type, int methStart, int methEnd) {		
		String corruptCode = "";		
		
		int end=0;

		double r = Math.random();
	
//		fully remove condition
		FullyRemoveCond.remove(exp, type, methStart,methEnd);		
		
		
	}
	
	
}
