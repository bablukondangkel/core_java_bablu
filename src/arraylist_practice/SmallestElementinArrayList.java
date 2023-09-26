package arraylist_practice;
import java.util.ArrayList;
import java.util.Arrays;
public class SmallestElementinArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(12,56,89,1,7,100,130));
		int num=ar.get(0);
		for(int i=0; i<ar.size();i++) {
			if(ar.get(i)<num) {
				num=ar.get(i);
			}
		}
		System.out.println(num);
	}

}
