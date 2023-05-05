package java_dsa.basic.linearsearch;

import java.util.Arrays;

public class LinearSearchIn2DArray {

	public static void main(String[] args) {
		int[][] input = {
				{2,4,5,8},
				{67,45,89,78},
				{56,78,98,45}
		};
		
		int target = 45;
		System.out.println(Arrays.toString(search(input, target)));
	}
	
	//search for an number in a given array
	public static int[] search(int[][] input,int target) {
		for (int row = 0; row < input.length; row++) {
			for (int col = 0; col < input[row].length; col++) {
				if(input[row][col]==target) {
					return new int[] {row,col};
				}
			}
		}
		return new int[]{-1,-1};
	}

}
