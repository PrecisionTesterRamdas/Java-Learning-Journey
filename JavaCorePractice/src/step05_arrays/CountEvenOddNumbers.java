package step05_arrays;

public class CountEvenOddNumbers {

	public static void main(String[] args) {

		int[] numbers = { 12, 7, 9, 4, 6, 13, 1, 0 };
		int evenCounter = 0;
		int oddCounter = 0;
		for (int num : numbers) {

			if (num % 2 == 0) {
				evenCounter++;
			} else {
				oddCounter++;
			}
		}
		System.out.println("Count of even numbers: " + evenCounter);
		System.out.println("Count of odd numbers: " + oddCounter);
	}

}