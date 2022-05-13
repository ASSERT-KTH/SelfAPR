package code.perturbation.selfAPR;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import code.analysis.StatementAnalysis;
import code.output.result.PerturbResult;
import code.perturbation.SimilarityPerturbation;
import code.perturbation.selfAPR.mix.ReplaceStatement;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;

public class P10_Move_Statement {

	public static void insert(CtElement st, StatementType type, int methStart, int methEnd) {

		if (type.equals(StatementType.Condition) || type.equals(StatementType.ConditionHead)
				|| type.equals(StatementType.For) || type.equals(StatementType.Whiles)) {
			return;
		}

		String actionNo = "[P10_Move_Statement]";

		int lineNo1 = st.getPosition().getLine();
		String lineNo2 = "";
		String lineNo3 = "";
		String lineNo4 = "";
		String lineNo5 = "";
		List<String> perturbList = new ArrayList<String>();
		String groundTruth = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1);
		if (groundTruth == null) {
			return;
		}

		/**
		 * We care about the complete block at most three lines
		 */
		groundTruth = groundTruth.trim();

		String lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
		String perturbCodeMove = groundTruth;

		if (SelfAPRUtil.getRandomDouble() > 0.6) {
			// statemnet 1, statement 1+1;
			String lineNo2String = " " + SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 1).trim();
			lastChar = lineNo2String.charAt(lineNo2String.length() - 1) + "";
			// switch statement 1 and statement 1+1
			if (";".equals(lastChar) || "}".equals(lastChar) || "{".equals(lastChar)) { // complete statement
				lineNo2 = lineNo1 + 1 + "";
				groundTruth += lineNo2String;
				perturbCodeMove = lineNo2String + " " + perturbCodeMove; // learn to move code statement 1 to statement
																			// 2
				perturbList.add(perturbCodeMove);
			}
		}

		else if (SelfAPRUtil.getRandomDouble() > 0.2) {

			String lineNo2String = " " + SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 1).trim();
			lastChar = lineNo2String.charAt(lineNo2String.length() - 1) + "";

			// switch statement 1 and statement 1+2
			if (";".equals(lastChar) || "}".equals(lastChar) || "{".equals(lastChar)) { // complete statement
				lineNo2 = lineNo1 + 1 + "";

				String lineNo3String = " " + SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 2).trim();
				lastChar = lineNo3String.charAt(lineNo3String.length() - 1) + "";
				if (";".equals(lastChar) || "}".equals(lastChar) || "{".equals(lastChar)) { // complete statement
					lineNo3 = lineNo1 + 2 + "";
					groundTruth = groundTruth + lineNo2String + lineNo3String;
					perturbCodeMove = lineNo3String + lineNo2String + perturbCodeMove;
					perturbList.add(perturbCodeMove);
				}
			}
		}

		for (String perturberd : perturbList) {
			if (perturberd != null) {
				PerturbResult.parsePerturb(actionNo, perturberd, methStart + "", methEnd + "", lineNo1 + "", lineNo2,
						lineNo3, lineNo4, lineNo5, groundTruth);
			}
		}

	}

}
