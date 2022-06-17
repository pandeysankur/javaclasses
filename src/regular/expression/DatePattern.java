package regular.expression;

import java.util.Scanner;

public class DatePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String stringValue = sc.next();

		if (stringValue.matches("^((0[0-9])|(1[0-9])|(2[0-9])|(3[0-1]))-((1[1-9])|(1[0-2]))-[0-9]{4}$")) {
			System.out.println("It is Vaild Date Value");
		} else {
			System.out.println("No It is Vaild Date Value");
		}
		sc.close();

	}
}
