package divisibility.check;

import java.util.Scanner;

public class DivisibilityByTwelveAndFourteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		String stringValue = sc.next();

		String firstSixNumber = stringValue.substring(0,6);
		System.out.println("First Six Number:" + firstSixNumber);
		int intValue = Divisibility.getNumber(firstSixNumber);

		if ((intValue % 3 == 0) && (intValue % 4 == 0)) {
			System.out.println("Divisible by 12");
		} else {
			System.out.println(" Not Divisible by 12");
		}
		sc.close();
	}

}
