package step03_constructors;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Student extends Person {
	int rollNumber;

	Student(String name, int age, int rollNumber) {
		super(name, age);
		this.rollNumber = rollNumber;
	}

	void displayStudent() {
		System.out.println("Student Name: " + name + " | " + "Age: " + age + " | " + "RollNumber: " + rollNumber);
	}

}

public class ConstructorInInheritance {

	public static void main(String[] args) {
		Student child = new Student("Ramdas", 25, 101);
		child.displayStudent();
	}
}