package com.Array;

public class PrimeNumberinArray {

	public static void main(String[] args) {
		System.out.print("Prime number= ");
		int[] ar=new int [] {8,5,3,7,8,10};
		
		int max=ar[1];
		for(int i=0; i<ar.length; i++) {
			int count=0;
			
			for(int j=1; j<ar[i]; j++) {
				if(ar[i]%j==0) {
					count++;
					
				}
			}if(count<=2) {
				System.out.print(ar[i]+" ");
				
				if(ar[i]>max) {
					max=ar[i];
					System.out.println();
					System.out.println("Largest Prime Number="+max);
				}
				
		}
			}
		}
		
	}


