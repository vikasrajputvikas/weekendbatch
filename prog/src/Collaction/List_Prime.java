package Collaction;

import java.util.ArrayList;
import java.util.List;

public class List_Prime {

	public static void main(String[] args) {

	List<Integer> l1=new <Integer>ArrayList();
		l1.add(12);
		l1.add(17);
		l1.add(34);
		l1.add(57);
		l1.add(97);
		l1.add(119);
		l1.add(71);
				List l2=new ArrayList();
		for(int i=0;i<l1.size();i++) {
			
			if(checkprime((Integer)l1.get(i))) {		
				l2.add(l1.get(i));
				
			}
		}
		System.out.println("Prime number :"+l2);
	}

	public static boolean checkprime(int n) {
	int count=0;
	for(int i=2;i<=n/2;i++) {
		
	if(n%i==0) {
		count++;
	}
	}if(count==0) {
		return true;
	}else
		return false;
		
	}

}
