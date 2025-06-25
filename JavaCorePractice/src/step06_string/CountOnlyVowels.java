package step06_string;

public class CountOnlyVowels {

	public static void main(String[] args) {

		String name = "Ramdas Tejam";
		CountOnlyVowels.getVowelsCount(name);
	}

	private static void getVowelsCount(String str) {
		int count = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					count++;
				}
			}
		}
		System.out.println("Vowels count: " + count);
	}
}