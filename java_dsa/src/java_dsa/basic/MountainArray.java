package java_dsa.basic;

public class MountainArray {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 8, 17, 5, 1 };
		System.out.println(peek(arr));

	}

	public static String peek(int[] arr) {
		int peekIndex = peekIndex(arr);
		
		if (arr.length < 4)
			return "Not a Mountain array";

		for (int i = 0; i < arr.length; i++) {
			if (i < peekIndex)
				if (!(arr[i] < arr[i + 1]))
					return "Not a Mountain array";

			if (i > peekIndex)
				if (!(arr[i-1] > arr[i]))
					return "Not a Mountain array";
		}

		return "Given array is a Mountain array";
	}

	public static int peekIndex(int[] arr) {
		int index = 0;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
				if(max < arr[i]) {
					max = arr[i];
					index = i;
			}
		}
		return index;

	}

}
