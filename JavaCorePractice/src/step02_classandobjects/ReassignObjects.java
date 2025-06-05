package step02_classandobjects;

public class ReassignObjects {
	String name;
	int rollNumber;

	public static void main(String args[]) {
		ReassignObjects obj1 = new ReassignObjects();
		obj1.name = "Ramdas";
		obj1.rollNumber = 101;
		System.out.println("Initial Name: " + obj1.name);
		System.out.println("Initial RollNumber: " + obj1.rollNumber);

		obj1.name = "Sushant";
		obj1.rollNumber = 102;
		System.out.println("Updated Name: " + obj1.name);
		System.out.println("Updated RollNumber: " + obj1.rollNumber);

	}

}