package step06_string;

public class ReverseEachWord {

	public static void main(String[] args) {

		String input = "Java Programming is fun";
		ReverseEachWord.reverseEachWord(input);
	}

	private static void reverseEachWord(String input) {
		input = input.trim(); // trimming first to avoid beginning/end space
		String[] words = input.split(" "); // getting all words stored in String array by spliting sentence using space
		for (String str : words) { // traversing to each word using for-each loop
			for (int i = str.length() - 1; i >= 0; i--) { // traversing backward to reverse each word
				System.out.print(str.charAt(i)); // printing each char to get complete reversed word
			}
			System.out.print(" "); // adding space after every word
		}
	}
}