package java_dsa.basic.array_arraylist.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] input = { 9,8,7,6,5,4,3,2,1 };
		int target  = 9;
		int search = search(input,target);
		System.out.println(search!=-1?search:"Element not present");
	}

	public static int search(int[] input,int target) {
		int start = input[0];
		int end = input[input.length-1];
		int mid = start + (end-start)/2;
		boolean orderAgnostic = isOrderAgnostic(input);
		while(start <= end) {
			if(orderAgnostic) {
				if(input[mid]==target)
					return mid;
				else if(input[mid] > target) 
					end  = mid -1;
				else
					start = mid + 1;
				
				mid = start + (end-start)/2;
			}else if (!orderAgnostic){
				System.out.println(orderAgnostic);
				if(input[mid]==target)
					return mid;
				else if(input[mid] < target) 
					end  = mid + 1;
				else
					start = mid - 1;

				mid = start + (end-start)/2;
			}
		}
		
		return -1;

	}

	public static boolean isOrderAgnostic(int[] arr) {
		if (arr[0] < arr[arr.length - 1])
			return true;
		else
			return false;
	}
}
