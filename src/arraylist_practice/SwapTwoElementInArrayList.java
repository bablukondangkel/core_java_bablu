package arraylist_practice;
import java.util.ArrayList;
import java.util.Arrays;
public class SwapTwoElementInArrayList {

	public static void main(String[] args) {
		ArrayList <Integer> ar1=new ArrayList<>(Arrays.asList(10));
		ArrayList<Integer> ar2=new ArrayList<>(Arrays.asList(20));
		ArrayList<Integer> num=new ArrayList<>(Arrays.asList());
		num=ar1;
		ar1=ar2;
		ar2=num;
		
		System.out.println("ar1"+ar1);
		System.out.println("ar2"+ar2);
			
		}
		
	}


