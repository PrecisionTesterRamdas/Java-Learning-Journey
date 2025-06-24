package step06_string;

public class CountVowelsConsonants {

	public static void main(String[] args) {

		String str = "Hello World";
		CountVowelsConsonants.countVandC(str);
	}

	public static void countVandC(String string) {
		int vowelCount = 0;
		int consonantsCount = 0;
		string = string.toLowerCase();
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (Character.isLetter(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
				} else {
					consonantsCount++;
				}
			}
		}
		System.out.println("Vowel count: " + vowelCount);
		System.out.println("Consonants count: " + consonantsCount);
	}
}