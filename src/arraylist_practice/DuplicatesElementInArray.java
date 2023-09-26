package arraylist_practice;
import java.util.ArrayList;
import java.util.Arrays;
public class DuplicatesElementInArray {

	public static void main(String[] args) {
		int count=0;
		ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(12,4,3,3,6,8,9,4));
		System.out.println("Dublicate Number is=");
		for(int i=0; i<ar.size();i++) {
			for(int j=i+1;j<ar.size();j++) {
				if (ar.get(i) == ar.get(j)) {
					count++;
					System.out.println(ar.get(i));
					
		}
				}
			}
		System.out.println("How much dublicate in array:");
		System.out.println(count);
		}

	}
	
