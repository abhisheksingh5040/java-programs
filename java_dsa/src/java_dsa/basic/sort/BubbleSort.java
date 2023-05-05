package java_dsa.basic.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] input = { 1, 5, 3, 2, 8 };

		for (int i = 0; i < input.length-1; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] > input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(input));
	}
}
