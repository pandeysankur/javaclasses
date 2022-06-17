package divisibility.check;

import java.util.Scanner;

public class DivisibilityByFive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		String stringValue = sc.next();

		String lastNumber = stringValue.substring(Divisibility.getLength(stringValue) - 1);
		int intValue = Divisibility.getNumber(lastNumber);
		
		if ((intValue == 0) && (intValue == 5)) {
			System.out.println("Divisible by Five.");
		} else {
			System.out.println("Not Divisible by Five.");
		}
		sc.close();
			
		}
		
	}


