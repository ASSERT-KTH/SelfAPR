package code.perturbation;

import java.util.List;

import code.analysis.MethodSignature;
import code.utils.SUPREUtil;
import code.utils.TypeUtil;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtLiteralImpl;
import spoon.support.reflect.reference.CtTypeReferenceImpl;

public class TypePerturbation {

	public static String perturb(CtElement st, String groundTruth) {

		String perturbCode = null;
		TypeFilter<CtTypeReferenceImpl> typefilter = new TypeFilter<CtTypeReferenceImpl>(CtTypeReferenceImpl.class);
		List<CtTypeReferenceImpl> types = st.getElements(typefilter);

		if (types.size() > 0) {

			String origType = types.get(0).toString();
			origType = SUPREUtil.getSimpleVarName(origType);
			
			// baseType
			if (TypeUtil.isBasicType(origType)) {
				String randomType = TypeUtil.getRandomBasicType(origType);
				perturbCode = groundTruth.replace(origType, randomType);
			} else {
				// objectType
				String randomType = MethodSignature.getRandomClass(origType);
				if(randomType!=null) {
					perturbCode = groundTruth.replace(origType, randomType);
				}
			}

		}

		return perturbCode;
	}
}
