package step05_arrays;

public class CheckArraySortedInAscending {

	public static void isSorted(int[] arr) {

		boolean isSortedFlag = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isSortedFlag = false;
				break;
			}
		}
		if (isSortedFlag) {
			System.out.println("Sorted in Ascending order");
		} else {
			System.out.println("NOT sorted in Ascending order");
		}
	}

	public static void main(String[] args) {

		int[] numbersA1 = { 2, 5, 9, 12, 19 };
		int[] numbersA2 = { 3, 8, 6, 15, 4, 5 };

		CheckArraySortedInAscending.isSorted(numbersA1);
		CheckArraySortedInAscending.isSorted(numbersA2);
	}
}