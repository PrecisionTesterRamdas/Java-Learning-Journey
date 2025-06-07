package step03_constructors;

public class ConstructorChaining {

	String name;
	int rollNumber;

	ConstructorChaining() {
		System.out.println("Non-parameterized constructor");
	}

	ConstructorChaining(String name) {
		this();
		this.name = name;
		System.out.println("Parameterized constructor");
	}

	public static void main(String args[]) {
		ConstructorChaining student = new ConstructorChaining("Dinesh");
	}
}