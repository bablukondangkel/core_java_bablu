package hash_map_practice;
import java.util.HashMap;
public class RemoveAllElementInHashMap {

	public static void main(String[] args) {
	HashMap<Integer, String> hash1=new HashMap<>();
	hash1.put(1, "A");
	hash1.put(2, "B");
	System.out.println("Before HashMap");
	System.out.println(hash1);
	hash1.clear();
	System.out.println("After HashMap");
	System.out.println(hash1);
	}

}
