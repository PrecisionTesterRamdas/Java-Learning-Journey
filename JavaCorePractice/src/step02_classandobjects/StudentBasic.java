package step02_classandobjects;

public class StudentBasic {

	String name;
	int rollNumber;

	public static void main(String args[]) {
		StudentBasic sb = new StudentBasic();
		sb.name = "Ramdas";
		sb.rollNumber = 101;

		System.out.println(sb.name);
		System.out.println(sb.rollNumber);
	}
}