package tread_practice;

public class thread6 {

	public static void main(String[] args) {
		thread5 t1=new thread5();
		thread5 t2=new thread5();
		thread5 t3=new thread5();
		
		t1.setName("Bablu");
		t2.setName("Gill");
		t3.setName("Sen");
		
		t1.start();
		t2.suspend();
		t2.resume();
		t2.suspend();
		t3.start();
		
	}

}
