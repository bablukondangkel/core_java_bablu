package arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindElementSumInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(3, 4, 5, 1, 6, 7));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sum of total number");
		int num = sc.nextInt();
		for (int i = 0; i < ar.size(); i++) {
			for(int j=i+1; j<ar.size();j++) {
				int sum=ar.get(i)+ar.get(j);
				if (sum==num) {
					System.out.println(+ar.get(i)+" "+ar.get(j));
			}
			}
		}
	}
}
