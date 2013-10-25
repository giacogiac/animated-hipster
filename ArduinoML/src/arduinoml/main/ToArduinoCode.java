package arduinoml.main;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

import arduinoml.*;
import arduinoml.util.ArduinomlSwitch;

public class ToArduinoCode extends ArduinomlSwitch<String> {
	
	@Override
	public String caseSensor(Sensor object) {
		return "\tpinMode(" + object.getPin() + ", INPUT);\n";
	}

	@Override
	public String caseActuator(Actuator object) {
		return "\tpinMode(" + object.getPin() + ", OUTPUT);\n";
	}

	@Override
	public String caseTransition(Transition object) {
		StringBuilder sb = new StringBuilder();
		sb.append("\tif (");
		Iterator<Condition> i= object.getConditions().iterator();
		sb.append(doSwitch(i.next()));
		while(i.hasNext())
		{
			sb.append(" && ");
			sb.append(doSwitch(i.next()));
		}
		sb.append(")\n\t{\n\t\tprev = millis();\n\t\treturn ");
		sb.append(object.getGoto().getName());
		sb.append("();\n\t}\n");
		return sb.toString();
	}
	
	@Override
	public String caseState(State object) {
		StringBuilder sb = new StringBuilder();
		sb.append("void ");
		sb.append(object.getName());
		sb.append("()\n{\n");
		for(DigitalAction a: object.getActions()) {
			sb.append(doSwitch(a));
		}
		sb.append("\telapsed = millis() - prev;\n");
		for(Transition t: object.getTransitions()) {
			sb.append(doSwitch(t));
		}
		sb.append("\treturn ");
		sb.append(object.getName());
		sb.append("();\n}\n\n");
		return sb.toString();
	}

	@Override
	public String caseDigitalAction(DigitalAction object) {
		return "\tdigitalWrite(" + object.getActuator().getPin() + ", " + BStateToString(object.getBState()) + ");\n";
	}

	@Override
	public String caseDigitalSensorCondition(DigitalSensorCondition object) {
		return "(digitalRead(" + object.getSensor().getPin() + ") == " + BStateToString(object.getBState()) + ")";
	}
	
	@Override
	public String caseTimeCondition(TimeCondition object) {
		return "(elapsed " + comparisonToString(object.getTComp()) + " " + object.getTime() + ")";
	}

	@Override
	public String caseMachine(Machine object) {
		StringBuilder sb = new StringBuilder();
		sb.append("unsigned long prev;\nunsigned long elapsed;\n\n");
		sb.append("void setup()\n{\n");
		for(Brick b: object.getBricks()) {
			sb.append(doSwitch(b));
		}
		sb.append("}\n\n");
		for(State s: object.getStates()) {
			sb.append(doSwitch(s));
		}
		sb.append("void loop()\n{\n\tprev = millis();\n\treturn ");
		sb.append(object.getStart().getName());
		sb.append("();\n}\n");
		return sb.toString();
	}

	private String BStateToString(DigitalBrickState bs) {
		switch (bs) {
		case ON:
			return "HIGH";
		case OFF:
			return "LOW";
		default:
			return null;
		}
	}
	
	private String comparisonToString(Comparison comp) {
		switch (comp) {
		case INFERIOR:
			return "<";
		case SUPERIOR:
			return ">";
		case EQUAL:
			return "==";
		default:
			return null;
		}
	}
}
