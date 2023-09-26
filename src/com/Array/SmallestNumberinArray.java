package com.Array;

public class SmallestNumberinArray {

	public static void main(String[] args) {
		int[] ar=new int[] {3,12,5,70,9,14,6};
		int num=ar[0];
		for(int i=0; i<ar.length; i++) {
			if(ar[i]<=num) {
				num=ar[i];
			}
		}
		System.out.println("Smallest Number in Array="+num);
		
	}
		
	}


