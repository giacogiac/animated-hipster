/*
 * generated by Xtext
 */
package arduinoml.validation

import org.eclipse.xtext.validation.Check
import arduinoml.AMLMachine
import arduinoml.TimeCondition
import arduinoml.AMLState
import arduinoml.Transition
import java.util.List
import java.util.ArrayList
import arduinoml.TimeComparison

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class AMLXValidator extends AbstractAMLXValidator {

	@Check
	def checkYouBetterWorkBitch(AMLMachine m) {
		if (!m.start.name.equals("ybwb"))
			 warning("You better work bitch!!", m.eClass.getEStructuralFeature("start"));
	}
	
	@Check
	def checkSinkState(AMLState s) {
		for(Transition t : s.transitions) {
			if(t.conditions.forall[!TimeCondition.isInstance(it)])
				return;
			if(t.conditions.filter(TimeCondition).forall[it.TComp == TimeComparison::^AFTER])
				return;
		}
		if (s.transitions.empty) {
			warning("You never escape from that state", s.eClass.getEStructuralFeature("name"));
		} else {
			warning("You may never escape from that state", s.eClass.getEStructuralFeature("name"));
		}
	}
	
	@Check
	def checkUnreacheableState(AMLMachine m) {
		var List<AMLState> reached = new ArrayList<AMLState>();
		checkUnreacheableStateRecursive(m.start, reached);
		for (AMLState s : m.states) {
			if(!reached.contains(s))
				warning("This state is never reached", s, s.eClass.getEStructuralFeature("name"));
		}
	}
	
	def void checkUnreacheableStateRecursive(AMLState s, List<AMLState> reached) {
		if (!reached.contains(s)) {
			reached.add(s);
			for (Transition t : s.transitions) {
				checkUnreacheableStateRecursive(t.goto, reached);
			}
		}
	}
}