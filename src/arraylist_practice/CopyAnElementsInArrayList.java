package arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CopyAnElementsInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
		ArrayList<Integer> ar2 = new ArrayList<>(ar1.size());
		System.out.println("First Element Array");
		ar2.addAll(ar1);
		System.out.println(ar1);
		System.out.println("Copy Array");
		System.out.println(ar2);
	}
}
