package com.Array;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		int[] ar1 = new int[] { 10, 20, 30, 40, 30 };
		int num = 30;
		int count = 0;
		for(int i=0; i<ar1.length; i++) {
			System.out.print(ar1[i]+" ");
			System.out.print("");
		}
		
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] == num) {
				count++;

			}
		}
		
		int[] ar2 = new int[ar1.length - count];
		int count2 = 0;
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] != num) {
				ar2[count2] = ar1[i];
				count2++;
			}
		}
		System.out.println("");
		for(int i=0;i<ar2.length;i++) {
			System.out.print(ar2[i]+" ");
		}
	}
}
