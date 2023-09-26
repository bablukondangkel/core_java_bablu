package practice_interface;

public class OverrideB extends OverrideA {

	public static void main(String[] args) {
		OverrideB obj=new OverrideB();
		obj.test1();
		obj.test2();
		
		}
	public void test1() {
		System.out.println(500);
		}
	public void test2() {
		System.out.println(600);
	}

}
