package step04_methods;

public class MethodCallingWithinClass {

	int square(int a) {

		int square = a * a;
		return square;
	}

	int sumOfSquare() {
		int b = square(5);
		int c = square(4);
		return b + c;
	}

	public static void main(String[] args) {
		MethodCallingWithinClass obj = new MethodCallingWithinClass();
		int sum = obj.sumOfSquare();
		System.out.println(sum);

	}
}