package java_dsa.basic.sort;

import java.util.Arrays;

public class BubbleSortMethod2 {

	public static void main(String[] args) {
		int[] input = { 5, 4, 3, 2, 1 };
		for (int i = 0; i < input.length; i++) {
			boolean flag = false;
			for (int j = 0; j < input.length-1-i; j++) {
				if(input[j] > input[j+1]) {
					int temp = input[j];
					input[j]= input[j+1];
					input[j+1] = temp;
					flag = true;
				}
			}
			if(!flag) {
				break;
			}
		}
		System.out.println(Arrays.toString(input));
	}
}
