package com.Array;

public class CommonElementsinArray {

	public static void main(String[] args) {
		int same = 0;
		int[] ar = { 13, 12, 16, 3, 5, 9 };
		int[] ar1 = { 18, 3, 9, 12, 20, 13 };
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar1.length; j++) {
				if (ar[i] == ar1[j]) {
					System.out.print(ar[i]+" ");

				}

			}
		}
	}

}
