package step06_string;

public class CountUpperAndLowerCase {

	public static void main(String[] args) {
		String input = "Ramdas Tejam  ";
		CountUpperAndLowerCase.countUpAndLowCase(input);
	}

	private static void countUpAndLowCase(String str) {
		int lowerCaseCount = 0;
		int upperCaseCount = 0;
		str = str.trim();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				if (Character.isLowerCase(ch)) {
					lowerCaseCount++;
				} else if (Character.isUpperCase(ch)) {
					upperCaseCount++;
				}
			}
		}
		System.out.println("Count of lowercase letters: " + lowerCaseCount);
		System.out.println("Count of uppercase letters: " + upperCaseCount);
	}
}
