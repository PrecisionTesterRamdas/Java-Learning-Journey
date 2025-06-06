package step03_constructors;

public class MultipleStudentsWithConstructor {

	String name;
	int rollNumber;

	MultipleStudentsWithConstructor(String stName, int stRollNumber) {
		name = stName;
		rollNumber = stRollNumber;
	}

	void displayStudent() {
		System.out.println("Student Name: " + name);
		System.out.println("Student RollNumber: " + rollNumber);
	}

	public static void main(String args[]) {
		MultipleStudentsWithConstructor student1 = new MultipleStudentsWithConstructor("Sushant", 101);
		MultipleStudentsWithConstructor student2 = new MultipleStudentsWithConstructor("Dinesh", 102);
		MultipleStudentsWithConstructor student3 = new MultipleStudentsWithConstructor("Ramdas", 103);

		student1.displayStudent();
		student2.displayStudent();
		student3.displayStudent();
	}
}