package com.loops;

public class StarLoop2 {

	public static void main(String[] args) {
		int n = 0;
		for (int i = 5; i >= 1; i--) {
				n++;
			for (int k = 1; k < n; k++) {
				System.out.print("*");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
