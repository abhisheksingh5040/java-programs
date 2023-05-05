package java_dsa.basic.sort.CyclicSortQuestions;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumber {

	public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1};
		
		System.out.println(disappearedNumber(arr));
	}
	
	public static List<Integer> disappearedNumber(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			int correct = arr[i] - 1;
			if(arr[correct] != arr[i])
				swap(arr,i,correct);
			else
				i++;
		}
		return check(arr);
	}
	
	private static List<Integer> check(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if(i+1 != arr[i])
				list.add(i+1);
		}
		return list;
	}

	public static void swap(int[] arr, int index, int correct) {
		int temp = arr[index];
		arr[index] = arr[correct];
		arr[correct] = temp;
	}

}
