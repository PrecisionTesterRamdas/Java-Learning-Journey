package step03_constructors;

import java.util.Scanner;

public class UserInputsToConstructor {

	String name;
	int rollNumber;

	UserInputsToConstructor(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	void displayStudent() {
		System.out.println("Student name: " + this.name);
		System.out.println("Student rollNumber: " + this.rollNumber);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student name: ");
		String stName = sc.nextLine();
		System.out.print("Enter student rollNumber: ");
		int stRollNumber = sc.nextInt();
		sc.close();
		UserInputsToConstructor student = new UserInputsToConstructor(stName, stRollNumber);
		student.displayStudent();

	}
}