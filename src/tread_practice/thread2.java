package tread_practice;

public class thread2 {

	public static void main(String[] args) {
		thread1 obj=new thread1();
		obj.start();
		for(int i=1;i<=5; i++) {
		System.out.println("Sonalika Karmakar");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		
	}

}
