package hash_map_practice;

import java.util.HashMap;

public class AssociationTheSpeicfValueInHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Bablu");
		map.put(2, "Krishna");
		map.put(3, "Chotu");
		map.put(4, "Rinku");
		map.put(5, "Ritish");
		System.out.println(map);
		for(int i=1; i<map.size(); i++) {
			System.out.println(map.get(i));
		}
	}

}
