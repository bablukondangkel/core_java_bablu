package arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class JointTwoElementsInArray {

	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<Integer> ar2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
		System.out.println("First Array");
		for (int i = 0; i < ar1.size(); i++) {
		}
		System.out.println(ar1);
		System.out.println("Second Array");
		for (int j = 0; j < ar2.size(); j++) {
		}
		System.out.println(ar2);
		ar1.addAll(ar2);
		System.out.println("Final joint Array");
		System.out.println(ar1);
	}

}
