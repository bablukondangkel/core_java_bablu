package arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class OddNumberinArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(12, 13, 16, 7, 8, 15));
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i) % 2 != 0) {
				System.out.println(ar.get(i));
			}
		}

	}
}
