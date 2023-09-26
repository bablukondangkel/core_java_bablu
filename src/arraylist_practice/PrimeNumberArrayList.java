package arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumberArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(3, 5, 7, 8, 9, 13, 17));
		for (int i = 0; i < ar.size(); i++) {
			int count = 0;
			for (int j = 1; j <= ar.get(i); j++) {
				if (ar.get(i) % j == 0) {
					count++;
				}
			}
			if (count <= 2) {
				System.out.println(ar.get(i));

			}
		}

	}
}
