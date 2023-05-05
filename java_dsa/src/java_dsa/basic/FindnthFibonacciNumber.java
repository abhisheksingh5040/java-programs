package java_dsa.basic;

import java.util.Scanner;

public class FindnthFibonacciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int input = sc.nextInt();

		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 1; i <= input - 2; i++) {
			c = a + b;
			a = b;
			b = c;
		}

		System.out.println(c);

	}

}
