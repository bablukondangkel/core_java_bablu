package arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareElementInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<>(Arrays.asList(10, 34, 67, 20, 22));
		System.out.println("First Array" + ar1);
		
		ArrayList<Integer> ar2 = new ArrayList<>(Arrays.asList(10, 67, 22, 16, 88));
		System.out.println("Second Array" + ar2);
		
		System.out.println("Final Array");
		for (int i = 0; i < ar1.size(); i++) {
			for (int j = 0; j < ar2.size(); j++) {
				if (ar1.get(i) == ar2.get(j)) {
					System.out.print(ar1.get(i) + " ");

				}
			}
		}

	}

}
