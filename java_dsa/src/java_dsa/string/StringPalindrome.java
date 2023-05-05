package java_dsa.string;

public class StringPalindrome {

	public static void main(String[] args) {
		String input = "Madam";
		System.out.println(checkPalindrome(input) ? "String is Palindrome" : "String is not a Palindrome");
	}

	public static boolean checkPalindrome(String input) {
		String value = input.toLowerCase();
		if (input == null || input.length() == 0) {
			return false;
		}
		for (int i = 0; i < value.length() / 2; i++) {
			if (value.charAt(i) == value.charAt(i) - 1 - i) {
				return false;
			}
		}
		return true;
	}

}
