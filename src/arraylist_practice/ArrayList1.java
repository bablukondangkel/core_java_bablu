package arraylist_practice;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(12);
		ar.add(23);
		ar.add(45);
		for (int i = 0; i < ar.size(); i++) {

		}
		System.out.println(ar);
		System.out.println(ar.get(1));
		System.out.println(ar.get(2));
	}
}
