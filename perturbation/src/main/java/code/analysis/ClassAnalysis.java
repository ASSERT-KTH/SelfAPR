package code.analysis;

import java.util.List;

import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;

public class ClassAnalysis {

	public static String analysis(CtElement rootElement){
		String classinfo="[CLASS] ";
		List<CtClass> classList = rootElement.getElements(new TypeFilter<CtClass>(CtClass.class));				
		for(CtClass c : classList) {
			classinfo += c.getSimpleName();
		}
		
		return classinfo;
	}
}
