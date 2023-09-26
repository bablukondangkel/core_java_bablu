package hash_map_practice;
import java.util.HashMap;
public class Key_ValueEmptyorNotInHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		if(map.isEmpty()) {
				System.out.println("HashMap is Empty");
			}else {
				System.out.println("HashMap is NotEmpty");
			}
		}
	}


