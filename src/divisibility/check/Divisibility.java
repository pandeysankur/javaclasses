package divisibility.check;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		String stringValue = sc.next();

		String lastValue = stringValue.substring(getLength(stringValue) - 2);
		int intNumber = getNumber(lastValue);

		if (intNumber % 2 == 0) {
			System.out.println("Divisible by Two");
		} else {
			System.out.println("Not Divisible by Two");
		}
		System.out.println(intNumber);

		sc.close();
	}

	public static int getNumber(String value) {
		return Integer.parseInt(value);

	}

	public static int getLength(String value) {
		return value.length();
	}
}
