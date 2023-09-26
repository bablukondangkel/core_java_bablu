package com.Array;
import java.util.Scanner;
public class EvenNumberinArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=sc.nextInt();	
		int[] ar=new int[n];
		for(int i=0; i<ar.length; i++) {
			System.out.println("Enter the number "+(i+1));
			ar[i]=sc.nextInt();
		}
		
		System.out.println("even numbers in the array are: ");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2==0) {
				System.out.print(ar[i]+ " ");
				
			}
		}
		
		}
	}


