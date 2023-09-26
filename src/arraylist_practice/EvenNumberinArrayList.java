package arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumberinArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(12, 45, 67, 15, 705, 2));
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i) % 2 == 0) {
				System.out.println(ar.get(i));
			}
		}
	}

}
