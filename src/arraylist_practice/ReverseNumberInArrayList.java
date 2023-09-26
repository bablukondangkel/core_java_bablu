package arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseNumberInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		for (int i = ar.size() - 1; i < ar.get(i); i--) {
				System.out.println(ar.get(i));
			}
		}
	}
