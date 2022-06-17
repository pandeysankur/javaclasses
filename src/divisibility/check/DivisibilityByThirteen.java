package divisibility.check;

import java.util.Scanner;

public class DivisibilityByThirteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		String stringValue = sc.next();

		String firstSixNumber = stringValue.substring(0, 6);
		System.out.println("First Six Number:" + firstSixNumber);
		String unitDigit = firstSixNumber.substring(Divisibility.getLength(firstSixNumber) - 1);
		System.out.println("Unit Digit =" + unitDigit);
		int multiplyByNine = Divisibility.getNumber(unitDigit) * 9;
		System.out.println("Unit Digit*9="+multiplyByNine);
		int restNumber = Divisibility.getNumber(stringValue.substring(0, 5));
		int minusValue = restNumber - multiplyByNine;
		if (minusValue%13==0) {
			System.out.println("Divisible By Thirteen(13)");
			
		}
		else {
			System.out.println("Not Divisible By Thirteen(13)");
		}

		sc.close();
	}

}
