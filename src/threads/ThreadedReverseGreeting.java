package threads;

public class ThreadedReverseGreeting {
	public static void main(String[] args) {
		ThreadedReverseGreeting t = new ThreadedReverseGreeting();
		t.threadMaker(50);
	}

	public void threadMaker(int num) {
		String s = Integer.toString(num);
		Thread x = new Thread(() -> {
			System.out.println("Hello from thread number " + s + "!");
		});
		x.start();
		try {
			x.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		num--;
		if (num > -1) {
			threadMaker(num);
		}
	}
	// Write a program that creates a thread (Thread 1) that creates another
	// thread (Thread 2);
	// Thread 2 creates Thread 3; and so on, up to Thread 50.
	// Each thread should print "Hello from Thread <num>!",
	// but you should structure your program such that the threads print their
	// greetings in reverse order.
}
