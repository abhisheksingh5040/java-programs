package java_dsa.basic.recursion;

public class Sum1ToN {

	public static void main(String[] args) {
		int input = 2;
		System.out.println(sum(input));
	}

	private static int sum(int n) {
		if (n == 0 || n == 1)
			return 1;

		return n + sum(n - 1);
	}

}
