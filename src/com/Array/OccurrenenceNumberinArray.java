package com.Array;

public class OccurrenenceNumberinArray {

	public static void main(String[] args) {
		int[] ar = { 6,12,12, 12,56, 89, 68,8,9 };
		int	num=ar[0];
		int max=0;
		int count=0;
			for (int i = 0; i < ar.length; i++) {
				if (ar[i] == num) {
					System.out.print(ar[i]+" ");
					count++;
					
				} 
		}
			System.out.println();
			System.out.println(count);
			}
		}
	
