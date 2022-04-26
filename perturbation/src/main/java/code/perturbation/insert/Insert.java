package code.perturbation.insert;

import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class Insert {

	public static void insert(CtElement st, StatementType type, int methStart, int methEnd) {
		
		
		P13_Insert_Statement.insert(st,type,methStart,methEnd);
		P14_Insert_Condition.insert(st,type,methStart,methEnd);
		P15_Insert_Block.insert(st,type,methStart,methEnd);
	
	}

}
