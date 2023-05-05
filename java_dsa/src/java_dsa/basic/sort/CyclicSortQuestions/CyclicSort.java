package java_dsa.basic.sort.CyclicSortQuestions;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		
		System.out.println(Arrays.toString(cyclicSort(arr)));
	}

	public static int[] cyclicSort(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[correct] != arr[i])
				swap(arr, i, correct);
			else
				i++;
		}
		
		return arr;
	}

	public static void swap(int[] arr, int index, int correct) {
		int temp = arr[index];
		arr[index] = arr[correct];
		arr[correct] = temp;
	}

}
