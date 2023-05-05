package java_dsa.basic.recursion;

public class SumOfNumber {

	public static void main(String[] args) {
		int[] input = {10,20,30,40,50,60,70,80,90,100};
		int targetSum = 100;
		printCombination(input,targetSum,0,"");
	}

	public static void printCombination(int[] arr,int targetSum,int start,String output) {
		if(targetSum==0) {
			System.out.println(output);
			return ;
		}
		
		for (int i = start; i < arr.length; i++) {
			printCombination(arr, targetSum - arr[i] ,i+1, output + arr[i]+" ");
		}	}
}
