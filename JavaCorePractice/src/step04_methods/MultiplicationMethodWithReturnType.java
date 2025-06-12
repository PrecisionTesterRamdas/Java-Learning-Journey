package step04_methods;

public class MultiplicationMethodWithReturnType {

	int multiplyNumbers(int x, int y) {
		int z = x * y;
		return z;
	}

	public static void main(String[] args) {
		MultiplicationMethodWithReturnType obj = new MultiplicationMethodWithReturnType();
		int a = obj.multiplyNumbers(10, 20);
		System.out.println("Multiplication result: " + a);
	}
}