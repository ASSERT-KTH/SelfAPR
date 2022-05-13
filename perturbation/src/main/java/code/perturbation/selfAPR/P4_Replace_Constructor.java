package code.perturbation.selfAPR;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import code.output.result.PerturbResult;
import code.perturbation.ConstructorPerturbation;
import code.perturbation.utils.SelfAPRUtil;
import code.perturbation.utils.StatementType;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;
import spoon.support.reflect.code.CtConstructorCallImpl;
import spoon.support.reflect.code.CtInvocationImpl;
import spoon.support.reflect.code.CtOperatorAssignmentImpl;
import spoon.support.reflect.code.CtVariableReadImpl;

public class P4_Replace_Constructor {
	public static void perturb(CtElement st, StatementType type, int methStart, int methEnd, String groundTruth,
			int lineNo1, String lineNo2, String lineNo3, String lineNo4, String lineNo5) {

		/**
		 * P4 Constructor Perturbation
		 */

		String actionNo = "[P4_Replace_Constructor]";
		
		List<String> corruptedCodeList = new ArrayList();
		
		List<CtVariableReadImpl> argumentsDuplicates = st
				.getElements(new TypeFilter<CtVariableReadImpl>(CtVariableReadImpl.class));
		  List<CtElement> arguments = new ArrayList<CtElement>(new LinkedHashSet<CtElement>(argumentsDuplicates));

		
		List<CtConstructorCallImpl> constructors = st.getElements(new TypeFilter<CtConstructorCallImpl>(CtConstructorCallImpl.class));

		if(constructors.size()==0) {
			return;
		}
		
		
		String perturbContructor= ConstructorPerturbation.perturb(st, groundTruth);
		
		if (perturbContructor!=null && groundTruth.contains("new") && perturbContructor!="" && perturbContructor!=" ") {
			String perturbCode =  groundTruth.split("new")[0] + perturbContructor;
			corruptedCodeList.add(perturbCode);
		}
		
		
		
		if(arguments.size() > 1) {
			for(int i = 0; i<arguments.size(); i ++) {
				CtElement arg = arguments.get(i);
				String corruptedCode = null;
				String varStr = SelfAPRUtil.getSimpleVarName(arg.toString());

				//remove one
				if(groundTruth.contains(varStr+",")) {
				corruptedCode = groundTruth.replaceFirst(varStr+"," , "");
				corruptedCodeList.add(corruptedCode);

				} else if(groundTruth.contains(", "+varStr)) {
					corruptedCode = groundTruth.replaceFirst(", "+varStr, "");
					corruptedCodeList.add(corruptedCode);
				}
			}
		}
		
		if(corruptedCodeList!=null) {
		for(String perturbCode : corruptedCodeList) {
		if (!groundTruth.equals(perturbCode) && perturbCode != null) {
			PerturbResult.parsePerturb(actionNo,perturbCode,methStart+"",methEnd+"",lineNo1+"",lineNo2,lineNo3,lineNo4,lineNo5,groundTruth);
		}
		}
		}
	}
	
}
