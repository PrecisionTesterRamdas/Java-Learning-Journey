package step05_arrays;

public class MaximumElementInArray {

	public static void main(String[] args) {

		int max = Integer.MIN_VALUE;
		int[] numbers = { 2, 4, 54, 34, 6, 40 };

		for (int maxNumber : numbers) {
			if (maxNumber > max) {
				max = maxNumber;
			}
		}
		System.out.println("Maximum number is: " + max);
	}
}