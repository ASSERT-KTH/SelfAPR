package code.analysis;

import java.util.List;

import code.perturbation.RandomPerturb;
import spoon.reflect.code.CtStatement;

public class StatementAnalysis {

	public static void getPerturbated(List<CtStatement> states, int methStart, int methEnd) {
		
		if (methEnd>methStart) {
		for(CtStatement st : states) {
			RandomPerturb.randomPerturb(st,"statement",methStart,methEnd);		
		}
		}
	}

}
