package tread_practice;

public class thread3 implements Runnable{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("my child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
