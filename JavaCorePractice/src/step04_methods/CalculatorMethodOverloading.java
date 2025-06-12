package step04_methods;

public class CalculatorMethodOverloading {

	void add(int a, int b) {
		int c = a + b;
		System.out.println("Addition of 2 integers is: " + c);
	}

	void add(double a, double b) {
		double c = a + b;
		System.out.println("Addition of 2 doubles is: " + c);
	}

	void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("Addition of 3 integers is: " + d);
	}

	public static void main(String[] args) {
		CalculatorMethodOverloading obj = new CalculatorMethodOverloading();
		obj.add(10, 20);
		obj.add(4.5, 5.5);
		obj.add(10, 20, 40);
	}
}