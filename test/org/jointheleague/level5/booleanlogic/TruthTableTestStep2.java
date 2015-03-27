package org.jointheleague.level5.booleanlogic;
import static org.junit.Assert.*;

import org.jointheleague.level5.booleanlogic.TruthTable;
import org.jointheleague.level5.booleanlogic.twovariablefunctions.NotAandNotB;
import org.jointheleague.level5.booleanlogic.twovariablefunctions.NotAorNotB;
import org.jointheleague.level5.booleanlogic.twovariablefunctions.NotQuantityAandB;
import org.jointheleague.level5.booleanlogic.twovariablefunctions.NotQuantityAorB;
import org.junit.Test;


public class TruthTableTestStep2 {
	protected TruthTable table = new TruthTable();

	@Test
	public void testDeMorgansTheorum() {
		
		String notAandNotB = table.generateTable(new NotAandNotB());
		String notQuantityAorB = table.generateTable(new NotQuantityAorB());
		System.out.println(notAandNotB);
		System.out.println(notQuantityAorB);
		assertEquals(notAandNotB, notQuantityAorB);
		
		String notAorNotB = table.generateTable(new NotAorNotB());
		String notQuantityAandB = table.generateTable(new NotQuantityAandB());
		System.out.println(notAorNotB);
		System.out.println(notQuantityAandB);
		assertEquals(notAorNotB, notQuantityAandB);
		
	}
}
