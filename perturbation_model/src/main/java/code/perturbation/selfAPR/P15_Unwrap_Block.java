

	package code.perturbation.selfAPR;

	import java.util.List;

import code.output.result.PerturbResult;
	import code.perturbation.utils.StatementType;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBlockImpl;
import spoon.support.reflect.code.CtIfImpl;
import spoon.support.reflect.code.CtVariableReadImpl;

	public class P15_Unwrap_Block {
		public static void perturb(CtIfImpl st, StatementType type, int methStart, int methEnd, String groundTruth,
				int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5) {
			/**
			 * P15 Unwrap_Block Remove Perturbation of Condition
			 */
			String actionNo = "[P15_Unwrap_Block]";
			String perturbCode = "";
			if(type.equals(StatementType.Condition)) {
				
			 if(	st.getThenStatement()!=null) {
				 TypeFilter<CtBlockImpl> blocks = new TypeFilter<CtBlockImpl>(CtBlockImpl.class);
				 List<CtBlockImpl> thenStatements = st.getThenStatement().getElements(blocks);
				 if(thenStatements!=null && thenStatements.size()>0) {
					 List<CtStatement> stms = thenStatements.get(0).getStatements();
					 for(CtStatement cts : stms) {
						 String s = cts.toString().replace("\n", "").replace("\r", "");
						 perturbCode += s+"; ";
					 }
				 }
			 }
			
			PerturbResult.parsePerturb(actionNo, perturbCode, methStart + "", methEnd + "", lineNo1 + "",
					lineNo2, lineNo3, lineNo4, lineNo5, groundTruth);
			}
			
			
		}

}
