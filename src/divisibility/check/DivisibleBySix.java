package divisibility.check;

import java.util.Scanner;

public class DivisibleBySix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		String stringValue = sc.next();

		String lastTwoNumber = stringValue.substring(Divisibility.getLength(stringValue) - 2);
		int intValue = Divisibility.getNumber(lastTwoNumber);

		if ((intValue % 2 == 0) && (intValue % 3 == 0)) {
			System.out.println("Divisible by Six.");
		} else {
			System.out.println("Not Divisible by Six.");
		}
		sc.close();

	}

}
