package com.Array;

public class LargestNumberinArray {

	public static void main(String[] args) {
		int [] ar={100,200,100,12,109,34,300,102};
		int max=ar[0];
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		System.out.println("Largest Number In Array="+max);
	}

}
