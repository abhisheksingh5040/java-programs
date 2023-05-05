package java_dsa.basic.recursion;

public class ReverseANumber {

	public static void main(String[] args) {
		
		int reverseNumber = reverseNumber(13231,0);
		System.out.println(reverseNumber==13231 ? "Palindrome" : "Not a Palindrome");

	}
	
	public static int reverseNumber(int n,int sum) {
		if (n == 0)
			return sum;
		int digit = n % 10;
		sum = sum * 10 + digit;
		return reverseNumber( n / 10,sum) ;
	}

}
