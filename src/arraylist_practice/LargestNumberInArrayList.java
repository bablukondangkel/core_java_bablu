package arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestNumberInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(130,12, 73, 46,140, 1, 90, 120));
		int num =0;
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i) > num) {
				num = ar.get(i);
			}
		}
		System.out.println(num);
	}

}
