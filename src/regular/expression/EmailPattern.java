package regular.expression;

import java.util.Scanner;

public class EmailPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String stringValue = sc.next();
		if (stringValue.matches("^[A-Za-z0-9]+@(gmail|yahoo|hotmail|reddifmail|outlook).com$")) {
			System.out.println("Yes It is Vaild Email");
		} else {
			System.out.println("No It is Not Vaild Email");
		}
		sc.close();
	}

}
