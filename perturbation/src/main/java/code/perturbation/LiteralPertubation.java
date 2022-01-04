package code.perturbation;

import java.util.List;

import code.utils.SUPREUtil;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtInvocationImpl;
import spoon.support.reflect.code.CtLiteralImpl;
import spoon.support.reflect.code.CtVariableReadImpl;

public class LiteralPertubation {

	
	
	
	public static String perturb(CtElement st,String groundTruth)  {
		
	String perturbCode = null;
	TypeFilter<CtLiteralImpl> literalfilter = new TypeFilter<CtLiteralImpl>(
			CtLiteralImpl.class);		
	List<CtLiteralImpl> literals = st.getElements(literalfilter);

	if(literals.size()>0) {
		CtLiteralImpl i = literals.get(0);		 
		 String type = i.getType().getSimpleName();
		 String value = i.toString();
		 Object valueObj = i.getValue();

		 double r = SUPREUtil.getRandomDouble();

		 if(type.contains("int")) {
			 String randInt = value+"";
			 while(randInt.equals(value+"")) {
				 if(r>0.7) {
				 randInt =  SUPREUtil.getRandomInt((Integer) valueObj)+"";
				 } else if(r>0.35){
					 randInt = SUPREUtil.getRandomInt(5)+"";
				 } else {
					 randInt = randInt+"L";
				 }
			 }
			 perturbCode = groundTruth.replace(value+"", randInt+"");		 
		 }
		 
		 else if(type.contains("long")) {
			 String randLong = value+"";
			 if(randLong.contains("L")) {
				 randLong = randLong.replace("L", "");
			 } else if(r>0.5) {
				 randLong = SUPREUtil.getRandomInt(5)+"";
			 } else {
				 randLong = value+"D";
			 }
			 perturbCode = groundTruth.replace(value+"", randLong+"");		 
		 }
		 
		 else if(type.contains("double")) {
			 String randLong = value+"";
			 if(randLong.contains("D") || randLong.contains("d")) {
				 if(SUPREUtil.getRandomDouble()>0.5) {
				 randLong = randLong.replace("D", "");
				 randLong = randLong.replace("d", "");
				 }else {
					 randLong = randLong.replace("D", "f");
					 randLong = randLong.replace("d", "f"); 
				 }
			 } else if(r>0.5) {
				 randLong = SUPREUtil.getRandomInt(5)+".0d";
			 } else {
				 randLong = value+"D";
			 }
			 perturbCode = groundTruth.replace(value+"", randLong+"");		 
		 }
		 
		 
		 else if(type.contains("double")) {
			 String randLong = value+"";
			 if(randLong.contains("F") || randLong.contains("f")) {
				 if(SUPREUtil.getRandomDouble()>0.2) {
				 randLong = randLong.replace("F", "");
				 randLong = randLong.replace("f", "");
				 }
			 } else if(r>0.5) {
				 randLong = SUPREUtil.getRandomInt(5)+"";
			 } 
			 perturbCode = groundTruth.replace(value+"", randLong+"");		 
		 }
		 
		 
		 
		 
		 
		 else if(type.contains("string")) {
			 
		 }
		 
		 
		 else if(type.contains("boolean")) {			 
			 String randBoolean = value+"";
			 if(randBoolean.contains("true") ) {
				 perturbCode = groundTruth.replace(value+"", "false");		
			 }else if (randBoolean.contains("false")) {
				 perturbCode = groundTruth.replace(value+"", "true");		
			 }			 
		 } else {
			 
		 }
		 
		  
		 
		 
		 

	}
	
	return perturbCode;
	
	
	
	}
	
	
	
}
