package org.jointheleague.level5.booleanlogic.twovariablefunctions;

import org.jointheleague.level5.booleanlogic.TwoVariableFunction;


public class AandB extends TwoVariableFunction {

	@Override
	public boolean execute(boolean a, boolean b) {
		return (a && b);
	}

	@Override
	public String getName() {
		return "A and B";
	}
}