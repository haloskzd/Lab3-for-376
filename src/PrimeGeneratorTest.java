import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class PrimeGeneratorTest {

	@Test
	public void testNum1() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		// list.add(1);
		assertEquals(list, PrimeFactorGenerator.generateList(1));
	}
	
	@Test
	public void testNum4() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		assertEquals(list, PrimeFactorGenerator.generateList(4));
	}
	
	@Test
	public void testNum10() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		assertEquals(list, PrimeFactorGenerator.generateList(10));
	}
	
	@Test
	public void testNum100() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(11);
		list.add(13);
		list.add(17);
		list.add(19);
		list.add(23);
		list.add(29);
		list.add(31);
		list.add(37);
		list.add(41);
		list.add(43);
		list.add(47);
		list.add(53);
		list.add(59);
		list.add(61);
		list.add(67);
		list.add(71);
		list.add(73);
		list.add(79);
		list.add(83);
		list.add(89);
		list.add(97);
		
		assertEquals(list, PrimeFactorGenerator.generateList(100));
	}
	
}