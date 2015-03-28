import java.util.ArrayList;

public class PrimeFactorGenerator {

	public static ArrayList<Integer> generateList(int maxNum) {
		ArrayList<Integer> retList = new ArrayList<Integer>();
		// loop through the numbers one by one
				for (int i = 1; i < maxNum; i++) {
					if (i == 2){
						retList.add(i);
					}
					for (int j = 2; j < i; j++) {
						if (j == i - 1) {
							retList.add(i);
						}
						if (i % j == 0) {
							break; // exit the inner for loop
						}
					}
				}

		return retList;
	}

}
