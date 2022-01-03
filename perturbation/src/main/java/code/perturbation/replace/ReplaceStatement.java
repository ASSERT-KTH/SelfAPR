package code.perturbation.replace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import code.analysis.MethodSignature;
import code.analysis.StatementAnalysis;
import code.analysis.Variables;
import code.output.result.PerturbResult;
import code.perturbation.ConstructorPerturbation;
import code.perturbation.OperatorPerturbation;
import code.perturbation.remove.FullyRemove;
import code.utils.SUPREUtil;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtBinaryOperatorImpl;
import spoon.support.reflect.code.CtConstructorCallImpl;
import spoon.support.reflect.code.CtFieldReadImpl;
import spoon.support.reflect.code.CtIfImpl;
import spoon.support.reflect.code.CtLiteralImpl;
import spoon.support.reflect.code.CtReturnImpl;
import spoon.support.reflect.code.CtVariableReadImpl;
import spoon.support.reflect.declaration.CtConstructorImpl;
import spoon.support.reflect.reference.CtExecutableReferenceImpl;

public class ReplaceStatement {

	public static void replace(CtCodeElement st, String type, int methStart, int methEnd) {

		TypeFilter<CtReturnImpl> returnfilter = new TypeFilter<CtReturnImpl>(CtReturnImpl.class);
		List<CtReturnImpl> returns = st.getElements(returnfilter);
		double r = SUPREUtil.getRandomDouble();
//		if (returns.size() > 0) {
//			for(CtCodeElement rt : returns) {
//			ReplaceReturnStatement.replaceReturn(rt, type, methStart, methEnd);
//			}
//		} else {
			ReplaceStatement.replaceRandom(st, type, methStart, methEnd);
//		}

	}

