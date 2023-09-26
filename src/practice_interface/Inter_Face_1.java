package practice_interface;

public class Inter_Face_1 implements Inter_Face_Practice1{

	public static void main(String[] args) {
		Inter_Face_1 obj=new Inter_Face_1();
		obj.display();
		obj.show();
		obj.run();

	}
	public  void display() {
		int b=20;
		System.out.println(b);
	}
	public void show() {
		int c=30;
		System.out.println(c);
	}
	public void run() {
		int n=60;
		System.out.println(n);
		
	}

}
