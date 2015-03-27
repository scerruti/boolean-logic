package org.jointheleague.level5.booleanlogic;

public abstract class TwoVariableFunction implements Function {

	@Override
	public boolean execute(boolean... inputs) {
		if (inputs.length !=2 ) throw new IllegalArgumentException(
				"TwoVariableFunctions require two variables.");
		return execute(inputs[0], inputs[1]);
	}
	
	public abstract boolean execute(boolean a, boolean b);
}
