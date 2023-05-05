package java_dsa.string;

public class ReverseString {

	public static void main(String[] args) {
		String input  = "Abhishek";
        System.out.println(reverseString(input));
	}
	/*
	 * Suppose If we will use String rev then for nth iteration the new memory will get created so the time complexity will be 
	 * 1+ 2+3+ ......n 
	 * N * (N+1)/2 = O(N^2)-> so go with this approach
	 */
	public static String reverseString(String input) {
		StringBuilder builder = new StringBuilder();
		for (int i = input.length()-1; i >= 0; i--) {
			builder.append(input.charAt(i));
		}
		 
		return builder.toString();
	}

}
