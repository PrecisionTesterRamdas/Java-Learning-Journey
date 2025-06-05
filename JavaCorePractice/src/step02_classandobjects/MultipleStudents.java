package step02_classandobjects;

public class MultipleStudents {

	String name;
	int rollNumber;

	public static void main(String args[]) {
		MultipleStudents student1 = new MultipleStudents();
		student1.name = "Ramdas";
		student1.rollNumber = 101;
		MultipleStudents student2 = new MultipleStudents();
		student2.name = "Sushant";
		student2.rollNumber = 102;
		MultipleStudents student3 = new MultipleStudents();
		student3.name = "Dinesh";
		student3.rollNumber = 103;

		System.out.println(student1.name);
		System.out.println(student1.rollNumber);
		System.out.println(student2.name);
		System.out.println(student2.rollNumber);
		System.out.println(student3.name);
		System.out.println(student3.rollNumber);
	}
}