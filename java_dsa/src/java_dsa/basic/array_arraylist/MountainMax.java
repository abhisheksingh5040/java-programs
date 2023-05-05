package java_dsa.basic.array_arraylist;

import java.util.Arrays;
import java.util.Iterator;

public class MountainMax {

	public static void main(String[] args) {
		
		int[][] arr = {
				{0,0,5},
				{0,3,0,2},
				{1,0,4,0,5}
		};
		
		int max= Integer.MIN_VALUE;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if(arr[row][col] > max)
					max = arr[row][col];
			}
		}
		
		for (int row = 0; row < arr.length; row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
		
		System.out.println(Arrays.deepToString(arr)+"="+max);

	}

}
