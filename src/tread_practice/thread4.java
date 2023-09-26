package tread_practice;

public class thread4 {

	public static void main(String[] args) {//main thread
		thread3 r=new thread3();
		Thread t=new Thread(r);
		t.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
