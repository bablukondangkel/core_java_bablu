package arraylist_practice;

public class WriteJavaPrograme {

	public static void main(String[] args) {
		String str="a2b3c1";
		for(int i=0; i<str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				System.out.println(str.charAt(i));
				
			}else {
				int x=Character.getNumericValue(str.charAt(i));
				for(int j=1;j<x;j++) {
					System.out.print(str.charAt(i-1));
				}
			}
		}
	}

}
