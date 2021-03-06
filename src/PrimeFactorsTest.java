import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PrimeFactorsTest {

	@Test
	public void testNum1() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//list.add(1);
		assertEquals(list, PrimeFactor.generate(1));
	}
	
	@Test
	public void testNum2() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		assertEquals(list, PrimeFactor.generate(2));
	}
	
	@Test
	public void testNum3() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		assertEquals(list, PrimeFactor.generate(3));
	}
	
	@Test
	public void testNum4() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(2);
		assertEquals(list, PrimeFactor.generate(4));
	}
	
	@Test
	public void testNum6() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		assertEquals(list, PrimeFactor.generate(6));
	}
	
	@Test
	public void testNum8() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(2);
		list.add(2);
		assertEquals(list, PrimeFactor.generate(8));
	}
	
	@Test
	public void testNum9() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(3);
		assertEquals(list, PrimeFactor.generate(9));
	}
	
	@Test
	public void testNum325115() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(7);
		list.add(7);
		list.add(1327);
		assertEquals(list, PrimeFactor.generate(325115));
	}
}