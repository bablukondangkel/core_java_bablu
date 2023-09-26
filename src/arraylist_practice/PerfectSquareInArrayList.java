package arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class PerfectSquareInArrayList {

	public static void main(String[] args) {
		System.out.println("Perfect Square");
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(12, 4, 15, 25, 16));
		for (int i = 0; i < ar.size(); i++) {
			for (int j = 1; j < ar.get(i); j++) {
				if (j * j == ar.get(i)) {
					System.out.println(ar.get(i));

				}
			}
		}
	}

}
