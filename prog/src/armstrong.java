import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int x=countDigit(n);
		

	}

	public static int countDigit(int n ) {
		int count=0;
		while(n>0) {
		int rem=n%10;
		count=count+1;
		n=n/10;
	
		}
		return count;
	

}
}