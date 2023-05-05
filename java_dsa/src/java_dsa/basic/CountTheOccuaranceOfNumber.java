package java_dsa.basic;

import java.util.Scanner;

public class CountTheOccuaranceOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		int n = 1385757879;
		int count = 0;
		while (n != 0) {
			int d = n % 10;
			if (d == input) {
				count++;
			}
			n = n / 10;
		}
		System.out.println(count);

	}

}
