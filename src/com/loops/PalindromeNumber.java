package com.loops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num, sum = 0, temp = 0, reminder;
		System.out.println("Enter any number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();// for input a number
		temp = num;// for compaire the result while number is palindrome or not
		
		while (num > 0) {
			reminder = num % 10;// in this line num divided by 10
			sum = (sum * 10) + reminder;//here we sum multiply by 10 and add to remeinder
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Number is Pailndrome");

		} else {
			System.out.println("Number is Not Pailndrome");
		}
	}

}