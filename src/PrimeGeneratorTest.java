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
	
}