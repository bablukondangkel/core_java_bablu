package com.loops;
import java.util.Scanner;
public class Square1to10 {

	public static void main(String[] args) {
		int sqr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=1; i<=num; i++) {
			sqr=i*i;
			System.out.println(sqr);
		}
	}

}
