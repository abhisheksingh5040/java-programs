package java_dsa.basic.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] input = { 1, 5, 3, 2, 8 };

		for (int i = 0; i < input.length; i++) {
			int max = i;
			for (int j = i + 1; j < input.length; j++) {
				if (input[max] > input[j]) {
					max = j;
				}
			}
			int temp = input[i];
			input[i] = input[max];
			input[max] = temp;
		}
		System.out.println(Arrays.toString(input));
	}

}
