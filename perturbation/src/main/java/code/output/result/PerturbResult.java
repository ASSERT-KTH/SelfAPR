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



	public static void  getCorruptedResult(HashMap<String, String> map) {		
		
		String lineNo1 = map.get("lineNo1");
		String lineNo2 = map.get("lineNo2"); 		
		String lineNo3 = map.get("lineNo3"); 	
		String lineNo4 = map.get("lineNo4"); 
		String lineNo5 = map.get("lineNo5"); 		
		String line1 = map.get("line1");
		
	
		String action = map.get("repairAction");		
		String groundTruth = map.get("groundTruth");
		
		String methodStart = map.get("methodStart");		
		String methodEnd = map.get("methodEnd");

		
		
		if(groundTruth==null || line1==null) {
			return;
		}
		
		if(action.contains("REPLACE")) {
			if (line1.trim().equals(groundTruth.trim())) {
				return;
			}
		}
		
		
		
		
		line1 =line1.trim();
		groundTruth =groundTruth.trim();

		//not a block
		if(methodStart.equals(methodEnd)) {
			methodStart = "";
			methodEnd="";
		}		
		
		String classinfo = ClassAnalysis.getCurrentClass();
		String method = MethodSignature.getCurrentMethod();
		String variables = Variables.getVariableInfo();
		
		String meta = method + " "+ classinfo + " "+ variables;
		
		String emsembleStr = action+"^"+line1+"^"+lineNo1+"^"
							+lineNo2+"^"
							+lineNo3+"^"
							+lineNo4+"^"
							+lineNo5+"^"
							+methodStart+"^"+methodEnd+"^"
							+ action +" "+groundTruth+"^"+meta;
				
				
		System.out.println(emsembleStr);
//		copy targetFile
		String filename = Main.getPathDir();
		if(filename.contains("Bears")) {
		filename = filename.replace("Bears-", "Perturbation-Bears-");
		} else if (filename.contains("Lang")) {
			filename = filename.replace("Lang", "Perturbation-Lang");
		}else if (filename.contains("Math")) {
			filename = filename.replace("Math", "Perturbation-Math");
		}else if (filename.contains("Mockito")) {
			filename = filename.replace("Mockito", "Perturbation-Mockito");
		}else if (filename.contains("Time")) {
			filename = filename.replace("Time", "Perturbation-Time");
		}else if (filename.contains("Closure")) {
			filename = filename.replace("Closure", "Perturbation-Closure");
		}else if (filename.contains("Cli")) {
			filename = filename.replace("Cli", "Perturbation-Cli");
		}else if (filename.contains("Codec")) {
			filename = filename.replace("Codec", "Perturbation-Codec");
		}else if (filename.contains("Compress")) {
			filename = filename.replace("Compress", "Perturbation-Compress");
		}else if (filename.contains("Csv")) {
			filename = filename.replace("Csv", "Perturbation-Csv");
		}else if (filename.contains("Gson")) {
			filename = filename.replace("Gson", "Perturbation-Gson");
		}else if (filename.contains("JacksonCore")) {
			filename = filename.replace("JacksonCore", "Perturbation-JacksonCore");
		}else if (filename.contains("JacksonDatabind")) {
			filename = filename.replace("JacksonDatabind", "Perturbation-JacksonDatabind");
		}else if (filename.contains("JacksonXml")) {
			filename = filename.replace("JacksonXml", "Perturbation-JacksonXml");
		}else if (filename.contains("Jsoup")) {
			filename = filename.replace("Jsoup", "Perturbation-Jsoup");
		}else if (filename.contains("JxPath")) {
			filename = filename.replace("JxPath", "Perturbation-JxPath");
		}else if (filename.contains("Chart")) {
			filename = filename.replace("Chart", "Perturbation-Chart");
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
			BufferedWriter writer = 	new BufferedWriter(new FileWriter(filename,true));
			writer.append(emsembleStr+"\n");
			writer.close();
			
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
		boolean flag = false;
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(filename));
			String thisLine="";
			 try {
				while ((thisLine = br.readLine()) != null) {
				        if (emsembleStr.equals(thisLine)){
				        	return true;
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
