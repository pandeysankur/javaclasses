package divisibility.check;

import java.util.Scanner;

public class DivisibilityByEleven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter s Number:");
		String stringValue = sc.next();

		String firstSixNumber = stringValue.substring(0,6);
		System.out.println("First Six Number:" + firstSixNumber);

		int firstNumber = Divisibility.getNumber(stringValue.substring(0, 1));
		int secondNumber = Divisibility.getNumber(stringValue.substring(1, 2));
		int thirdNumber = Divisibility.getNumber(stringValue.substring(2, 3));
		int fourthNumber = Divisibility.getNumber(stringValue.substring(3, 4));
		int fifthNumber = Divisibility.getNumber(stringValue.substring(4, 5));
		int sixthNumber = Divisibility.getNumber(stringValue.substring(5, 6));

		int sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber + sixthNumber;
		System.out.println("Total Number of Sum:" + sum);

		if (sum % 11 == 0) {
			System.out.println("Divisible by 11");
		} else {
			System.out.println("Not Divisible by 11");
		}
		sc.close();
	}

}
