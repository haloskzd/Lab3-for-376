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
	
}