package Collaction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Map;

class vikas {
	public static void main(String[] args) {
	Collection c1=new ArrayList();
		c1.add(34);
		c1.add(68);
		//c1.add(678.67);
		//c1.add("mohan");
		c1.add(68);
		c1.add(129);
		c1.add(200);
		
		System.out.println(c1.size());
		System.out.println(c1.isEmpty());
	
		for(Object x:c1) {
			if((Integer)x%2==0)
			System.out.println(x);
			
			
		}


}
}