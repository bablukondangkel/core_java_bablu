package com.Array;

import java.util.Scanner;

public class SpecificPositioninArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Enter the number");
		int num = sc.nextInt();

		for (int i = 0; i < ar.length; i++) {
			if (num == ar[i]) {
				System.out.println(num + "=available");

			} else {
			}
		}
		System.out.println(num + "=not available");

	}
}
