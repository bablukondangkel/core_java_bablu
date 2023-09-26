package com.loops;

import java.util.Scanner;

public class Smallestnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int num = sc.nextInt();
		System.out.println("enter second number");
		int num1 = sc.nextInt();

		if (num > num1) {
			System.out.println("True1");
		} else if(num<num1){
			System.out.println("true2");
		}else {
			System.out.println("false");
		}
	}

}
