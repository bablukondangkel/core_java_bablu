package hashset_practice_java;
import java.util.HashSet;
public class InformationOfClient {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("Bablu");
		hs.add("Ravi");
		hs.add("Honey");
		hs.add("Bablu");
		
		for(String sc:hs) {
			System.out.println(sc);
		}
	}

}
