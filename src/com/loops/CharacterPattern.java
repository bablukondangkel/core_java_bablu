package com.loops;

public class CharacterPattern {

	public static void main(String[] args) {
		char count = 'A';
		for (int i = 1; i <= 7; i++) {// raws
			for (int j = 1; j <= i; j++) {// column
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}

}
