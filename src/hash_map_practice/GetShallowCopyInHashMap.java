package hash_map_practice;
import java.util.HashMap;
public class GetShallowCopyInHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		HashMap<Integer,String> hash=new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		System.out.println("First HashMap");
		System.out.println(map);
		hash.putAll(map);
		hash.put(4, "D");
		System.out.println("Second HashMap");
		System.out.println(hash);
	}

}
