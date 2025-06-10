package step03_constructors;

public class CopyConstructor {

	String name;
	int rollNumber;

	CopyConstructor(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	CopyConstructor(CopyConstructor cc) {
		this.name = cc.name;
		this.rollNumber = cc.rollNumber;
		System.out.println("Called copyConstructor");
	}

	void displayStudent() {
		System.out.println(name + " " + rollNumber);
	}

	public static void main(String[] args) {
		CopyConstructor student = new CopyConstructor("Ramdas", 101);
		CopyConstructor copiedStudent = new CopyConstructor(student);

		student.displayStudent();
		copiedStudent.displayStudent();
	}

}