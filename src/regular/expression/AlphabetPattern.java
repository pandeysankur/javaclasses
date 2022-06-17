package regular.expression;

import java.util.Scanner;

public class AlphabetPattern {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the String: ");
			String stringValue =sc.next();
			if (stringValue.matches("^[A-Za-z]+$")) {
				System.out.println("Yes it Match");
			}else {
				System.out.println("No it didn't Match");

			}
			sc.close();

	}

}
