package code.perturbation.selfAPR;

import java.util.HashMap;

import code.output.result.PerturbResult;
import code.perturbation.LiteralPerturbation;
import code.perturbation.ModifiersPerturbation;
import code.perturbation.TypePerturbation;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.declaration.CtElement;

public class Replace {

	public static void replace(CtElement st, StatementType type, int methStart, int methEnd) {

		int lineNo1 = st.getPosition().getLine();
		String lineNo2 = "";
		String lineNo3 = "";
		String lineNo4 = "";
		String lineNo5 = "";

		String groundTruth = SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1);
		if (groundTruth == null) {
			return;
		}

		/**
		 * We care about the complete block at most five lines
		 */
		groundTruth = groundTruth.trim();

		String lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
		if (!";".equals(lastChar) && !"}".equals(lastChar) && !"{".equals(lastChar)) {
			
			lineNo2 = lineNo1 + 1 + "";
			groundTruth += " " + SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 1).trim();
			lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
			if (!";".equals(lastChar) && !"}".equals(lastChar) && !"{".equals(lastChar) ) {
				lineNo3 = lineNo1 + 2 + "";
				groundTruth += " " + SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 2).trim();
			}
			
			lastChar = groundTruth.charAt(groundTruth.length() - 1) + "";
			if (!";".equals(lastChar) && !"}".equals(lastChar) && !"{".equals(lastChar) ) {
				lineNo4 = lineNo1 + 3 + "";
				groundTruth += " " + SelfAPRUtil.getSpecificLine(st.getPosition(), lineNo1 + 3).trim();
			}
					
		}
		
		
		
		P1_Replace_Type.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,lineNo5);
		P2_Replace_Operator.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,lineNo5);
		P3_Replace_Literal.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,lineNo5);
		P4_Replace_Constructor.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,lineNo5);
		P5_Replace_Variable.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,lineNo5);
		P6_Replace_Expression.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,lineNo5);
		P7_Replace_Invocation.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,lineNo5);
		P8_Replace_Mix.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,lineNo5);
		P9_Replace_Statement.perturb(st, type, methStart, methEnd, groundTruth, lineNo1, lineNo2, lineNo3, lineNo4,lineNo5);
		P10_Move_Statement.insert(st, type, methStart, methEnd);
	

	}

}
