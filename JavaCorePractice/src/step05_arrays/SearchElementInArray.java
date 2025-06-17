package step05_arrays;

public class SearchElementInArray {

	public static void main(String[] args) {

		int targetValue = 40;
		boolean isFound = false;
		int i;
		int[] numbers = { 10, 20, 30, 40, 50, 60 };
		for (i = 0; i < numbers.length; i++) {

			if (numbers[i] == targetValue) {
				isFound = true;
				break;
			}

		}
		if (isFound) {
			System.out.println("Target value is found at index " + i);
		} else {
			System.out.println("Target value is not present");
		}
	}
}