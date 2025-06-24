package step06_string;

public class ReverseStringManual {

	public static void main(String[] args) {

		String name = "Ramdas Tejam";
		String reversedString = ReverseStringManual.reverseString(name);
		System.out.println(reversedString);
	}

	static String reverseString(String str) {
		String reversed = "";
		for (int i = str.length()-1; i >= 0; i--) {
			char ch = str.charAt(i);
			reversed = reversed + ch;
		}
		return reversed;
	}
}