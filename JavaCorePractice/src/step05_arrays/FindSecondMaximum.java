package step05_arrays;

public class FindSecondMaximum {

	public static void main(String[] args) {

		int[] numbers = { 2, 4, 10, 32, 5, 54, 6, 45, 43, 43, 45, 100 };
		FindSecondMaximum.getSecondMaximum(numbers);
	}

	private static void getSecondMaximum(int[] arr) {

		int maximum = Integer.MIN_VALUE;
		int secondMaximum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > maximum) {
				secondMaximum = maximum;
				maximum = arr[i];
			} else if (arr[i] > secondMaximum && arr[i] != maximum) {
				secondMaximum = arr[i];
			}
		}
		System.out.println("Second maximum value is " + secondMaximum);
	}
}
