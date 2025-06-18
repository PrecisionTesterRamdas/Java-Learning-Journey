package step05_arrays;

public class FindMinMaxInArray {

	public static void main(String[] args) {

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		int[] numbers = { 5, 45, 3, 14, 54, 21, 0, 100 };

		for (int num : numbers) {

			if (min > num) {
				min = num;
			} else if (max < num) {
				max = num;
			}
		}

		System.out.println("Maximum value: " + max);
		System.out.println("Minimum value: " + min);

	}
}