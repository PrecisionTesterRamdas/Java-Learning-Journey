package step05_arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {

		int[] numbers = { 0, 1, 0, 3, 0, 5, 0, 2 };
		MoveZerosToEnd.moveZeroes(numbers);

	}

	public static void moveZeroes(int[] arr) {

		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;

				index++;
			}
		}

		for (int num : arr) {
			System.out.println(num);
		}
	}
}