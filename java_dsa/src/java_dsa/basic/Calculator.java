package java_dsa.basic;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		char operator = sc.next().trim().charAt(0);
		int b = sc.nextInt();
		if(operator=='+') {
			System.out.println(a+b);
		}else if(operator=='-') {
			System.out.println(a-b);
		}
		
	}
}
