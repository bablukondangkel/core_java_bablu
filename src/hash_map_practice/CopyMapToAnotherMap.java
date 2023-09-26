package hash_map_practice;
import java.util.HashMap;
public class CopyMapToAnotherMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hash1=new HashMap<>();
		HashMap<Integer, String> hash2=new HashMap<>();
		System.out.println("First HashMap");
		hash1.put(1,"A");
		hash1.put(2,"B");
		hash1.put(3,"C");
		hash1.put(4,"D");
		hash2.putAll(hash1);
		System.out.println(hash1);
		System.out.println("Second HashMap");
		System.out.println(hash2);
	}

}
