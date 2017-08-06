package thread_pool;

import java.util.ArrayDeque;

public class ThreadPool {
int totalThread;
	public ThreadPool(int totalThread) {
		this.totalThread = totalThread;
	}
	ArrayDeque taskQueue = new ArrayDeque();
	public void addTask(Task task) {
		// TODO Auto-generated method stub
		taskQueue.add(task);
	}
	public void start() {
		// TODO Auto-generated method stub
		
	}
	
}
