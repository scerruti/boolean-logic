package org.jointheleague.level5.booleanlogic.twovariablefunctions;

import org.jointheleague.level5.booleanlogic.TwoVariableFunction;


public class NotQuantityAandB extends TwoVariableFunction {

	@Override
	public boolean execute(boolean a, boolean b) {
		return !(a && b);
	}
}