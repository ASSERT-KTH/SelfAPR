package code.perturbation.utils;

import spoon.support.reflect.reference.CtTypeReferenceImpl;

public class TypeUtil {

	static String[] basicType = { "String", "char", "boolean", "long", "short", "int", "byte", "double", "float" };
	static String[] collectionType = { "List", "Set", "ArrayList", "LinkedList","LinkedHashSet","TreeSet"};

	public static boolean isBasicType(String s) {
		s = s.trim();
		for (String bt : basicType) {
			if (bt.contains(s)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isCollectionType(String s) {
		s = s.trim();
		for (String bt : collectionType) {
			if (bt.equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	

	public static String getRandomBasicType(String orig) {

		if ("long".equals(orig) || "short".equals(orig) || "int".equals(orig) || "byte".equals(orig)) {
			String[] type = { "long", "short", "int","double" };
			int rint = SelfAPRUtil.getRandomInt(3);
			if (!type[rint].contains(orig)) {
				return " " + type[rint] + " ";
			} else {
				if (rint > 0) {
					return " " + type[rint - 1] + " ";
				} else {
					return " " + type[rint + 1] + " ";
				}
			}
		} else if ("short".equals(orig)) {
			return SelfAPRUtil.getRandomDouble()>0.5? "int" : "byte";	
		} else if ("int".equals(orig)) {
			return SelfAPRUtil.getRandomDouble()>0.5? "char" : "byte";			
		} else if ("long".equals(orig)) {
			return SelfAPRUtil.getRandomDouble()>0.5? "double" : "int";			
		} else if ("double".equals(orig)) {
			return SelfAPRUtil.getRandomDouble()>0.8? "float" : "int";
		} else if ("float".equals(orig)) {
			return "int";
		} else if ("char".equals(orig)) {
			return SelfAPRUtil.getRandomDouble()>0.8? "String" : "int";
		} else if ("String".equals(orig)) {
			return "char";
		} 		
		else {
			int rint = SelfAPRUtil.getRandomInt(8);
			if (!basicType[rint].contains(orig)) {
				return " " + basicType[rint] + " ";
			} else {
				if (rint > 0) {
					return " " + basicType[rint - 1] + " ";
				} else {
					return " " + basicType[rint + 1] + " ";
				}
			}
		}
	}

	public static String getRandomCollectionType(String origType) {
		if(!isCollectionType(origType)) {
			return null;
		} else {		
			int rint = SelfAPRUtil.getRandomInt(5);
			if (!collectionType[rint].contains(origType)) {
				return " " + collectionType[rint] + " ";
			} else {
				if (rint > 0) {
					return " " + collectionType[rint - 1] + " ";
				} else {
					return " " + collectionType[rint + 1] + " ";
				}
			}			
		}
	}

}
