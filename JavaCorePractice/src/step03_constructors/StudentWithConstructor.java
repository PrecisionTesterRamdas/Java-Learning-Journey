package step03_constructors;

public class StudentWithConstructor {

	String name;
	int rollNumber;

	StudentWithConstructor(String stName, int stRollNumber) {
		name = stName;
		rollNumber = stRollNumber;
	}

	void displayStudent() {
		System.out.println("Student Name: "+name);
		System.out.println("Student RollNumber: "+rollNumber);
	}

	public static void main(String args[]) {
		StudentWithConstructor student = new StudentWithConstructor("Ramdas", 101);
		student.displayStudent();
	}
}