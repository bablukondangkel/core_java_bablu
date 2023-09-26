package practice_interface;

public interface Inter_Face_Practice1 {
	public void show();

	default void display() {
		int b=10;
	}

	private void run() {
		int n=40;
		System.out.println(n);
	}

	public static void disp() {

	}

}
