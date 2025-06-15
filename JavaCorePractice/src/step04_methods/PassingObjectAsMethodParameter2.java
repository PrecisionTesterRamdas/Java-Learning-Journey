package step04_methods;

public class PassingObjectAsMethodParameter2 {
	public static void main(String[] args) {
		Car newCar = new Car("Tata", "Nano", 150000);
		newCar.getCarDetails(newCar);
	}
}

class Car {

	String brand;
	String model;
	int price;

	Car(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	void getCarDetails(Car carObject) {

		System.out.println("Car Brand: " + this.brand);
		System.out.println("Car Model: " + this.model);
		System.out.println("Car Price: " + this.price);

	}
}