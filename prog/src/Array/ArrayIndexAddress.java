package Array;

public class ArrayIndexAddress {
	public static void main(String[] args) {
		int []x=new int[10];
		System.out.println(x);
		
		double  d[]=new double[10];
		System.out.println(d);
		
		String y[]=new String[5];
		System.out.println(y);
		
		
		ArrayIndexAddress m=new ArrayIndexAddress();
		System.out.println(m);
		System.out.println(x[4]);
		
	x[4]=25;

	System.out.println(x[4]);
		
		
		}

}
