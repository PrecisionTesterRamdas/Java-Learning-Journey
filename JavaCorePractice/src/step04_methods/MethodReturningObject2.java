package step04_methods;

class Rectangle2 {
	float length;
	float width;

	Rectangle2 getDoubleSizedRectangle(float l, float w) {
		Rectangle2 rect = new Rectangle2();
		rect.length = l * 2;
		rect.width = w * 2;

		return rect;
	}

	double areaOfRectangle(Rectangle2 rect) {

		double areaOfRect = rect.length * rect.width;
		return areaOfRect;
	}
}

public class MethodReturningObject2 {
	public static void main(String[] args) {
		Rectangle2 newRect = new Rectangle2();
		Rectangle2 doubleRect = newRect.getDoubleSizedRectangle(5f, 10f);

		System.out.println("doubleRect Length: " + doubleRect.length);
		System.out.println("doubleRect Width: " + doubleRect.width);
		System.out.println(doubleRect.areaOfRectangle(doubleRect));
	}
}