package code.perturbation;

import java.util.HashMap;
import java.util.List;

import code.perturbation.remove.Remove;
import code.perturbation.replace.Replace;
import code.utils.SUPREUtil;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtIfImpl;

public class PerturbActions {
		
	public static void randomPerturb(CtElement st, String type,int methStart, int methEnd) {

		double r = SUPREUtil.getRandomDouble();
		
		if(r>0.0) {
			Replace.replace(st, type, methStart, methEnd);
		}else {
			Remove.remove(st, type, methStart, methEnd);
		}
	
			
			

		
	}	
}
