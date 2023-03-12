package Collaction;

import java.util.ArrayList;
import java.util.Collection;

public class Equalsmethod {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		Collection c2=new ArrayList();
		c1.add(96);
		c1.add(78);
		c2.add(96);
		System.out.println(c1.equals(c2));
		c2.add(78);
		System.out.println(c1.equals(c2));
		
	
	}

}
