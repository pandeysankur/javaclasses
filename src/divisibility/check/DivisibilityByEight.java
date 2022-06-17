package divisibility.check;

import java.util.Scanner;

public class DivisibilityByEight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		String stringValue = sc.next();

		String lastThreeNumber = stringValue.substring(Divisibility.getLength(stringValue) - 3);
		int intValue = Divisibility.getNumber(lastThreeNumber);
		System.out.println("Last Three Number:" + lastThreeNumber);

		if (intValue % 8 == 0) {
			System.out.println("Divisible by Eight.");

		} else {
			System.out.println("Not Divisible by Eight.");
		}

		sc.close();
	}

}
