package step06_string;

import java.util.Arrays;

public class AnagramsCheck {

	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";
		AnagramsCheck.isAnagrams(str1, str2);
	}

	private static void isAnagrams(String str1, String str2) {
		str1 = str1.trim().toLowerCase(); // trimming and lowercase
		str2 = str2.trim().toLowerCase(); // trimming and lowercase

		if (!(str1.isEmpty() && str2.isEmpty()) && (str1.length() == str2.length())) { // checking that strings are not
																						// empty and strings are of same
																						// length
			char[] arr1 = str1.toCharArray(); // converting string to char array
			char[] arr2 = str2.toCharArray(); // converting string to char array

			Arrays.sort(arr1); // sorting that char array
			Arrays.sort(arr2); // sorting that char array

			if (Arrays.equals(arr1, arr2)) { // here, this method will check if both arrays are equal or not
				System.out.println("Provided strings are Anagrams to each other");
			} else {
				System.out.println("Provided strings are NOT Anagrams to each other");
			}
		} else {
			System.out.println("Provided strings are NOT Anagrams to each other");
		}
	}
}