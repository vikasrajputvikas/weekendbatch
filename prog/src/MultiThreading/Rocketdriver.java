package MultiThreading;

public class Rocketdriver {

	public static void main(String[] args) {
	Rocket r1=new Rocket();
	Rocket r2=new Rocket();
	Rocket r3=new Rocket();
	
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	Thread t3=new Thread(r3);
	t1.setName("Appolo");
	t2.setName("chandryan");
	t3.setName("ayabhatt");

	
	t1.start();
	t2.start();
	t3.start();
	

	}

}
