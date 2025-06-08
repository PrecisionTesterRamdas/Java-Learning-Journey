package step03_constructors;

public class ThreeConstructorChaining {

	String name;
	int rollNumber;

	ThreeConstructorChaining() {
		System.out.println("This is non-parameterized constructor - 1st Call");

	}

	ThreeConstructorChaining(String name) {
		this();
		this.name = name;
		System.out.println("This is one parameter constructor - 2nd Call");
	}

	ThreeConstructorChaining(String name, int rollNumber) {
		this(name);
		this.rollNumber = rollNumber;
		System.out.println("This is two paramter constructor - 3rd Call ");
	}

	void displayStudent() {
		System.out.println("Student name: " + name);
		System.out.println("Student rollNumber: " + rollNumber);
	}

	public static void main(String[] args) {
		ThreeConstructorChaining student = new ThreeConstructorChaining("Randas", 101);
		student.displayStudent();
	}

}