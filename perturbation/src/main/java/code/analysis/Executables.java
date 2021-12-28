package code.analysis;

import java.util.ArrayList;
import java.util.List;

import code.utils.EditDistance;
import code.utils.SUPREUtil;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.reference.CtExecutableReferenceImpl;
import spoon.support.reflect.reference.CtReferenceImpl;

public class Executables {

	static List<CtExecutableReferenceImpl> _execList = new ArrayList<CtExecutableReferenceImpl>();

	public static String getSimilarExecutable(String orig) {

		String target = "";
		double maxScore = 0;
		for (CtExecutableReferenceImpl ex : _execList) {
			String exStr = ex.toString();
			if (!exStr.equals(orig)) {
				double score = EditDistance.similarity(orig, exStr);
				if (score > maxScore) {
					maxScore = score;
					target = exStr;
				}
			}
		}

		return SUPREUtil.getSimpleExecName( target);

	}

	public static void analysis(CtElement rootElement) {
		List<CtExecutableReferenceImpl> executablesList = rootElement
				.getElements(new TypeFilter<CtExecutableReferenceImpl>(CtExecutableReferenceImpl.class));
		_execList = executablesList;
	}

}
