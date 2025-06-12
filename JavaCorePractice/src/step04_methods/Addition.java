package step04_methods;

public class Addition {
	
	static void addNumbers(int x, int y) {
		int z = x + y;
		System.out.println("Sum of " + x + " and " + y + " is: " + z);
	}

	public static void main(String[] args) {
		Addition.addNumbers(10, 20);
	}
}