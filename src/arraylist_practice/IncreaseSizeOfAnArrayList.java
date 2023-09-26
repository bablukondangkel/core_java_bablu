package arraylist_practice;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class IncreaseSizeOfAnArrayList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element to increase the ArrayList");
		int num=sc.nextInt();
		ArrayList<Integer> ar1=new ArrayList<> (Arrays.asList());
		ArrayList<Integer> ar2=new ArrayList<> (Arrays.asList(ar1.size()+num));
		for(int i=0;i<ar1.size();i++) {
			for(int j=0;j<ar1.size()+num;j++) {
				
			}
		}
		System.out.println(ar2.size());
		
		
	}

}
