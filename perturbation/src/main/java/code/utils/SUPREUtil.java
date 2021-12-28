package code.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import code.analysis.Executables;
import code.analysis.Variables;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtExpression;
import spoon.reflect.cu.SourcePosition;

public class SUPREUtil {
	public static String getSpecificLine(SourcePosition position,int line) {
		String targetFile = position.getFile().toString();
		String target="";
		try {
			 target = Files.readAllLines(Paths.get(targetFile)).get(line-1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return target;
	}	
	
	
	public static int getRandomInt(int max) {
		return (int) ((Math.random() * (max - 0)) + 0);
	}
	
	
	public static double getRandomDouble() {
		return Math.random();
	}
	
	
	public static String getRandomLogicOperator(String orig) {
		String[] los = {"||","&&","|","^","&","==","!=",
				"<",">","<=",">="," instanceof "};	
		
		
		double r = getRandomDouble();
		
		if(orig.contains("==")) {
			if(r>0.6) {
				return "!=";
			}else if(r>0.5) {
				return "=";
			} 
		}
		
		if(orig.contains("!=")) {
			if(r>0.6) {
				return "==";
			}else if(r>0.5) {
				return "=";
			} 
		}
		
		
		int rint = getRandomInt(11);
		if (!los[rint].contains(orig)) {
			return los[rint];
		} else {
			return los[rint+1];
		}
	}
	
	
	public static String getRandomActionOperator(String orig) {
		String[] bos = {"<<",">>",">>>","+","-","*","/","%"};		
		int rint = getRandomInt(11);
		if (!bos[rint].contains(orig)) {
			return bos[rint];
		} else {
			return bos[rint+1];
		}
	}
	
	public static String getOperatorValue(String key) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("OR", "||");
		map.put("AND", "&&");
		map.put("BITOR", "|");
		map.put("BITXOR", "^");
		map.put("BITAND", "&");
		map.put("EQ", "==");
		map.put("NE", "!=");
		map.put("LT", "<");
		map.put("GT", ">");
		map.put("LE", "<=");
		map.put("GE", ">=");
		map.put("SL", "<<");
		map.put("SR", ">>");
		map.put("USR", ">>>");
		map.put("PLUS", "+");
		map.put("MINUS", "-");
		map.put("MUL", "*");
		map.put("DIV", "/");
		map.put("MOD", "%");
		map.put("INSTANCEOF", " instanceof ");

		return map.get(key);
		
	}
	
	
	public static String getRandomVariable(CtExpression var) {
		return Variables.getRandomVariables(var);
	}
	
	
	public static String randomReturnElement() {
		
		String randV = "";
		double r = Math.random();
		
		String[] lst = {"","false","true","null"};
		
		if(r>0.7) {
			randV=lst[SUPREUtil.getRandomInt(4)];
		}else {
			randV = getRandomVariable(null);
		}

		return randV;
		
	}
	
	
	public static String getSimilaryExecution(String orig) {
		
		return Executables.getSimilarExecutable(orig);
		
	}
	
	public static String getSimpleExecName(String execStr) {
		execStr =  execStr.split("#")[1];
		execStr =  execStr.split("\\(")[0];
		return execStr;
	}

	
	
	
	
}
