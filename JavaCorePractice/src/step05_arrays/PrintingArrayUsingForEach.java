package step05_arrays;

public class PrintingArrayUsingForEach {

	public static void main(String[] args) {

		String[] city = { "Mumbai", "Pune", "Kolhapur", "Nagpur", "Satara" };

		for (String cityName : city) {
			System.out.println(cityName);
		}
	}
}