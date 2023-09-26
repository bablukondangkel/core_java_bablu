package hash_map_practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FindtheSumOfNumberinHashMap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
	HashMap<Integer, Integer> map = new HashMap<>();
	ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(12,34,11,10,12,34));
	 for(int i=0; i<ar.size(); i++) {
		 int diff=num-ar.get(i);
		 if(map.containsKey(diff)) {
			 System.out.println(diff+" "+(num-diff));
			 break;
		 }else {
			 map.put(ar.get(i),i);
		 }
		 
	 }
	 
	}
}

