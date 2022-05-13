package code.perturbation.selfAPR;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class P13_Transplant_Block {
public static void insert(CtElement st, StatementType type, int methStart, int methEnd) {

		String actionNo = "[P13_Insert_Block]";
		
		int lineNo1 = st.getPosition().getLine();
		String lineNo2 = "";
		String lineNo3 = "";
		String lineNo4 = "";
		String lineNo5 = "";


		List<String> perturbList = new ArrayList<String>();

		String groundTruth = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1-1)+SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1);

		
		
		if (groundTruth == null) {
			return;
		}
				
		
		List<String> translist = (List<String>) SimilarityPerturbation.perturb(st, groundTruth,StatementType.Condition,0.5,null);

		if (translist == null || translist.size() == 0) {
			return;
		}
		
		for (String transplantString : translist) {

			transplantString = transplantString.trim();

			if (transplantString == null || "".equals(transplantString)) {
				return;
			}
			
			
			if (!transplantString.endsWith("}") || !transplantString.startsWith("if")) {
				return;
			}
			
			if (transplantString.length() > groundTruth.length()*5) {
				return;
			}
			
			
			transplantString = transplantString.replace("\n", " ").replace("\r", " ");

			String perturbCode = transplantString ;
			
			perturbList.add(perturbCode);

		}
				
				
		
		
		groundTruth = "[Delete]";
		for (String perturberd : perturbList) {
			if (perturberd != null) {
				PerturbResult.parsePerturb(actionNo, perturberd, methStart + "", methEnd + "", lineNo1 + "", lineNo2,
						lineNo3, lineNo4, lineNo5, groundTruth);
			}
		}
		

	}
}
