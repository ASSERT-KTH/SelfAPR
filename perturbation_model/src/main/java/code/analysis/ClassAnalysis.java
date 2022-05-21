package code.analysis;

import java.util.List;

import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;

public class ClassAnalysis {
	public static String _currentClass= "";
	public static String getCurrentClass() {
		return _currentClass;
	}
	
	

	public static String analysis(CtElement rootElement){
		_currentClass = "";
		String classinfo="[CLASS] ";
		List<CtClass> classList = rootElement.getElements(new TypeFilter<CtClass>(CtClass.class));				
		for(CtClass c : classList) {
			classinfo += c.getSimpleName() + " ";
		}
		
		_currentClass = classinfo;
		return classinfo;
	}
}
