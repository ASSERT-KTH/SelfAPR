package code.perturbation;

import java.util.HashMap;
import java.util.List;

import code.remove.Remove;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtIfImpl;

public class RandomPerturb {
		
	public static void randomPerturb(CtCodeElement st, String type,int methStart, int methEnd) {

		String position = st.getPosition().toString();		
		Remove.remove(st,type,methStart,methEnd);
	}
	
}
