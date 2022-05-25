package code.output.result;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

import code.analysis.ClassAnalysis;
import code.analysis.Main;
import code.analysis.MethodSignature;
import code.analysis.Variables;

public class PerturbResult {


	
	public static void  parsePerturb(String actionNo, String perturbCode,String methStart, String methEnd,
			String lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5, String groundTruth) {		

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("lineNo1", lineNo1 );
		map.put("lineNo2", lineNo2 );
		map.put("lineNo3", lineNo3 );
		map.put("lineNo4", lineNo4 );
		map.put("lineNo5", lineNo5 );
		map.put("perturbCode", perturbCode);
		map.put("groundTruth", groundTruth);
		map.put("methodStart", methStart );
		map.put("methodEnd", methEnd );
		map.put("repairAction", actionNo);

		getCorruptedResult(map);
		
	}
	
	
	
	
	
	
	
	

	public static void  getCorruptedResult(HashMap<String, String> map) {		
		
		String lineNo1 = map.get("lineNo1");
		String lineNo2 = map.get("lineNo2"); 		
		String lineNo3 = map.get("lineNo3"); 	
		String lineNo4 = map.get("lineNo4"); 
		String lineNo5 = map.get("lineNo5"); 		
		String perturbCode = map.get("perturbCode");
		
	
		String action = map.get("repairAction");		
		String groundTruth = map.get("groundTruth");
		
		String methodStart = map.get("methodStart");		
		String methodEnd = map.get("methodEnd");

		
		
		if(groundTruth==null || perturbCode==null) {
			return;
		}
		
		
		if (perturbCode.trim().equals(groundTruth.trim())) {
			return;
		}
		
		
		
		
		
		perturbCode =perturbCode.trim();
		groundTruth =groundTruth.trim();

		//not a block
		if(methodStart.equals(methodEnd)) {
			methodStart = Integer.parseInt(lineNo1)-5+"";
			methodEnd=Integer.parseInt(lineNo1)+5+"";
		} else if((Integer.parseInt(methodEnd) - Integer.parseInt(methodStart))>30) {
			methodStart = Integer.parseInt(lineNo1)-15+"";
			methodEnd=Integer.parseInt(lineNo1)+15+"";
		}
		
		
		
		
		
		
		String classinfo = ClassAnalysis.getCurrentClass();
		String method = MethodSignature.getCurrentMethod();
		String variables = Variables.getVariableInfo();
		
		String meta =  classinfo+" "+method+" [VARIABLES] "+variables;
		
		String emsembleStr = perturbCode+"^"+lineNo1+"^"
							+lineNo2+"^"
							+lineNo3+"^"
							+lineNo4+"^"
							+lineNo5+"^"
							+methodStart+"^"+methodEnd+"^"
							+groundTruth+"^"+meta;
				
				
//		copy targetFile
		String filename = Main.getPathDir();
		if(filename.contains("Bears")) {
		filename = filename.replace("Bears-", "Perturbation-Bears-");
		} else if (filename.contains("Lang-")) {
			filename = filename.replace("Lang-", "Perturbation-Lang-");
		}else if (filename.contains("Math-")) {
			filename = filename.replace("Math-", "Perturbation-Math-");
		}else if (filename.contains("Mockito")) {
			filename = filename.replace("Mockito-", "Perturbation-Mockito-");
		}else if (filename.contains("Time-")) {
			filename = filename.replace("Time-", "Perturbation-Time-");
		}else if (filename.contains("Closure-")) {
			filename = filename.replace("Closure-", "Perturbation-Closure-");
		}else if (filename.contains("Cli-")) {
			filename = filename.replace("Cli-", "Perturbation-Cli-");
		}else if (filename.contains("Codec-")) {
			filename = filename.replace("Codec-", "Perturbation-Codec-");
		}else if (filename.contains("Compress")) {
			filename = filename.replace("Compress-", "Perturbation-Compress-");
		}else if (filename.contains("Csv-")) {
			filename = filename.replace("Csv-", "Perturbation-Csv-");
		}else if (filename.contains("Gson-")) {
			filename = filename.replace("Gson-", "Perturbation-Gson-");
		}else if (filename.contains("JacksonCore-")) {
			filename = filename.replace("JacksonCore-", "Perturbation-JacksonCore-");
		}else if (filename.contains("JacksonDatabind")) {
			filename = filename.replace("JacksonDatabind-", "Perturbation-JacksonDatabind-");
		}else if (filename.contains("JacksonXml-")) {
			filename = filename.replace("JacksonXml-", "Perturbation-JacksonXml-");
		}else if (filename.contains("Jsoup-")) {
			filename = filename.replace("Jsoup-", "Perturbation-Jsoup-");
		}else if (filename.contains("JxPath")) {
			filename = filename.replace("JxPath", "Perturbation-JxPath");
		}else if (filename.contains("Chart-")) {
			filename = filename.replace("Chart-", "Perturbation-Chart-");
		}
		else if (filename.contains("Collections-")) {
                        filename = filename.replace("Collections-", "Perturbation-Collections-");
                }
		else  {
            filename = filename.replace(".java","Perturbation.java");
            System.out.println("saved to "+filename);
		}
		
//		else {
//			filename="./perturbationFile.txt";
//		}
		
		String dir = (String) filename.subSequence(0,filename.lastIndexOf("/"));
		//create this new patch and file
		File outDir = new File(dir);
		File outFile = new File(filename);
		try {
			outDir.mkdirs();
			outFile.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		Boolean exist = existInFile(filename,emsembleStr);
		
		if (!exist) {
			
		try {
			emsembleStr=action+"^"+emsembleStr;
			BufferedWriter writer = 	new BufferedWriter(new FileWriter(filename,true));
			writer.append(emsembleStr+"\n");
			writer.close();
			System.out.println(emsembleStr);

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}


	
	
	
	public static void  getCorruptedResultContext(String contextStr) {		
		
								
		System.out.println(contextStr);
//		copy targetFile
		String filename = Main.getPathDir();
		filename = filename.replace("Bears-", "Perturbation-Bears-");
		
		
		String dir = (String) filename.subSequence(0,filename.lastIndexOf("/"));
		//create this new patch and file
		File outDir = new File(dir);
		File outFile = new File(filename);
		try {
			outDir.mkdirs();
			outFile.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

			
		try {
			BufferedWriter writer = 	new BufferedWriter(new FileWriter(filename,true));
			writer.append(contextStr+"\n");
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static Boolean existInFile(String filename, String emsembleStr) {
		emsembleStr="^"+emsembleStr.replace(" ", "");
		boolean flag = false;
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(filename));
			String thisLine="";
			 try {
				while ((thisLine = br.readLine()) != null) {
					thisLine = thisLine.replace(" ", "");
					if(thisLine.startsWith("[")) {
					int index = thisLine.indexOf("]");
					thisLine = (String) thisLine.subSequence(index+1, thisLine.length());
		        		

				        if (thisLine.equals(emsembleStr)){
				        	return true;
				        }
					}
				     }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		
		return flag;
	}
	
	
	
	
}
