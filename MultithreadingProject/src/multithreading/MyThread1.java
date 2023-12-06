package multithreading;

public class MyThread1 {

	public static void main(String[] args) {
		Thread t = new Thread("My First Thread");
		t.start();
		String str = t.getName();
		System.out.println(str);
		Thread m = new Thread("MY Second Thread");
		m.start();
		str = m.getName();
		System.out.println(str);
	
	}

}
