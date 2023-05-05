package java_dsa.basic.recursion;

public class CountLeetCode {

	public static void main(String[] args) {
		int count = count(14,0);
		System.out.println(count);

	}

	public static int count(int n,int count) {
		if(n==0)
			return count;
		if(n % 2 ==0) {
			n = n / 2;
			count++;
		}else {
			n = n -1;
			count++;
		}
		
		return count(n,count);
	}
}
