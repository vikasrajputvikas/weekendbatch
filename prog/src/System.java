

public class System {
	static int sum=0;
   
	public static void main(String[] args){
		
	test(1);	
	
	
}
	public static void test(int n) {
		
		if( n<=5) {
			sum=sum+n;
			test(n+1);
		}else {
		
		}
		
	}
}
