package arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumberInArrayList {

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		if (num <= 3) {
			return true;
		}
		if (num % 2 == 0 || num % 2 == 0) {
			return false;
		}
		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12,4,5,6,34,8,9,15));
		

		System.out.println("Prime numbers in the ArrayList:");

		for (Integer num : numbers) {
			if (isPrime(num)) {
				System.out.println(num);
			}
		}
	}

}
