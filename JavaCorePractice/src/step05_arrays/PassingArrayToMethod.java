package step05_arrays;

public class PassingArrayToMethod {

	public static void main(String[] args) {
		int[] numbers = { 10, 23, 54, 20, 59, 100 };
		PassingArrayToMethod.printArray(numbers);
	}

	static void printArray(int[] inputArray) {

		for (int num : inputArray) {
			System.out.println(num);
		}
	}
}