package CollactionSet;

import java.util.LinkedList;
import java.util.Queue;

public class hashset {

	public static void main(String[] args) {
	
		Queue hs1=new LinkedList();
		
		hs1.add(12);
		hs1.add("kjjj");
		hs1.add(12);
		hs1.add(546);
		hs1.add(57);
		
	System.out.println(hs1);

	hs1.remove();

	System.out.println(hs1);
	for(Object h:hs1) {
		System.out.println(h);
	}

	}

}
