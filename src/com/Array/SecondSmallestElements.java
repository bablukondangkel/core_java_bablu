package com.Array;

public class SecondSmallestElements {

	public static void main(String[] args) {
		int[] ar = { 3, 6, 67, 4, 90, 74, 1 };
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
			System.out.print(ar[i] + " ");

		}
		System.out.println("");
		System.out.print("Second Smallest Number:");
		for (int j = 0; j < ar.length; j++) {

		}
		System.out.println(ar[ar.length - 2]);
	}
}
