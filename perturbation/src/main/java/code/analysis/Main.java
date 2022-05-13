package code.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;

import code.output.result.PerturbResult;
import code.perturbation.PerturbActions;
import code.perturbation.SimilarityPerturbation;
import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.reflect.visitor.Filter;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtIfImpl;
import spoon.support.reflect.declaration.CtFieldImpl;
import spoon.support.reflect.reference.CtExecutableReferenceImpl;

/**
 * Entrance of spoon checker
 * 
 * @author 
 *
 */
public class Main {

	/**
	 * Entrance method of spoon checker
	 * 
	 * @param args
	 *            provides input path of java source files
	 */
	
	public static String path="";
	
	
	public static void main(String[] args) {		
		path = args[0];	
		String choice = args[1];
		//BugLab||selfAPR
		
		if(choice=="") {
			 choice = "SelfAPR";
		}
		
//		path = "/Users/sophie/Documents/selfapr-closure134/src/com/google/javascript/jscomp/ProcessClosurePrimitives.java";
//		/Users/sophie/Documents/SelfAPR/D4JTraining/Chart-26/source/org/jfree/data/xy/XYSeries.java
		sourceReader(path,choice);	
	}
	
	public static String getPathDir ( ) {
		return path;
	}	
	
	/**
	 * 
	 * @param path
	 *            is the input path of java source files
	 * @return
	 */
	public static  void sourceReader(String path,String choice) {
		final SpoonAPI spoon = new Launcher();
		
		
		spoon.getEnvironment().setNoClasspath(true);
		spoon.addInputResource(path);
		spoon.buildModel ( ) ;
		// Get the root element of spoon elements
		CtElement rootElement = spoon.getModel().getRootPackage()
				.getElements(new TypeFilter<CtElement>(CtElement.class)).get(0);				
		
		List<CtClass> classList = rootElement.getElements(new TypeFilter<CtClass>(CtClass.class));				
		for(CtClass c : classList) {			
			ClassAnalysis.analysis(c);
			SimilarityPerturbation.analysis(c);
		
		//Get variables
		List<CtVariable> variablesList = c.getElements(new TypeFilter<CtVariable>(CtVariable.class));
		List<CtFieldImpl> filedList = c.getElements(new TypeFilter<CtFieldImpl>(CtFieldImpl.class));

		Variables.getFiles (filedList ) ;					
		
		//Get executables
		Constructors.analysis (c) ;
		ExecutableAnalysis.analysis(c);
			
		List<CtConstructor> constructorList = c.getElements(new TypeFilter<CtConstructor>(CtConstructor.class));		
				
		//Get method signature
		List<CtMethod> methodList = c.getElements(new TypeFilter<CtMethod>(CtMethod.class));				
		String methodInfo=MethodSignature.getMethodSignature(methodList);	
		
		//Data corruption		
		PerturbActions.perturb(filedList,constructorList,methodList,choice);
		
		}
		
	}		
}
