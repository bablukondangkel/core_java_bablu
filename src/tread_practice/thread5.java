package tread_practice;

public class thread5 extends Thread{
	public void run() {
		String name=Thread.currentThread().getName();
		for(int i=1; i<=3; i++) {
			System.out.println(name);
		}
	}
	

}
