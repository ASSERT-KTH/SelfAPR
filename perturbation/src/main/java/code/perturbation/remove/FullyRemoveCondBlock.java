package code.perturbation.remove;

import java.util.HashMap;

import code.output.result.PerturbResult;
import code.utils.SUPREUtil;
import spoon.reflect.code.CtCodeElement;

public class FullyRemoveCondBlock {

	/**
	 * In this function, we remove only the condition - if (this.tickMarksVisible !=
	 * that.tickMarksVisible) { return false; - }
	 * 
	 * or one line of code insider of condition (type=statement)
	 * 
	 * @param exp
	 * @param type
	 * @return
	 */
	public static void remove(CtCodeElement exp, String type, int methodStart, int methodEnd) {

		HashMap<String, String> map = new HashMap<String, String>();
		int lineNo1 = exp.getPosition().getLine();
		String groundTruth = SUPREUtil.getSpecificLine(exp.getPosition(), lineNo1);

		map.put("lineNo1", lineNo1 + "");
		map.put("lineNo2",  "");
		map.put("lineNo3", "");
		map.put("lineNo4", "");
		map.put("lineNo5", "");
		map.put("line1", "");
		map.put("line2", "");
		map.put("line3", "");
		map.put("line4", "");
		map.put("line5", "");
		map.put("methodStart", methodStart + "");
		map.put("methodEnd", methodEnd + "");
		map.put("repairAction", "[ADD]");

		
		
		if (exp == null || exp.getPosition() == null || exp.getPosition().getFile() == null) {
			return;
		}

		String[] parent = exp.getParent().toString().split("\\n");


		if (parent.length <= 5 ) {
			
			if (parent.length == 2 ) {
				map.put("lineNo2",  lineNo1+1+"");
				groundTruth+=SUPREUtil.getSpecificLine(exp.getPosition(), lineNo1+1).trim();
				
			}else if (parent.length == 3 ) {
				map.put("lineNo2",  lineNo1+1+"");
				map.put("lineNo3",  lineNo1+2+"");
				groundTruth+=SUPREUtil.getSpecificLine(exp.getPosition(), lineNo1+1).trim();
				groundTruth+=SUPREUtil.getSpecificLine(exp.getPosition(), lineNo1+2).trim();

			}else if (parent.length == 4 ) {
				map.put("lineNo2",  lineNo1+1+"");
				map.put("lineNo3",  lineNo1+2+"");
				map.put("lineNo4",  lineNo1+3+"");
				groundTruth+=SUPREUtil.getSpecificLine(exp.getPosition(), lineNo1+1).trim();
				groundTruth+=SUPREUtil.getSpecificLine(exp.getPosition(), lineNo1+2).trim();
				groundTruth+=SUPREUtil.getSpecificLine(exp.getPosition(), lineNo1+3).trim();
				
			}else if (parent.length == 5 ) {
				map.put("lineNo2",  lineNo1+1+"");
				map.put("lineNo3",  lineNo1+2+"");
				map.put("lineNo4",  lineNo1+3+"");
				map.put("lineNo5",  lineNo1+4+"");
				groundTruth+=SUPREUtil.getSpecificLine(exp.getPosition(), lineNo1+1).trim();
				groundTruth+=SUPREUtil.getSpecificLine(exp.getPosition(), lineNo1+2).trim();
				groundTruth+=SUPREUtil.getSpecificLine(exp.getPosition(), lineNo1+3).trim();
				groundTruth+=SUPREUtil.getSpecificLine(exp.getPosition(), lineNo1+4).trim();

			}
		
			map.put("groundTruth", groundTruth);

			PerturbResult.getCorruptedResult(map);
		}
	}

}
