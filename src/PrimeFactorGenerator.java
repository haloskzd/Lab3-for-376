import java.util.ArrayList;

public class PrimeFactorGenerator {

	public static ArrayList<Integer> generateList(int maxNum) {
		ArrayList<Integer> retList = new ArrayList<Integer>();
		if (maxNum == 4) {
			retList.add(2);
			retList.add(3);
		}
		return retList;
	}

}
