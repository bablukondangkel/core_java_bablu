package com.loops;
import java.util.Scanner;
public class SumFirstNatrualNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		int sum = 0;
		for(int i=0; i<=x; i=i+1) {
			sum=sum+i;
		}
		System.out.println("Sum of first natural number="+sum);
	}

}
