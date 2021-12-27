package code.perturbation.replace;

import code.utils.SUPREUtil;
import spoon.reflect.code.CtCodeElement;

public class Replace {

	public static void replace(CtCodeElement st, String type, int methStart, int methEnd) {
		// TODO Auto-generated method stub
		
		if(type.contains("cond")) {
			ReplaceCond.replace(st, type, methEnd, methEnd);				
		}
		else if (type.contains("statement")) {
			ReplaceStatement.replace(st, type, methEnd, methEnd);
		}
		
	}
		
	

}
