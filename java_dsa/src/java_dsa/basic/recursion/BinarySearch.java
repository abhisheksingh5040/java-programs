package java_dsa.basic.recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int[] input = {1,3,5,7,9,45};
		int target = 3;
		int binarySearch = binarySearch(input,target,0,input.length-1);
		System.out.println(binarySearch);
	}

	private static int binarySearch(int[] arr,int target,int start, int end) {
		
		int mid = start + (end - start) / 2;
		
		if(arr[mid]==target)
			return mid;
		else if(arr[mid] > target) 
			return binarySearch(arr, target, start, mid-1);
		else
			return binarySearch(arr, target, mid+1, end);
	}

}
