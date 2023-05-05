package java_dsa.basic.array_arraylist;

import java.util.Arrays;

public class Arrays1 {

	public static String toString(int[] n) {
		int maxLength = n.length - 1;
		if (maxLength == -1)
			return "[]";
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0;; i++) {
			builder.append(n[i]);
			if (maxLength == i)
				return builder.append("]").toString();
			builder.append(",");
		}

	}

	public static void main(String[] args) {
		int[] a = {2,4,6,8,9,2,4};
		System.out.println(toString(a));

	}

}
