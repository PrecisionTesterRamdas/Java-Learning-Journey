package step04_methods;

public class PassingObjectAsMethodParameter {

	double radius;

	PassingObjectAsMethodParameter(double radius) {
		this.radius = radius;
	}

	double printArea(PassingObjectAsMethodParameter c) {

		double area = 3.14 * Math.pow(c.radius, 2);
		return area;
	}

	public static void main(String[] args) {
		PassingObjectAsMethodParameter c = new PassingObjectAsMethodParameter(5);
		double areaOfCircle = c.printArea(c);
		System.out.println("Area of Circle: " + areaOfCircle);
	}
}