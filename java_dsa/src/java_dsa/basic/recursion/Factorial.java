package java_dsa.basic.recursion;

public class Factorial {

	public static void main(String[] args) {
		int input  = 5;
		System.out.println(fact(input));
	}

	private static int fact(int n) {
		
		if(n==1|| n==0) 
			return 1;

		return n * fact(n-1);
	}

}
