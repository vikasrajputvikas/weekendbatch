package MultiThreading;

public class CarDriver {

	public static void main(String[] args) {
	
		Car c1=new Car("maruti800",25180,"black");
		Car c2=new Car("audi",25697,"white");
		Car c3=new Car("bmw",532147,"yellow");
		c3.setPriority(10);
		c1.start();
		c2.start();
		c3.start();
		
	}

}
