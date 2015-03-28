import java.util.ArrayList;


public class PrimeFactor {
	
	public static ArrayList<Integer> generate (int inputnum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i <= inputnum; i++) {
			while (inputnum % i == 0) {
		    	list.add(i);
		       	inputnum /= i;
		    }
		}
		return list;
	}
}
