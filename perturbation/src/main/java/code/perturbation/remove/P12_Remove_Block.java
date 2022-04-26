

	package code.perturbation.remove;

	import code.output.result.PerturbResult;
	import code.perturbation.utils.StatementType;
	import spoon.reflect.declaration.CtElement;

	public class P12_Remove_Block {
		public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
				int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5) {
			/**
			 * P12 Remove Perturbation of Block
			 */
			String actionNo = "[P12_Remove_Block]";
			String perturbCode = "";
			PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "",
					lineNo2, lineNo3, lineNo4, lineNo5, groundTruth);
			
		}

}
