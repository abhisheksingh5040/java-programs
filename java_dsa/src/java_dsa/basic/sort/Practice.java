package java_dsa.basic.sort;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {

		int[] input = {1,8,3,2,9,6};
		System.out.println("Bubble Sort  :"+Arrays.toString(bubbleSort(input)));
		System.out.println("Insertion Sort  :"+Arrays.toString(insertionSort(input)));
		System.out.println("Selection Sort  :"+Arrays.toString(selectionSort(input)));
	}

	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		return arr;
	}

	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int max = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (max > arr[j]) {
					max = j;
				}
			}
			swap(arr, i, max);
		}
		return arr;
	}

	public static int[] insertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				}
			}
		}
		return arr;
	}
	
	public static int[] swap(int[] arr, int index1, int index2) {

		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		return arr;
	}

}
