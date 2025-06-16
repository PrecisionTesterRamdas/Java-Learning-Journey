package step05_arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {

		int numbers[] = { 2, 45, 65, 7, 98, 43 };
		int sum = 0;
		for (int getNumber : numbers) {

			sum = sum + getNumber;

		}
		System.out.println("Sum of Array elements is: " + sum);
	}
}