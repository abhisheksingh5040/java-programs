package java_dsa.basic.sort;

import java.util.Arrays;

//Worst time compexity : O(N^2)
//Best time complexity : O(N)
//Works good when array is partially sorted
//So it is mostly used when array is partially sorted
public class InsertionSort {

	public static void main(String[] args) {
		int[] input = { 4, 5, 3, 2, 1, 8, 9 };
		System.out.println(Arrays.toString(insertionSort(input)));
	}

	// insertion sort
	public static int[] insertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
		return arr;
	}

	// to swap two number by their index
	public static int[] swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		return arr;
	}
}
