package tread_practice;

public class thread1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5; i++) {
			System.out.println("Bablu Kondangkel");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
		}

	}


