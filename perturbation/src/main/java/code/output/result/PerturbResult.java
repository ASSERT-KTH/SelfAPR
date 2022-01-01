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

import code.analysis.Main;

public class PerturbResult {



	public static void  getCorruptedResult(HashMap<String, String> map) {		
		
		String lineNo1 = map.get("lineNo1");
		String lineNo2 = map.get("lineNo2"); 		
		String lineNo3 = map.get("lineNo3"); 	
		String lineNo4 = map.get("lineNo4"); 
		String lineNo5 = map.get("lineNo5"); 		
		String line1 = map.get("line1");
		String line2 = map.get("line2"); 		
		String line3 = map.get("line3"); 	
		String line4 = map.get("line4"); 
		String line5 = map.get("line5"); 
	
		String action = map.get("repairAction");		
		String groundTruth = map.get("groundTruth");
		
		String methodStart = map.get("methodStart");		
		String methodEnd = map.get("methodEnd");

		
		
		if(groundTruth==null || line1==null) {
			return;
		}
		
		
		line1 =line1.trim();
		groundTruth =groundTruth.trim();

		
		String emsembleStr = action+"^"+methodStart+"^"+methodEnd+"^"
							+lineNo1+"^"+line1+"^"
							+lineNo2+"^"+line2+"^"
							+lineNo3+"^"+line3+"^"
							+lineNo4+"^"+line4+"^"
							+lineNo5+"^"+line5+"^"
							+groundTruth;
				
				
		System.out.println(emsembleStr);
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
