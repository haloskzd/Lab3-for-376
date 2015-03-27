import java.util.ArrayList;


public class PrimeFactor {
	
	public static ArrayList<Integer> generate (int inputnum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(inputnum > 1) {
			list.add(2);
		}
		return list;
	}
}
