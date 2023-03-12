package Xyzzzzzzzzzzzzzz;



public class vvvvvvvvvvv {

	public static void main(String[] args) {
		int a=15;
		int b=0;
		int[] c= {10,20,25};
	 
try {
	System.out.println(a/b);

	
}
finally{
	System.out.println("final block  ust executed ");
	
}
System.out.println("program ends");
try {
	System.out.println(c[6]);
}catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("array index out of bound exception");
System.out.println(e);
System.out.println("===================");
e.printStackTrace();
System.out.println("==============================");

}

	}

}
