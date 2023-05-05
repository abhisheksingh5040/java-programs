package java_dsa.basic.sort.CyclicSortQuestions;

public class ReapeatedNumber {

	public static void main(String[] args) {
		int[] arr = {1,3,4,2,2};
		System.out.println(repeatedNumber(arr));
	}

	public static int repeatedNumber(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			if (arr[i] != i+1) {
				int correct = arr[i] - 1;
				if(arr[correct] != arr[i])
					swap(arr, i, correct);
				else
					return arr[i];
			}else
				i++;
		}	
		return -1;
	}

	public static void swap(int[] arr, int index, int correct) {
		int temp = arr[index];
		arr[index] = arr[correct];
		arr[correct] = temp;
	}

}
