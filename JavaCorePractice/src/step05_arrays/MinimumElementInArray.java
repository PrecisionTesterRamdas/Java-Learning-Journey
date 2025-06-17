package step05_arrays;

public class MinimumElementInArray {

	public static void main(String[] args) {

		int min = Integer.MAX_VALUE;
		int[] numbers = { 3, 4, 54, 34, 2, 40 };

		for (int arrayNumber : numbers) {
			if (arrayNumber < min) {
				min = arrayNumber;
			}
		}
		System.out.println("Minimum number is: " + min);
	}
}