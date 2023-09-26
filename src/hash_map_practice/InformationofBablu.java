package hash_map_practice;

import java.util.HashMap;
import java.util.Map;

public class InformationofBablu {

	public static void main(String[] args) {
		HashMap<String, String> has = new HashMap<>();
		has.put("Name", "Bablu");
		has.put("Age", "25");
		has.put("Sex", "Male");
		has.put("Address", "Patia Bbsr");

		for (Map.Entry<String, String> entry : has.entrySet()) {
			System.out.println("key:" + entry.getKey() + "  value: " + entry.getValue());
		}
	}

}
