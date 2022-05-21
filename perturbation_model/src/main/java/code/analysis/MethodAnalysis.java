//package code.analysis;
//
//import java.util.List;
//
//import spoon.reflect.code.CtBlock;
//import spoon.reflect.code.CtStatement;
//import spoon.reflect.cu.SourcePosition;
//import spoon.reflect.declaration.CtMethod;
//import spoon.reflect.visitor.filter.TypeFilter;
//import spoon.support.reflect.code.CtIfImpl;
//import spoon.support.reflect.code.CtReturnImpl;
//
//public class MethodAnalysis {
//
//	public static void analysis(List<CtMethod> methodList) {
//	for(CtMethod method: methodList) {
//		SourcePosition position = method.getPosition();
//		int methStart = position.getLine();
//		int methEnd = position.getEndLine();
//
//		
//		
//		CtBlock block = method.getBody();
//		if(block !=null) {
//			List<CtStatement> statements = block.getStatements();
//			for(CtStatement st : statements) {
//				
//				TypeFilter<CtIfImpl> condfilter = new TypeFilter<CtIfImpl>(CtIfImpl.class);
//				TypeFilter<CtReturnImpl> returnfilter = new TypeFilter<CtReturnImpl>(CtReturnImpl.class);
//				TypeFilter<CtStatement> statesFilter = new TypeFilter<CtStatement>(CtStatement.class);
//			    List<CtStatement> states = st.getElements(statesFilter);						
//
//
//				//conditions
//			    List<CtIfImpl> conditions = st.getElements(condfilter);						
//			    if (conditions.size()>0) {
//			    	ConditionAnalysis.getPerturbated(conditions,methStart,methEnd);				    	
//			    } else if(states.size()>0) {
//				    	StatementAnalysis.getPerturbated(states,methStart,methEnd);				    				    	
//			    }
//			    				
//			}
//		}						
//	}
//	}
//	}
