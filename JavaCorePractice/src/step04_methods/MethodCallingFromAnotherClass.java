package step04_methods;

public class MethodCallingFromAnotherClass {
	public static void main(String[] args) {
		Greetings obj = new Greetings();
		obj.greetingMethod();
	}
}

class Greetings {

	void greetingMethod() {
		System.out.println("Hello from class Greetings!");
	}
}