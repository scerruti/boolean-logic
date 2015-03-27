package org.jointheleague.level5.booleanlogic;

public class TruthTable {
	public String generateTable(TwoVariableFunction fn) {
		StringBuilder response = new StringBuilder();
		response.append("   A   |   B   | Result\n");
		response.append("-------+-------+--------\n");
		
		for (boolean a : new boolean[] {true, false}) {
			for (boolean b : new boolean[] {true, false}) {
				response.append(String.format(" %5.5s | %5.5s | %s\n", a, b, fn.execute(a, b)));
			}
		}
		
		return response.toString();
	}

}
