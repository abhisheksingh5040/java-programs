package java_dsa.basic.recursion;

public class Fibonacci {

	public static void main(String[] args) {
		int input  = 5;
		System.out.println(fibo(input));
	}

	private static int fibo(int n) {
		
		//base condition
		if(n < 2)
			return n;
		
		return fibo(n-1) + fibo(n-2);
	}

}
