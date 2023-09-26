package com.Array;
import java.util.Scanner;
public class PerfectSquareinArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an Array");
	int x=sc.nextInt();
	int[] ar=new int[x];
	for(int i=0; i<ar.length; i++) {
		System.out.println("Enter the number"+(i+1));
		ar[i]=sc.nextInt();
	}
	for(int i=0; i<ar.length; i++) {
		for(int j=1; j<ar.length; j++)
			System.out.println("Perfect square is="+ar[i]);
			
		}
	}
}
	
