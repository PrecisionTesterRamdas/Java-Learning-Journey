package step06_string;

public class CountSpecialCharacters {

	public static void main(String[] args) {

		String input = "Ram@2025# Tejam$$*& ";
		CountSpecialCharacters.countSpecialChars(input);
	}

	private static void countSpecialChars(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!(Character.isLetterOrDigit(ch) || Character.isWhitespace(ch))) {
				count++;
			}
		}
		System.out.println("Special character count: " + count);
	}
}
