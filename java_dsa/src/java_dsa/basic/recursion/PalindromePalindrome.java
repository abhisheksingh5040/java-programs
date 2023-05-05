package java_dsa.basic.recursion;

import java.util.ArrayList;
import java.util.List;

//without recursion
public class PalindromePalindrome {

	static List<String> list = new ArrayList<>();

	public static void main(String[] args) {
		String input = "Malayalam";
		String str = input.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			List<Integer> indexs = findIndex(str, i + 1, i);
			for (Integer index : indexs) {
				String string = str.substring(i, index + 1);
				isPalindrome(string);
			}
		}
		System.out.println(list);
	}

	public static List<Integer> findIndex(String str, int index, int target) {
		List<Integer> listIndex = new ArrayList<>();
		for (int i = index; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(target))
				listIndex.add(i);
		}
		return listIndex;
	}

	private static void isPalindrome(String str) {
		boolean flag = true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i))
				flag = false;
		}
		if (flag)
			list.add(str);
	}

}
