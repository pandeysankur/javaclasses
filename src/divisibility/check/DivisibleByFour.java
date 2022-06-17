package divisibility.check;

import java.util.Scanner;

public class DivisibleByFour {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Number:");
			String stringValue = sc.next();

			String lastTwoNumber = stringValue.substring(Divisibility.getLength(stringValue)-2);
			int intValue = Divisibility.getNumber(lastTwoNumber);
			
			if (intValue%4==0) {
				System.out.println("Divisible by Four.");
			}else {
				System.out.println("Not Divisible by Four.");
			}
sc.close();
	}
	
}
