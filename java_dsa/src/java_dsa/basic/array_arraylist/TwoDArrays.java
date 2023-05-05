package java_dsa.basic.array_arraylist;

import java.util.Arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		// this is also fine because adding column is not mandatory
		int[][] input1 = new int[5][];
		
		//case 2:
		int[][] input2 = {
				{2,4,6,8,9},	
				{1,2,3},
				{2,3,5,8}
		};
		
		System.out.println(input2.length);//it will print number of rows
		System.out.println(Arrays.deepToString(input1));
		System.out.println(Arrays.deepToString(input2));
		
		System.out.println(Arrays.toString(input2[1]));
	}
}
