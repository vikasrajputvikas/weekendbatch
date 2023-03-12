package MultiThreading;

public class Rocket implements Runnable{
	public void run() {
		
		System.out.println("=================");
		System.out.println("run method is implemented");
		System.out.println("Thread name is:"+Thread.currentThread().getName());
		System.out.println("thread priority is:"+Thread.currentThread().getPriority());
		System.out.println("current thread is terminated");
		
	}

}
