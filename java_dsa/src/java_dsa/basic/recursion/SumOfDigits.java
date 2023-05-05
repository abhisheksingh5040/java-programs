package java_dsa.basic.recursion;

//sum of digit of all the number	
public class SumOfDigits {

	public static void main(String[] args) {
		int ans = sumOfDigit(1345);
		System.out.println(ans);
	}
	
	public static int sumOfDigit(int n) {
		if(n==0)
			return 0;
		
		return n % 10 + sumOfDigit(n / 10);
	}

}
