import java.util.ArrayList;


public class PrimeFactor {
	
	public static ArrayList<Integer> generate (int inputnum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(inputnum == 2) {
			list.add(2);
		} else if (inputnum == 3) {
			list.add(3);
		} else if (inputnum == 4) {
			list.add(2);
			list.add(2);
		} else if (inputnum == 6) {
			list.add(2);
			list.add(3);
		} else if (inputnum == 8) {
			list.add(2);
			list.add(2);
			list.add(2);
		} else if (inputnum == 8) {
			list.add(2);
			list.add(2);
			list.add(2);
		}
		return list;
	}
}
