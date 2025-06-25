package step06_string;

public class CountWordsInString {

	public static void main(String[] args) {

		String Sentence = " My   name is Ramdas  Tejam";
		CountWordsInString.getCountOfWords(Sentence);

	}

	private static void getCountOfWords(String str) {
		str = str.trim();
		String[] words = str.split("\\s+"); // \\s+ --> this means one or more blank spaces
		System.out.println("Words count is: " + words.length);

	}
}
