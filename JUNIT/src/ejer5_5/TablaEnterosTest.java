package ejer5_5;

import static org.junit.Assert.*;

import org.junit.Test;

public class TablaEnterosTest {
	private static Integer[] tab;
	
	public void ArrayEnteros(){
		tab=new Integer[7];
		tab[0]=1;
		tab[1]=2;
		tab[2]=3;
		tab[3]=4;
		tab[4]=5;
		tab[5]=6;
		tab[6]=7;
	}
	
	
	
	@Test
	public void testSumaTabla() {
		fail("Not yet implemented");
		TablaEnteros t=new TablaEnteros(tab);
		assertEquals(28,t.sumaTabla());

	}

	@Test
	public void testMayorTabla() {
		fail("Not yet implemented");
		
	}

	@Test
	public void testPosicionTabla() {
		fail("Not yet implemented");

	}

}
