package java_dsa.basic.linearsearch;

public class FindingMaximumInSetOf2dArray {

	public static void main(String[] args) {
		int[][] input = { 
				{ 2, 4, 5, 8 }, 
				{ 67, 45, 890, 7 },
				{ 56, 78, 98, 45 } 
		};
		
		System.out.println(maxNumber(input));
	}
	
	public static int maxNumber(int[][] input) {
		int max= 0;
		int index = -1;
		for (int row=0;row<input.length;row++) {
			for (int col=0;col<input[row].length;col++) {
				int value = sumOf1DArray(input[row]);
				if(max < value) {
					max= value;
					index = row;
				}
			}
		}
		return index;
	}

	public static int sumOf1DArray(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum;
	}
}
