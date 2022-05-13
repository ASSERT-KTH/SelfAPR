package code.perturbation.selfAPR;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import code.analysis.StatementAnalysis;
import code.output.result.PerturbResult;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class P12_Transplant_Condition {

	public static void insert(CtElement st, StatementType type, int methStart, int methEnd) {

		String actionNo = "[P12_Insert_Condition]";
		
		if(type.equals(StatementType.Condition) || type.equals(StatementType.ConditionHead) || type.equals(StatementType.For) || type.equals(StatementType.Whiles) ) {
			return;
		}
		
		List<String> perturbList = new ArrayList<String>();

		int lineNo1 = st.getPosition().getLine();
		String lineNo2 = "";
		String lineNo3 = "";
		String lineNo4 = "";
		String lineNo5 = "";

		String groundTruth = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1);

		if (groundTruth == null) {
			return;
		}

		groundTruth = groundTruth.trim();

		String lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";

		// statemnet 1, statement 2;

		if (";".equals(lastChar) && SelfAPRUtil.getRandomDouble() > 0.5) {
			String lineNo2String = " " + SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 1).trim();
			lastChar = lineNo2String.charAt(lineNo2String.length() - 1) + "";
			if (";".equals(lastChar)) {
				lineNo2 = lineNo1 + 1 + "";
				groundTruth += lineNo2String;
			}
		}
		
		
		lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
		
		if (!";".equals(lastChar)) {
			return;
		}

		

		List<String> translist = SimilarityPerturbation.perturb(st, groundTruth, StatementType.ConditionHead, 0.5,
				null);

		if (translist == null || translist.size() == 0) {
			return;
		}

		for (String transplantString : translist) {

			transplantString = transplantString.trim();

			if (transplantString == null || "".equals(transplantString)) {
				return;
			}

			if (!transplantString.endsWith("{") || !transplantString.startsWith("if")) {
				return;
			}

			transplantString = transplantString.replace("\n", " ").replace("\r", " ");

			String perturbCode = transplantString + " "+groundTruth + " }";

			perturbList.add(perturbCode);

		}

		for (String perturberd : perturbList) {
			if (perturberd != null) {
				PerturbResult.parsePerturb(actionNo, perturberd, methStart + "", methEnd + "", lineNo1 + "", lineNo2,
						lineNo3, lineNo4, lineNo5, groundTruth);
			}
		}
	}

}
