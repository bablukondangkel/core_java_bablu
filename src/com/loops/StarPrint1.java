package com.loops;
import java.util.Scanner;
public class StarPrint1 {                                                                  

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
		System.out.println("Enter the coloum");
		int coloum=sc.nextInt();
		for(int i=1; i<=row; i++) {
			System.out.println("");
			for(int j=i; j<=i; j++ ) {
			}
			System.out.print("*");			
		}
	}

}
