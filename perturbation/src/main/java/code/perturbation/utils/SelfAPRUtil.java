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
		double r = Math.random();
		
		String[] lst = {"null","this","false","null","true","null","this","null"};
		
		if(r>0.1) {
			randV=lst[SelfAPRUtil.getRandomInt(8)];
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
		String[] dotSize = qaulifyName.split("\\.");
		
		if(dotSize.length>2) {
			qaulifyName=qaulifyName.substring(qaulifyName.lastIndexOf(".")+1);	
		}		
		qaulifyName = qaulifyName.replace("(", "").replace(")", "");				
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
		String invStr = inv.toString().split("\\(")[1];
		if(invStr.length()<2) {
			return 0;

		}
		invStr = invStr.toString().split("\\)")[0];

		if(invStr.contains(",")) {
			String[] commas = invStr.split("\\,");
			return commas.length;
			
		}else {
			return 1;
		}	
}
	
}
