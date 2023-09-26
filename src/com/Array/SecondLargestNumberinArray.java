package com.Array;

public class SecondLargestNumberinArray {
	public static void main(String[] args) {
		int num;
		int[] ar = { 12, 45, 87, 2, 6, 1, 3 };

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length - 1; j++) {
				if (ar[j] > ar[j + 1]) {

					num = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = num;

				}
			}
		}
		System.out.println("Shorting Array:");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		System.out.print("Second Largest Number:" + ar[ar.length - 2]);

	}

}
