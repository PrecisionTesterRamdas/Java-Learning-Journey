package step06_string;

public class CheckPalindrome {

	public static void main(String[] args) {

		String testInput = "Madam";
		CheckPalindrome.isPalindrome(testInput);

	}

	private static void isPalindrome(String str) {
		String input = str.toLowerCase();
		String reversed = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			reversed = reversed + ch;
		}
		if (input.equals(reversed)) {
			System.out.println("String is a Palindrome");
		} else {
			System.out.println("String is NOT a Palindrome");
		}
	}
}