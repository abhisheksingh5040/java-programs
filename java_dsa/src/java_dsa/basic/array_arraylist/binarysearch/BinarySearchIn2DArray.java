package java_dsa.basic.array_arraylist.binarysearch;

import java.util.Arrays;

public class BinarySearchIn2DArray {

	public static void main(String[] args) {
		int[][] input = {
				{10,20,30,40},
				{15,25,35,45},
				{28,29,37,49},
				{33,34,38,50},
		};
		
		int target = 38;
		
		System.out.println(Arrays.toString(binarySearch(input, target)));
	}
	
	public static int[] binarySearch(int[][] input,int target) {
        int row  = 0;
        int col = input.length-1;
        
        while(row < input.length && col >=0 ) {
        	if(input[row][col] == target) {
        		return new int[] {row,col};
        	}else if(target > input[row][col]) {
        		row++;
        	}else {
        		col--;
        	}
        }
		return new int[] {-1,-1};
	}
}
