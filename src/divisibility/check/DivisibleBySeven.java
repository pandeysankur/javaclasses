package divisibility.check;

import java.util.Scanner;

public class DivisibleBySeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		String stringValue = sc.next();

//		FIRST STAGE 

		String firstSixNumber = stringValue.substring(0, 6);
		System.out.println("First Six Number:" + firstSixNumber);
		String lastNumber = firstSixNumber.substring(Divisibility.getLength(firstSixNumber) - 1);
		int multiplyByTwo = Divisibility.getNumber(lastNumber) * 2;
		int restNumber = Divisibility.getNumber(stringValue.substring(0, 5));
		int minusValue = restNumber - multiplyByTwo;
		System.out.println("First Stage Value:" + minusValue);
		
//		SECOND STAGE

		String stringMinusValue = minusValue + "";
		String stringMinusValueLastNumber = stringMinusValue.substring(Divisibility.getLength(stringMinusValue) - 1);
		int stringMinusValueMultiplyByTwo = Divisibility.getNumber(stringMinusValueLastNumber) * 2;
		int stringMinusValueRestNumber = Divisibility.getNumber(stringMinusValue.substring(0, 4));
		int secondMinusValue = stringMinusValueRestNumber - stringMinusValueMultiplyByTwo;
		System.out.println("Second Stage Value:" + secondMinusValue);

//		TRIRD STAGE
		
		String stringSecondMinusValue = secondMinusValue + "";
		String stringSecondMinusValueLastNumber = stringSecondMinusValue
				.substring(Divisibility.getLength(stringSecondMinusValue) - 1);
		int stringSecondMinusValueMultiplyByTwo = Divisibility.getNumber(stringSecondMinusValueLastNumber) * 2;
		int stringSecondMinusValueRestNumber = Divisibility.getNumber(stringSecondMinusValue.substring(0, 3));
		int thirdMinusValue = stringSecondMinusValueRestNumber - stringSecondMinusValueMultiplyByTwo;
		
//		LAST STAGE 
		
		if (thirdMinusValue % 7 == 0) {
			System.out.println("Divisible By Seven");

		} else {
			System.out.println("Not Divisible By Seven");

			sc.close();
		}
	}

}
