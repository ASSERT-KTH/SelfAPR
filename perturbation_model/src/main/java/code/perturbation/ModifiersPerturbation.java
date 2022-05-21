package code.perturbation;

import java.util.List;

import code.perturbation.utils.SelfAPRUtil;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.visitor.filter.TypeFilter;


public class ModifiersPerturbation {
	public static String perturb(CtElement st, String groundTruth) {
		
		String perturbCode = null;

		if (groundTruth.contains("protected") && SelfAPRUtil.getRandomDouble()>0.6) {
			perturbCode = groundTruth.replace("protected", "private");
		}else if (groundTruth.contains("public") && SelfAPRUtil.getRandomDouble()>0.6) {
			perturbCode = groundTruth.replace("public", "private");
		}
		
		
		if (groundTruth.contains("static") && SelfAPRUtil.getRandomDouble()>0.5) {
			perturbCode = groundTruth.replace("static", "");
		}
		
		
		if (groundTruth.contains("final")  && SelfAPRUtil.getRandomDouble()>0.5) {
			perturbCode = groundTruth.replace("final", "");
		}
				
		return perturbCode;		
		
	}
}
