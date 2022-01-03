package code.utils;

public class TypeUtil {

	static String[] btype = { "String", "char", "boolean", "long", "short", "int", "byte", "double", "float" };

	public static boolean isBasicType(String s) {
		s = s.trim();
		for (String bt : btype) {
			if (bt.contains(s)) {
				return true;
			}
		}
		return false;
	}

	public static String getRandomBasicType(String orig) {

		if ("long".equals(orig) || "short".equals(orig) || "int".equals(orig) || "byte".equals(orig)) {
			String[] type = { "long", "short", "int" };
			int rint = SUPREUtil.getRandomInt(2);
			if (!type[rint].contains(orig)) {
				return " " + type[rint] + " ";
			} else {
				if (rint > 0) {
					return " " + type[rint - 1] + " ";
				} else {
					return " " + type[rint + 1] + " ";
				}
			}
		} else if ("double".equals(orig)) {
			return "float";
		} else if ("float".equals(orig)) {
			return "double";
		} else if ("char".equals(orig)) {
			return "String";
		} else {
			int rint = SUPREUtil.getRandomInt(8);
			if (!btype[rint].contains(orig)) {
				return " " + btype[rint] + " ";
			} else {
				if (rint > 0) {
					return " " + btype[rint - 1] + " ";
				} else {
					return " " + btype[rint + 1] + " ";
				}
			}
		}
	}

}
