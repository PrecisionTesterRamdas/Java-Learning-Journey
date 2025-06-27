package step06_string;

public class ReplaceDupCharAsterick {

	public static void main(String[] args) {

		StringBuilder input = new StringBuilder("Programming");
		ReplaceDupCharAsterick.replaceWithAsterisk(input);
	}

	private static void replaceWithAsterisk(StringBuilder input) {
		char asterisk = '*';
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					input.setCharAt(j, asterisk);
				}
			}
		}
		System.out.println(input);
	}
}