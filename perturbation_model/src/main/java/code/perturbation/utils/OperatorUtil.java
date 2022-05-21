package code.perturbation.utils;

import java.util.HashMap;
import java.util.Map;

public class OperatorUtil {

	public static String getRandomLogicOperator(String orig,String groundTruth) {
		String[] los = {"||","&&","|","^","&","==","!=",
				"<",">","<=",">="," instanceof ",">>","<<"};	
		
		
		
		if(">=".equals(orig)) {
			if(SelfAPRUtil.getRandomDouble()>0.3) {
				return ">";
			}else {
				return SelfAPRUtil.getRandomDouble() > 0.5 ? "==":"<";
			}
		}
		
		else if("<=".equals(orig)) {			
			if(SelfAPRUtil.getRandomDouble()>0.3) {
				return "<";
			}else {
				return SelfAPRUtil.getRandomDouble() > 0.5 ? "==":">";
			}
		}
		
		else if("<".equals(orig)) {			
			if(SelfAPRUtil.getRandomDouble()>0.3) {
				return "<=";
			}else {
				return SelfAPRUtil.getRandomDouble() > 0.5 ? "==":">";
			}
		}
		
		else if(">".equals(orig)) {			
			if(SelfAPRUtil.getRandomDouble()>0.3) {
				return ">=";
			}else {
				return SelfAPRUtil.getRandomDouble() > 0.5 ? "==":"<";
			}
		}
		
		else if("==".equals(orig)) {		
			if (groundTruth.contains("null")){
				return "!=";
			}
			else if(SelfAPRUtil.getRandomDouble()>0.5) {
				return "!=";
			}else if (SelfAPRUtil.getRandomDouble()>0.25) {
				return SelfAPRUtil.getRandomDouble() > 0.5 ? ">=":"<=";
			} else {
				return SelfAPRUtil.getRandomDouble() > 0.5 ? ">":"<";
			}
		}
		
		
		else if("!=".equals(orig)) {		
			if (groundTruth.contains("null")){
				return "==";
			}
			if(SelfAPRUtil.getRandomDouble()>0.5) {
				return "==";
			}else if (SelfAPRUtil.getRandomDouble()>0.25) {
				return SelfAPRUtil.getRandomDouble() > 0.5 ? ">=":"<=";
			} else {
				return SelfAPRUtil.getRandomDouble() > 0.5 ? ">":"<";
			}
		}
		
		else if("&&".equals(orig)) {		
			return "||";
		}
		
		else if("||".equals(orig)) {		
			return "&&";
		}
		
		else if("*".equals(orig)) {		
			return SelfAPRUtil.getRandomDouble() > 0.65 ? "/":  SelfAPRUtil.getRandomDouble() > 0.5 ? "-" :  "+";
		}
		
		else if("/".equals(orig)) {		
			return SelfAPRUtil.getRandomDouble() > 0.65 ? "*":  SelfAPRUtil.getRandomDouble() > 0.5 ? "-" :  "+";
		}
		
		else if("=".equals(orig)) {		
			return SelfAPRUtil.getRandomDouble() > 0.5 ? "+=": "-=" ;
		}
		
		else if("+=".equals(orig)) {		
			return SelfAPRUtil.getRandomDouble() > 0.5 ? "=": "-=" ;
		}
		
		else if("-=".equals(orig)) {		
			return SelfAPRUtil.getRandomDouble() > 0.5 ? "=": "+=" ;
		} 
		else if("^".equals(orig)) {		
			return "&";
		} 
		
		
		
		
		else {
		//random
		int rint = SelfAPRUtil.getRandomInt(14);
		
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
	}
	
	
	public static String getRandomActionOperator(String orig) {
		String[] bos = {"+","-","*","/","<<",">>","/",">>>","+","-","%","*","/"};		
		int rint = SelfAPRUtil.getRandomInt(13);
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
		map.put("OR","||");
		map.put("AND","&&");
		map.put("BITOR","|");
		map.put("BITXOR","^");
		map.put("BITAND","&");
		map.put("EQ","==");
		map.put("NE","!=");
		map.put("LT","<");
		map.put("GT",">");
		map.put("LE","<=");
		map.put("GE",">=");
		map.put("SL","<<");
		map.put("SR",">>");
		map.put("USR",">>>");
		map.put("PLUS","+");
		map.put("MINUS","-");
		map.put("MUL","*");
		map.put("DIV","/");
		map.put("MOD","%");
		map.put("INSTANCEOF","instanceof");

		return map.get(key);
		
	}
}
