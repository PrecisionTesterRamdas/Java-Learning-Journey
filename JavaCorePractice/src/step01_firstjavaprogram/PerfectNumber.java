package step01_firstjavaprogram;

import java.util.Scanner;

public class PerfectNumber {

	static int number;

	public static void isPerfectNumber(int num) {
		
		int sum = 0;
		for (int i = 1; i <= num/2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if(num == sum) {
			System.out.println("Number is perfect");
		}
		else {
			System.out.println("Number is not perfect");
		}
	}

	public static void main(String args[]) {

		System.out.print("Enter a positive number: ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		PerfectNumber.isPerfectNumber(number);
		
	}
}