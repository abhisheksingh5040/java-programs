package java_dsa.basic.array_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class InputOfArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		Scanner sc= new Scanner(System.in);
		
		for (int row = 0; row < arr.length; row++) {
			//here row is 3 and column in 2
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(arr));

	}

}
