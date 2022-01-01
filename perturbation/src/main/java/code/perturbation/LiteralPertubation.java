package code.perturbation;

import java.util.List;

import spoon.reflect.code.CtCodeElement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtInvocationImpl;
import spoon.support.reflect.code.CtLiteralImpl;
import spoon.support.reflect.code.CtVariableReadImpl;

public class LiteralPertubation {

	
	
	
	public static String perturb(CtElement st,String groundTruth)  {
		
		
	TypeFilter<CtLiteralImpl> literalfilter = new TypeFilter<CtLiteralImpl>(
			CtLiteralImpl.class);		
	List<CtLiteralImpl> literals = st.getElements(literalfilter);

	if(literals.size()>0) {
		CtLiteralImpl i = literals.get(0);		 
		 String type = i.getType().getSimpleName();
		 Object value = i.getValue();

		 if(type.contains("int")) {
			 
		 }
		 else if(type.contains("string")) {
			 
		 }
		 else if(type.contains("boolean")) {
			 
		 } else {
			 
		 }
		 
		  
		 
		 
		 

	}
	
	return null;
	
	
	
	}
	
	
	
}
