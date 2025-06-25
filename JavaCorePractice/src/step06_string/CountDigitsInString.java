package step06_string;

public class CountDigitsInString {

	public static void main(String[] args) {

		String input = "Ramdas25Tejam2025";
		CountDigitsInString.getDigitsCount(input);
	}

	private static void getDigitsCount(String str) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		System.out.println("Count of digits: " + count);
	}
}