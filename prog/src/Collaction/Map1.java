package Collaction;

import java.util.*;


public class Map1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer ,String> m1	=new TreeMap<Integer ,String> ();
		m1.put(12, "mohan");
		m1.put(18, "jack");
		m1.put(16, "johan");
		m1.put(98, "mohan");
		m1.put(12, "jethalan");
		System.out.println("=========key access==========");
for(Integer j:m1.keySet()){
	System.out.println(j);
	
}
System.out.println("=========value access==========");

for(String j:m1.values()){
	System.out.println(j);
	
}

System.out.println("=========key value access==========");
for(Map.Entry<Integer,String > x:m1.entrySet()) {
	System.out.println(x.getKey()+" : "+x.getValue());
}



	}

}
