package step03_constructors;

public class StudentConstructorOverloading {

	String name;
	int rollNumber;

	StudentConstructorOverloading() {
		System.out.println("No-args constructor is called");
	}

	StudentConstructorOverloading(String stName) {
		name = stName;
		System.out.println("parameterized constructor is called - only Student name");
	}

	StudentConstructorOverloading(String stName, int stRollNumber) {
		name = stName;
		rollNumber = stRollNumber;
		System.out.println("parameterized constructor is called - Student name and rollNumber");
	}

	public static void main(String args[]) {
		StudentConstructorOverloading noArgsStudent = new StudentConstructorOverloading();
		StudentConstructorOverloading oneArgStudent = new StudentConstructorOverloading("Ramdas");
		StudentConstructorOverloading multiArgsStudent = new StudentConstructorOverloading("Sushant", 101);
	}

}