	private static void replaceRandom(CtCodeElement st, String type, int methStart, int methEnd) {
		int lineNo1 = st.getPosition().getLine();
		String lineNo2="";
		String lineNo3="";
		String perturbCode = null;
		String groundTruth = SUPREUtil.getSpecificLine(st.getPosition(), lineNo1);
		if(groundTruth==null) {
			return;
		}
		
		/**
		 * We care about the complete block at most three lines
		 */
		groundTruth=groundTruth.trim();
		if(!";".equals(groundTruth.charAt(groundTruth.length()-1)) && !"}".equals(groundTruth.charAt(groundTruth.length()-1)) && !"{".equals(groundTruth.charAt(groundTruth.length()-1))) {
			 lineNo2 =lineNo1+1+"";
			 groundTruth +=SUPREUtil.getSpecificLine(st.getPosition(), lineNo1+1).trim();	
			 if(!";".equals(groundTruth.charAt(groundTruth.length()-1)) && !"}".equals(groundTruth.charAt(groundTruth.length()-1)) && !"{".equals(groundTruth.charAt(groundTruth.length()-1)) ) {
			 lineNo3= lineNo1+2+"";
			 groundTruth +=SUPREUtil.getSpecificLine(st.getPosition(), lineNo1+2).trim();
			 }
		}
		
		

		double r = SUPREUtil.getRandomDouble();
		

		CtElement stParent = st.getParent();
		TypeFilter<CtExecutableReferenceImpl> executableFilter = new TypeFilter<CtExecutableReferenceImpl>(
				CtExecutableReferenceImpl.class);
		TypeFilter<CtVariableReadImpl> argumentFilter = new TypeFilter<CtVariableReadImpl>(CtVariableReadImpl.class);
		TypeFilter<CtBinaryOperatorImpl> bOfilter = new TypeFilter<CtBinaryOperatorImpl>(CtBinaryOperatorImpl.class);
		TypeFilter<CtConstructorCallImpl> constructorfilter = new TypeFilter<CtConstructorCallImpl>(
				CtConstructorCallImpl.class);
		
		
		

		List<CtExecutableReferenceImpl> executables = st.getElements(executableFilter);
		List<CtVariableReadImpl> argumentParents = stParent.getElements(argumentFilter);
		List<CtVariableReadImpl> arguments = st.getElements(argumentFilter);
		List<CtBinaryOperatorImpl> operators = st.getElements(bOfilter);
		List<CtConstructorCallImpl> constructors = st.getElements(constructorfilter);
		
		
		
		TypeFilter<CtReturnImpl> returnfilter = new TypeFilter<CtReturnImpl>(CtReturnImpl.class);
		List<CtReturnImpl> returns = stParent.getElements(returnfilter);
		
		


		
		if(constructors.size()>0 && r>0.0) {
			perturbCode = ConstructorPerturbation.perturb(st,groundTruth);
		}
		
		/**
		 * replace with the most similar statement in the context.
		 * LINE LEVEL!!
		 */
		else if(r>0.9) {		
			perturbCode = StatementAnalysis.getSimStatement(groundTruth,st.getPosition());
			System.out.println("replace with the most similar statement in the context  "+perturbCode);
			System.out.println("replace with the most similar statement in the context  "+groundTruth);
			System.out.println("replace with the most similar statement in the context  "+groundTruth);

		}
		
		else if (r>0.5 && operators.size()>0) {
			perturbCode = OperatorPerturbation.perturb(st,groundTruth);
		}

		
		else if (arguments.size() > 0 && r > 0.4) {
			
			//replace argument!!
			//todo
			CtVariableReadImpl var = arguments.get(0);

		}

		
		
		else if (executables.size() > 0 && r > 0.3) {

			if (SUPREUtil.getRandomDouble() > 0.4) {
				/**
				 * replace the execution with similar executable methods!
				 */
				String execStr = executables.get(0).toString();
				
				TypeFilter<CtLiteralImpl> literalfilter = new TypeFilter<CtLiteralImpl>(
						CtLiteralImpl.class);
				TypeFilter<CtVariableReadImpl> argumentsfilter = new TypeFilter<CtVariableReadImpl>(
						CtVariableReadImpl.class);
				
				
				List<CtVariableReadImpl> vars= executables.get(0).getElements(argumentsfilter);
				List<CtLiteralImpl> literals= executables.get(0).getElements(literalfilter);
				
				
				String simExec = MethodSignature.getRandomMethodWithSameParam(execStr,vars.size()+literals.size());
				
				
				execStr = SUPREUtil.getSimpleExecName(execStr);
//				Syst	em.out.print(execStr);
				System.out.print(execStr);
				perturbCode = groundTruth.replace(execStr, simExec);

				r = SUPREUtil.getRandomDouble();

				if (arguments.size() > 0 && SUPREUtil.getRandomDouble() > 0.5) {

					String argRand = "";
					if (argumentParents.size() > 0) {
						argRand = argumentParents.get(SUPREUtil.getRandomInt(argumentParents.size())).toString();
						argRand = SUPREUtil.getSimpleVarName(argRand);

					}

					String arg1 = arguments.get(0).toString();
					arg1 = SUPREUtil.getSimpleVarName(arg1);
					if (arguments.size() == 2) {
						String arg2 = arguments.get(1).toString();
						arg2 = SUPREUtil.getSimpleVarName(arg2);
						if (r > 0.75) {
							perturbCode = perturbCode.replace(arg2, arg1);
						} else if (r > 0.5) {
							perturbCode = perturbCode.replace(arg1, argRand);
						} else if (r > 0.25) {
							perturbCode = perturbCode.replace(arg2, argRand);
						} else {
							perturbCode = perturbCode.replace(arg1, arg2);
						}

					} else if (arguments.size() == 1) {
						String arg2 = SUPREUtil.getRandomVariable(arguments.get(0));
						if (r > 0.5) {
							perturbCode = perturbCode.replace(arg1, arg2);
						} else if (r > 0.0) {
							perturbCode = perturbCode.replace(arg1, argRand);
						}

					}

				}

			} else if(returns.size()>0) {
				// do something
				ReplaceReturnStatement.replaceReturn(st, type, methStart, methEnd);
				return;
				
				

			}
		}
		
		else if(returns.size()>0) {
			// do something
			ReplaceReturnStatement.replaceReturn(st, type, methStart, methEnd);
			return;
		} else {
			FullyRemove.remove(st, type, methStart, methEnd);
			return;		
		}
		
		
		

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("lineNo1", lineNo1 + "");
		map.put("lineNo2", lineNo2+"");
		map.put("lineNo3", lineNo3+"");
		map.put("lineNo4", "");
		map.put("lineNo5", "");
		map.put("line1", perturbCode);
		map.put("line2", "");
		map.put("line3", "");
		map.put("line4", "");
		map.put("line5", "");
		map.put("groundTruth", groundTruth);
		map.put("methodStart", methStart + "");
		map.put("methodEnd", methEnd + "");
		map.put("repairAction", "[REPLACE]");
		System.out.println("replace STATEMENT");

		PerturbResult.getCorruptedResult(map);

	}

}
