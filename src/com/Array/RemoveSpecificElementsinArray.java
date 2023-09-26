package com.Array;

public class RemoveSpecificElementsinArray {

	public static void main(String[] args) {
		int[] ar = new int[] { 10, 20, 30, 40, 50};
		int[] ar1 = new int[ar.length - 1];
		int remove = 40;
		int count = 0;
		
		System.out.println("First Array:");
		for(int j=0; j<ar.length;j++) {
			System.out.print(ar[j]+" ");
		}
		System.out.println("  ");
		System.out.println("");
		System.out.println("Second Array");
		for (int i = 0; i < ar.length; i++) {
		
			if (remove != ar[i]) {
				ar1[count] = ar[i];
				count++;
				System.out.print(ar[i]+" ");
			
		}
			
			}

		}
	}

