package code.analysis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import code.perturbation.utils.EditDistance;
import code.perturbation.utils.SelfAPRUtil;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtConstructorCallImpl;
import spoon.support.reflect.code.CtIfImpl;
import spoon.support.reflect.code.CtReturnImpl;
import spoon.support.reflect.reference.CtExecutableReferenceImpl;
import spoon.support.reflect.reference.CtReferenceImpl;

public class Constructors {

	static HashSet<String> constList = new HashSet<String>();

	public static String getSimilarConstructor(String orig) {

		String target = "";
		double maxScore = 0;
		orig = orig.trim();
		for (String ex : constList) {
			String exStr = ex.toString();
			exStr = exStr.trim();
			if (!exStr.equals(orig)) {
				double score = EditDistance.similarity(orig, exStr);
				if (score > maxScore) {
					maxScore = score;
					target = exStr;
				}
			}
		}

		return SelfAPRUtil.getSimpleExecName( target);

	}

	public static void analysis(CtElement rootElement) {
		List<CtConstructorCallImpl> constructorList = rootElement
				.getElements(new TypeFilter<CtConstructorCallImpl>(CtConstructorCallImpl.class));
		
		List<CtConstructor> constructors = rootElement.getElements(new TypeFilter<CtConstructor>(CtConstructor.class));					

		
		for(CtConstructorCallImpl cons : constructorList) {
			String consString =  cons.toString();
			consString = consString.trim();
			if(consString.startsWith("new")) {
				String[] pl = consString.split("\\.");
				consString = pl[pl.length - 1];
				consString = consString.split("\\)")[0];
				constList.add(consString+")");
			}
		}
		
		
		
		
	
			
	}
	
}
