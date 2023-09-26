package hash_map_practice;
import java.util.HashMap;
public class HashPractice {
	
	public static void main(String[] args) {
		 HashMap<String, Integer> map = new HashMap<>();
		 map.put("Vishal", 10);
		 map.put("Bablu", 30);
		 map.put("Sachin", 30);
		 map.put("Sachin", 40);
		 System.out.println(map.size());
	}
}