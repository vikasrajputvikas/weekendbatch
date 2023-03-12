package Array;

public class Car {
  
	
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
	public String toString() {
		return "Name is :"+name+"Price is:"+price+"Color is:"+color;
	}

}
