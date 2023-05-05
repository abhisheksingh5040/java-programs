package java_dsa.basic.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//when we have some question in the range 1 to N then go with cyclic sort
public class CyclicSort {

	public static void main(String[] args) {
		int[] input = { 3, 2, 4, 1, 5 };
		System.out.println(Arrays.toString(cyclicSort(input)));

		int[] arr = { 1, 3, 0, 4 };
		missingNumber(arr);
		int[] arr1 = { 1, 3, 0, 4 ,6};
		disappearedNumber(arr1);
	}

	// question 1 : find the missing number from the given array
	public static void missingNumber(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i];
			if (arr[i] < arr.length)
				swap(arr, i, correct);
			i++;
		}

		int checkMissing = checkMissing(arr);
		System.out.println("Missing Number :" + checkMissing);
	}

	public static int checkMissing(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i)
				return i;
		}

		return arr.length;
	}

	// Find all the disappeared number in the array
	public static void disappearedNumber(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i];
			if (correct < arr.length)
				swap(arr, i, correct);
				i++;
		}

		List<Integer> disnum = new ArrayList<>();
		List<Integer> searchMissingNumber = searchMissingNumber(arr, disnum);
		System.out.println(searchMissingNumber);
	}

	public static List<Integer> searchMissingNumber(int[] arr, List<Integer> disnum) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i)
				disnum.add(i);
		}
		return disnum;
	}

	// ----------------------------------------------------

	public static int[] cyclicSort(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] != arr[correct])
				swap(arr, i, correct);
			i++;
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
