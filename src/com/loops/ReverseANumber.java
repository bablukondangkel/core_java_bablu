package com.loops;
import java.util.Scanner;
public class ReverseANumber {

	public static void main(String[] args) {
		int num,sum=0,temp=0,reminder;
		System.out.println("Enter any Number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		temp=num;
		System.out.println("Reverse Number");
		while(num>0) {
			reminder=num%10;
			sum=sum*10+reminder;
			num=num/10;
				System.out.print(reminder);
				
			}
		}
	}

