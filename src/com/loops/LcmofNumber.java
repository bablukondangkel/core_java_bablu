package com.loops;
import java.util.Scanner;
public class LcmofNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=sc.nextInt();
		System.out.println("Enter the number");
		int num2=sc.nextInt();
		System.out.println("Enter the number");
		int max;
		int num3=sc.nextInt();
			if(num1>num2 && num1>num3) {
			 max=num1;
			 
		}else if(num2>num3) {
			max=num2;
			
		}else {
			max=num3;
			
			
		for(int i=max; i>=max; i+=max) {
			if(i%num1==0 && i%num2==0 && i%num3==0) {
				
				System.out.println("Lcm of given num is: "+i);
				break;
			}
		}
		}
		
	}

}
