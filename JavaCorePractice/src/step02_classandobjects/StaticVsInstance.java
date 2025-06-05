package step02_classandobjects;

public class StaticVsInstance {
	static String collegeName = "NCL Jr. College";
	String studentName;
	int rollNumber;

	public static void main(String args[]) {
		StaticVsInstance obj1 = new StaticVsInstance();
		obj1.studentName = "Ramdas";
		obj1.rollNumber = 101;
		System.out.println(StaticVsInstance.collegeName = "ABC College"); // Here changing college name, and it's
																			// getting reflected to other object as
																			// well.
		System.out.println(obj1.studentName);
		System.out.println(obj1.rollNumber);

		StaticVsInstance obj2 = new StaticVsInstance();
		obj2.studentName = "Dinesh";
		obj2.rollNumber = 102;
		System.out.println(StaticVsInstance.collegeName);
		System.out.println(obj2.studentName);
		System.out.println(obj2.rollNumber);
	}

}