package com.Array;

import java.util.Scanner;

public class KthLargestANdKthSmallest {

	public static void main(String[] args) {
		int[] ar = { 36, 56, 3, 8, 40, 70, 90 };
		int num = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length - 1; j++) {
				if (ar[j] < ar[j + 1]) {
					num = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = num;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		for (int j = 0; j < ar.length; j++) {
		}
		System.out.print("First Largest Number" + ar[ar.length - k]);
		System.out.println();
		System.out.print("Second Largest Number:" + ar[k - 1]);
	}

}
