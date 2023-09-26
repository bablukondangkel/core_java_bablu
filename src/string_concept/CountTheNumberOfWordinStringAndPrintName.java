package string_concept;

public class CountTheNumberOfWordinStringAndPrintName {

	public static void main(String[] args) {
		String str = " Pankaj sir academy test ";
		String[] s = str.trim().split(" ");
		System.out.println(s.length);
		for (String x : s) {
			System.out.println(x);
		}
	}
}
