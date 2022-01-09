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

		if (types.size() > 0 && SUPREUtil.getRandomDouble()>0.5) {
			String origType = types.get(0).toString();
			origType = SUPREUtil.getSimpleVarName(origType);		
			
			if(groundTruth.contains(origType)) {
			// baseType
			if (TypeUtil.isBasicType(origType)) {
				if(!origType.equals("boolean")) {
				String randomType = TypeUtil.getRandomBasicType(origType);
				perturbCode = groundTruth.replace(origType, randomType);
				}
			} 
			
			else {
				// objectType				
					String randomType = MethodSignature.getRandomClass(origType);
					if(randomType!=null  && !"".equals(randomType) && groundTruth.contains(origType+" ") ) {					
						if(SUPREUtil.getRandomDouble()>0.8) {
						perturbCode = groundTruth.replace(origType+" ", randomType+" ");
						} else {
							perturbCode = groundTruth.replace(origType+" ", "Object ");
						}
					}
				} 								
		} 
	} 		return perturbCode;
}
}
