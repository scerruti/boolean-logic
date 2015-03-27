package org.jointheleague.level5.booleanlogic;
import static org.junit.Assert.*;

import org.jointheleague.level5.booleanlogic.TruthTable;
import org.jointheleague.level5.booleanlogic.twovariablefunctions.AandB;
import org.junit.Test;


public class TruthTableTest {
	protected TruthTable table = new TruthTable();

	@Test
	public void test() {
		String expected = 
			"   A   |   B   | Result\n" +
			"-------+-------+--------\n" +
			" True  | True  | True\n" +
			" True  | False | False\n" +
			" False | True  | False\n" +
			" False | False | False\n";
		
		String result = table.generateTable(new AandB());
		System.out.println(result);
		assertEquals(expected, result);
	}

}
