package Collaction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
	
		
		//Collection c1=new ArrayList();
		List<Integer> l1=new <Integer>ArrayList();
	l1.add(12);
	l1.add(42);
	l1.add(34);
    l1.add(76);
   
    l1.add(66);
    System.out.println(l1);
    System.out.println("===for each loop=====");
for(Object a:l1) {
	System.out.println(a);
}
System.out.println("====for loop++===");
for(int i=0;i<l1.size();i++) {
	System.out.println(l1.get(i));
	
}
	
	


	}

}
