package MultiThreading;

public class Car extends Thread {


	String name;
	double price;
	String color;
	
	Car(){
		
	}
	
	Car(String name, double price,String color){
		
		this.name=name;
		this.price=price;
		this.color=color;
	}
	public void displayCar() {
		System.out.println("================");
		System.out.println("name of car is:"+name);
		System.out.println("car price is:"+price);
		System.out.println("color of car is:"+color);
	}
	
	public void run() {
		//System.out.println("run method implements");
		displayCar();
		
	}
	
}
