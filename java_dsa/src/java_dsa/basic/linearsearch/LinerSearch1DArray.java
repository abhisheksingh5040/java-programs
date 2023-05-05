package java_dsa.basic.linearsearch;

//count the value which will have even count in the given array
public class LinerSearch1DArray {

	public static void main(String[] args) {
		int[] input = {73,3454,8769,34,9865};
		System.out.println(count(input));
	}

	private static int count(int[] input) {
		int count = 0;
		for(int arr : input) {
			boolean evenCount = evenCount(arr);
			if(evenCount)
				count++;
		}
		return count;
	}

	private static boolean evenCount(int arr) {
		return ((int)Math.log10(arr)+1)%2==0;
	}
}
