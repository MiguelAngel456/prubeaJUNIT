package EJER5;

import static org.junit.Assert.*;

import org.junit.Test;

public class EJER5Test {

	@Test
	public void testSuma() {
		EJER5 sum1=new EJER5 (10,20);
		assertEquals(30,sum1.suma());
	}

	@Test
	public void testResta() {
		EJER5 sum1=new EJER5 (30,20);
		assertEquals(10,sum1.resta());
	}

	@Test
	public void testMultiplica() {
		EJER5 sum1=new EJER5 (3,2);
		assertEquals(6,sum1.multiplica());
	}

	@Test
	public void testDivide() {
		EJER5 sum1=new EJER5 (6,2);
		assertEquals(3,sum1.divide());
	}

}
