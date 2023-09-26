package com.loops;
import java.util.Scanner;

public class FindandSumallIntegerbetween100t0200 {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=sc.nextInt();
		System.out.println("Enter the number");
		int num2=sc.nextInt();
		System.out.println("Enter the temp");
		int temp=sc.nextInt();
		int sum=0;
		for(int i=num1; i<num2; i++) {
			if(i%temp==0) {
				sum=sum+i;
				
				System.out.println(i);
				
			}
		}
		System.out.println(sum);
	}

}
