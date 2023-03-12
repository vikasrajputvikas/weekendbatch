package Array;

public class Cardriver {

	public static void main(String[] args) {
		Car[] c= new Car[10];
		Car c0=new Car("maruti",55622,"white");
		Car c1=new Car();
		Car c2=new Car("audi",556242,"black");
		Car c3=new Car();
		Fruit f0=new Fruit();
	
		c[0]=c0;
		c[1]=c1;
		c[2]=c2;
	
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
	Object[] obj=new Object[10];
	obj[0]=c1;
	obj[1]=f0;
	System.out.println(obj[0]);
	System.out.println(obj[1]);
		


	}

}
