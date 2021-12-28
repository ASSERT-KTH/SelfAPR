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
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtIfImpl;

public class RandomPerturb {
		
	public static void randomPerturb(CtCodeElement st, String type,int methStart, int methEnd) {

		double r = SUPREUtil.getRandomDouble();
		
		if(r>0.5) {
			Replace.replace(st, type, methStart, methEnd);
		}else {
			Remove.remove(st, type, methStart, methEnd);
		}
	
			
			

		
	}	
}
