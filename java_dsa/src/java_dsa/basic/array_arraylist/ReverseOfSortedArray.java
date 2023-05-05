package java_dsa.basic.array_arraylist;

import java.util.Arrays;

public class ReverseOfSortedArray {

	public static void main(String[] args) {
		int[] arr = {1,3,4,5,6,7,8,9};
		
		for (int i = 0; i < arr.length/2; i++) {
			reverse(arr,i,arr.length-1-i);
		}
		System.out.println(Arrays.toString(arr));

	}

	private static void reverse(int[] arr, int startIndex, int endIndex) {
		int temp = arr[startIndex];
		arr[startIndex] = arr[endIndex];
		arr[endIndex] = temp;
	}

}
