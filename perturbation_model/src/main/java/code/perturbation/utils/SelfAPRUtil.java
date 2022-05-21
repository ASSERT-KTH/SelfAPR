package code.perturbation.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import code.analysis.Constructors;
import code.analysis.Variables;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;
import spoon.support.reflect.code.CtInvocationImpl;
import spoon.support.reflect.code.CtLiteralImpl;
import spoon.support.reflect.code.CtVariableReadImpl;

public class SelfAPRUtil {
	public static String getSpecificLine(SourcePosition position,int line) {
		if (position != null && position.getFile()!=null) {
		String targetFile = position.getFile().toString();
		String target=null;
		try {
			 if(line>1) {
			 target = Files.readAllLines(Paths.get(targetFile)).get(line-1);
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		target = target.replace("(", " ( ");
		target = target.replace(")", " ) ");
		
		target = target.trim();
		//remove comments
		if (target.contains("//")) {
			target = target.split("//")[0];
		}
		
		if (target.contains("/*")) {
			target = target.split("/*")[0];
		}
		
		
		if (target.startsWith("*")) {
			target = "";
		}
		
		if(target.contains("throw") && target.contains("Exception (") && target.contains(")")) {
			String before = target.split("\\(")[0];
			
			int lst = target.lastIndexOf(")");
			String after = target.substring(lst+1, target.length());
			target = before+" (\" \") "+after;
		}
		
		
		return target;
		
		} else {
			return null;
		}
	}	
	
	
	public static int getRandomInt(int max) {
		int i = (int) ((Math.random() * (max - 0)) + 0);
		return i;
	}
	
	
	public static double getRandomDouble() {
		return Math.random();
	}
	
	

	
	
	
	public static String randomReturnElement() {
		
		String randV = "";
		double r = getRandomDouble();
		
		String[] lst = {"null","this","null"};
		
		if(r>0.1) {
			randV=null;
		}
		else if(r>0.05) {
			randV=lst[SelfAPRUtil.getRandomInt(3)];
		} else  {
			randV = getRandomInt(5)+"";
		} 

		return randV;
		
	}
	
	

	
	public static String getSimpleExecName(String execStr) {
		if(execStr.contains("#") && execStr.contains("(") ) {
		execStr =  execStr.split("#")[1];
		execStr =  execStr.split("\\(")[0];
		return execStr;
		} else {
			return null;
		}
	}
	
	public static String getSimpleVarName(String qaulifyName) {	
		if(qaulifyName==null || qaulifyName==""||qaulifyName.length()==0) {
			return "";
		}
		if ('(' == (qaulifyName.charAt(0)) && ')'== qaulifyName.charAt(qaulifyName.length()-1)) {
			qaulifyName = (String) qaulifyName.subSequence(1, (qaulifyName.length())-1);
		}	
		
		String[] dotSize = qaulifyName.split("\\.");		
		if(dotSize.length>2) {
			qaulifyName=qaulifyName.substring(qaulifyName.lastIndexOf(".")+1);	
		}		
		return qaulifyName;
	}
	

	
	
	public static String getSimpleStatement(String statement) {	
		String s = "";
		String[] statements = statement.split(" ");
		for (String state : statements) {		
			s += getSimpleVarName(state)+" ";
		}
		
		return s;
	}
	
	
	public static int getArgsSize(CtElement inv) {
		
		List<CtVariableReadImpl> arguments = inv
		.getElements(new TypeFilter<CtVariableReadImpl>(CtVariableReadImpl.class));
		List<CtLiteralImpl> literals = inv
				.getElements(new TypeFilter<CtLiteralImpl>(CtLiteralImpl.class));
		return arguments.size() + literals.size();
		
}
	
	
	public static String simplefyExpression(CtBinaryOperatorImpl ctexpression) {	
		String expression = ctexpression.toString();
		
		String left = ctexpression.getLeftHandOperand().toString();
		if (expression.contains(left)&&('(' == (left.charAt(0)) && ')'== left.charAt(left.length()-1))) {
			expression = expression.replace(left, left.subSequence(1, left.length()-1));
		}
		
		String right = ctexpression.getRightHandOperand().toString();
		if (expression.contains(right)&&('(' == (right.charAt(0)) && ')'== right.charAt(right.length()-1))) {
			expression = expression.replace(right, right.subSequence(1, right.length()-1));
		}
			

		
		if(!expression.contains("&")&&!expression.contains("||")) {
		while('(' == (expression.charAt(0)) && ')'== expression.charAt(expression.length()-1)) {
			expression = expression.substring(1, expression.length()-1);
			expression=expression.replace("(", " ( ").replace(")", " ) ");
		}}
		expression = getSimpleStatement(expression);			

		
		
		
		
		return expression;
	}
	
	
}
