import java.util.ArrayList;

public class PrimeFactorGenerator {

	public static ArrayList<Integer> generateList(int maxNum) {
		ArrayList<Integer> retList = new ArrayList<Integer>();
		if (maxNum > 3) {
			retList.add(2);
			retList.add(3);
		} 
		if (maxNum > 9) {
			retList.add(5);
			retList.add(7);
		}
		return retList;
	}

}
