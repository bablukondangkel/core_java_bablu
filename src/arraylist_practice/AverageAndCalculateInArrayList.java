package arraylist_practice;
import java.util.ArrayList;
import java.util.Arrays;
public class AverageAndCalculateInArrayList {

	public static void main(String[] args) {
		double num=0.0d;
		float avg=0.0f;
		ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(23,56,4,8,90));
		for(int i=0; i<ar.size();i++) {
			num=num+ar.get(i);
		}
		avg=(float)(num/ar.size());
		System.out.println(avg);
		
	}

}
