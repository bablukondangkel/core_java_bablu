package createfile;
import java.io.File;
import java.io.FileReader;

public class FilePractice1 {
	public static void main(String[] args) {
		try {
			File f=new File("C:\\file java\\A.txt");
			FileReader fr=new FileReader(f);
			for(int i=0; i<f.length();i++) {
				System.out.print((char)fr.read());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
