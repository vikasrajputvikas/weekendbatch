package Collaction;

import java.util.ArrayList;
import java.util.Collection;

public class collectionToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1=new ArrayList();
		System.out.println(c1.hashCode());
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);
		Object[] x = c1.toArray();
	
		int sum=0;
		for(int i=0;i<c1.size();i++) {
			
			System.out.println((Integer)x[i]+10);
		}

		

	}

}
