package com.Array;

public class NeighborsInArray {

	public static void main(String[] args) {
		int[] ar= {10,20,15,2,23,90,67};
		if(ar[0]<ar[1]) {
			System.out.println(ar[0]);
		}
		if(ar[ar.length-1]<ar[ar.length-2]) {
			System.out.println(ar[ar.length-1]);
		}
		for(int i=1;i<ar.length-1;i++) {
			if(ar[i]<ar[i-1] && ar[i]<ar[i+1]) {
				System.out.println(ar[i]);
			}
		}
	}

}
