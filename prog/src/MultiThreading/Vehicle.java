package MultiThreading;

public class Vehicle extends Thread {
	public void run() {	System.out.println("Thread name is :"+Thread.currentThread().getName());
	System.out.println("Thread id is:"+Thread.currentThread().getId());
	
			System.out.println("run method start");
		System.out.println("inside run method");
		System.out.println("run method ends");
		System.out.println("=====================");
	}
	

}
