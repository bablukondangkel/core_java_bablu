package com.loops;

import java.util.Scanner;

public class FibonaicSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num1 = sc.nextInt();
		System.out.println("Enter the number");
		int num2 = sc.nextInt();
		int max;
		for (int i = 0; i <= 10; i++) {
			max = num1 + num2;
			System.out.println(max);
			num1 = num2;
			num2 = max;
		}
	}

}
