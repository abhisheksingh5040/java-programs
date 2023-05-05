package java_dsa.basic.sort.CyclicSortQuestions;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 1 };
		System.out.println(missingNumber(arr));
	}
	
	public static int missingNumber(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			int correct = arr[i] -1;
			if(correct < arr.length && arr[i] != arr[correct])
				swap(arr,i,correct);
			else
				i++;
		}
		System.out.println(Arrays.toString(arr));
		return check(arr);
	}
	
	public static int check(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(i+1 != arr[i])
				return i + 1;
		}
		return arr.length +1;
	}
	public static void swap(int[] arr, int index, int correct) {
		int temp = arr[index];
		arr[index] = arr[correct];
		arr[correct] = temp;
	}

}
