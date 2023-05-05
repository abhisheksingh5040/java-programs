package java_dsa.basic.array_arraylist.binarysearch;

import java.util.Arrays;

public class BinarySearchInSorted2DArray {

	public static void main(String[] args) {
		int[][] input = {
				{10,20,30,40},
				{50,60,70,80},
				{90,100,110,120},
				{130,140,150,160},
		};
		
		int target = 90;
		
		System.out.println(Arrays.toString(sortedSearch(input, target)));
	}
	
	public static int[] sortedSearch(int[][] input,int target) {
		int row = 0;
		int col = input.length -1 ;
		
		while(row < input.length-1 && col >= 0) {
			if(input[row][col]==target) {
				return new int[] {row,col};
			}else if(target > input[row][col]) {
				row++;
			}else {
				row--;
			}
		}
		return new int[] {-1,-1};
	}

}
