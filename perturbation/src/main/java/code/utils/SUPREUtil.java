package code.utils;

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
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtInvocationImpl;
import spoon.support.reflect.code.CtLiteralImpl;
import spoon.support.reflect.code.CtVariableReadImpl;

public class SUPREUtil {
	public static String getSpecificLine(SourcePosition position,int line) {
		if (position != null && position.getFile()!=null) {
		String targetFile = position.getFile().toString();
		String target="";
		try {
			 target = Files.readAllLines(Paths.get(targetFile)).get(line-1);
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
	
	
	public static String getRandomLogicOperator(String orig) {
		String[] los = {"||","&&","|","^","&","==","!=",
				"<",">","<=",">="," instanceof "};	
		
		
		double r = getRandomDouble();
		int rint = getRandomInt(11);

		if(orig==null) {
			return " "+los[rint]+" ";
		}
		
		
		
		
		if(orig.contains("==")) {
			if(r>0.6) {
				return " != ";
			}else if(r>0.5) {
				return " = ";
			} 
		}
		
		if(orig.contains("!=")) {
			if(r>0.6) {
				return " == ";
			}else if(r>0.5) {
				return " = ";
			} 
		}
		
		
		if (!los[rint].contains(orig)) {
			return " "+los[rint]+" ";

		} else {
			if (rint>0) {
				return " "+los[rint-1]+" ";
			}else {
				return " "+los[rint+1]+" ";
			}
		}
	}
	
	
	public static String getRandomActionOperator(String orig) {
		String[] bos = {"+","-","*","/","<<",">>","/",">>>","+","-","%","*","/"};		
		int rint = getRandomInt(13);
		if (!bos[rint].contains(orig)) {
			return " "+bos[rint]+" ";
		} else {
			if (rint>0) {
				return " "+bos[rint-1]+" ";
			}else {
				return " "+bos[rint+1]+" ";
			}
		}
	}
	
	public static String getOperatorValue(String key) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("OR", " || ");
		map.put("AND", " && ");
		map.put("BITOR", " | ");
		map.put("BITXOR", " ^ ");
		map.put("BITAND", " & ");
		map.put("EQ", " == ");
		map.put("NE", " != ");
		map.put("LT", " < ");
		map.put("GT", " > ");
		map.put("LE", " <= ");
		map.put("GE", " >= ");
		map.put("SL", " << ");
		map.put("SR", " >> ");
		map.put("USR", " >>> ");
		map.put("PLUS", " + ");
		map.put("MINUS", " - ");
		map.put("MUL", " * ");
		map.put("DIV", " / ");
		map.put("MOD", " % ");
		map.put("INSTANCEOF", " instanceof ");

		return map.get(key);
		
	}
	
	
	
	public static String randomReturnElement() {
		
		String randV = "";
		double r = Math.random();
		
		String[] lst = {"false","true","null","this"};
		
		if(r>0.3) {
			randV=lst[SUPREUtil.getRandomInt(3)];
		} else  {
			randV = getRandomInt(3)+"";
		} 

		return randV;
		
	}
	
	

	
	public static String getSimpleExecName(String execStr) {
		execStr =  execStr.split("#")[1];
		execStr =  execStr.split("\\(")[0];
		return execStr;
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
	
	
	public static int getArgsSize(CtCodeElement inv) {
		String invStr = inv.toString().split("\\(")[1];
		invStr = inv.toString().split("\\)")[0];
		if(invStr.length()==0) {
			return 0;

		}
		
		if(invStr.contains(",")) {
			String[] commas = invStr.split("\\,");
			return commas.length;
			
		}else {
			return 0;
		}	
}
	
}
