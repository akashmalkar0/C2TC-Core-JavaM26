package multithreading;

public class TestMultithreading implements Runnable {
	public void run() {
		System.out.println("Thread is Running......");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMultithreading m1 =new TestMultithreading();
		Thread t1 =new Thread(m1);
		t1.start();
	}

}
