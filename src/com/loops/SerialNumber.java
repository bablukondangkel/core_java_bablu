package com.loops;

public class SerialNumber {

	public static void main(String[] args) {
		int num = 5;
		for (int i = 1; i <= num; i++) {
			System.out.println();
			for (int j = 1; j <= num - i + 1; j++) {
				System.out.print(" "+j);
			}
		}
		int n=0;
		for(int i =1;i<=5;i++) {
			System.out.println();
			for(int j=1; j<=i;j++) {
				n++;
				System.out.print(" "+n);
			}
			
		}
	}

}
