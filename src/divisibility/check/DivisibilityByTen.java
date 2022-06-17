package divisibility.check;

import java.util.Scanner;

public class DivisibilityByTen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		String stringValue = sc.next();

		String lastNumber = stringValue.substring(Divisibility.getLength(stringValue) - 1);
		int intValue = Divisibility.getNumber(lastNumber);
		System.out.println("Last Number:" + intValue);

		if (intValue == 0) {
			System.out.println("Divisible By Ten.");
		} else {
			System.out.println("Not Divisible By Ten.");
		}
		sc.close();
	}

}
