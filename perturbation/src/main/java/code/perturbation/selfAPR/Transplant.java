package code.perturbation.selfAPR;

import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class Transplant {

	public static void insert(CtElement st, StatementType type, int methStart, int methEnd) {
		
		
		P11_Transplant_Statement.insert(st,type,methStart,methEnd);
		P12_Transplant_Condition.insert(st,type,methStart,methEnd);
		P13_Transplant_Block.insert(st,type,methStart,methEnd);
	
	}

}
