package java_dsa.basic.recursion;

public class CountNumberOfZero {

	public static void main(String[] args) {
		int count = count(120000506,0);
		System.out.println(count);
	}
	
	public static int count(int n,int count) {
		if(n==0)
			return count;
		
		int digit = n % 10;
		if(digit==0)
			count++;
		return count(n / 10,count);
	}

}
