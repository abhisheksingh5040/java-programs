package java_dsa.basic.recursion;

public class Print1to5 {

	public static void main(String[] args) {
		message(5);
	}

	private static void message(int n) {
		if (n == 0) {
			return;
		}
		message(n - 1);
		System.out.println(n);
	}

}
