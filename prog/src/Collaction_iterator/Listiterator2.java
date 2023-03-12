package Collaction_iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator2 {
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(35);
		a1.add(457);
		a1.add(679);
		a1.add(68976);
		a1.add(6);
		ListIterator p = a1.listIterator();
	
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		
		System.out.println("=======prevoius=========");
		while(p.hasPrevious()) {
			System.out.println(p.previous());
		}
	}
}
