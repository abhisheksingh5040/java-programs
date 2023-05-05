package java_dsa.basic;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 31, 22, 56, 35, 25 };

		List<Integer> missingNumber = missingNumber(arr);
		System.out.println(missingNumber);
	}

	public static List<Integer> missingNumber(int[] arr) {
		int max = max(arr);
		int min = min(arr);
		List<Integer> list = new ArrayList<>();
		for (int i = min; i < max + 1; i++) {
			boolean check = check(arr, i);
			if (check)
				list.add(i);
		}
		return list;
	}

	public static boolean check(int[] arr, int i) {
		for (int j = 0; j < arr.length; j++) {
			if (i == arr[j])
				return false;
		}
		return true;

	}

	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

	public static int min(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		return min;
	}

}
