package Collaction_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class program1 {
	
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(35);
		a1.add(457);
		a1.add(679);
		a1.add(68976);
		a1.add(6);
		
		Iterator p = a1.iterator();
		System.out.println(p.hasNext());
		System.out.println(p.next());
		System.out.println("=====while loop========");
		while(p.hasNext()) {
			
			//p.next();
			System.out.println(p.next());
			//System.out.println(p);
		}
	}

}
