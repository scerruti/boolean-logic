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
			"   A   |   B   | A and B\n" +
			"-------+-------+--------\n" +
			"  true |  true | true\n" +
			"  true | false | false\n" +
			" false |  true | false\n" +
			" false | false | false\n";
		
		String result = table.generateTable(new AandB());
		System.out.println(result);
		assertEquals(expected.substring(expected.indexOf("\n")), result.substring(result.indexOf("\n")));
	}

}
