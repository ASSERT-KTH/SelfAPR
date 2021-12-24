package code.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import spoon.reflect.cu.SourcePosition;

public class Util {
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
}
