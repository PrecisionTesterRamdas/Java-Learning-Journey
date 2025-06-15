package step04_methods;

public class MethodReturningObject {
	public static void main(String[] args) {
		Rectangle obj = new Rectangle(); // Creating object to call method
		Rectangle rect = obj.createRectangle(10, 5); // Getting returned object

		System.out.println("Length: " + rect.lengh);
		System.out.println("Width: " + rect.width);
		System.out.println("Area of Rectangle is: " + (rect.lengh * rect.width));

	}
}

class Rectangle {
	int lengh;
	int width;

	// Method that returns rectangle object
	Rectangle createRectangle(int l, int w) {
		Rectangle r = new Rectangle();
		r.lengh = l;
		r.width = w;
		return r;
	}
}