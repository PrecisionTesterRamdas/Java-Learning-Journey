package step03_constructors;

public class StudentWithDefaultConstructor {

	String name;
	int rollNumber;

	StudentWithDefaultConstructor() {

	}

	void displayStudents() {
		System.out.println("Student Name: " + name);
		System.out.println("Student RollNumber: " + rollNumber);
	}

	public static void main(String args[]) {
		StudentWithDefaultConstructor student = new StudentWithDefaultConstructor();
		student.name = "Ramdas";
		student.rollNumber = 101;

		student.displayStudents();
	}
}