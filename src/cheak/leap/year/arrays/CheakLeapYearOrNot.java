package cheak.leap.year.arrays;

import java.util.Scanner;

public class CheakLeapYearOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Date: ");
		String date = sc.next();
		checkDatePattern(date);
		checkLeepYearOrNot(date);
		sc.close();
	}

	public static boolean checkLeepYearOrNot(String date) {
		if (checkDatePattern(date)) {
			String[] dateArray = date.split("/");
			int year = Integer.parseInt(dateArray[dateArray.length - 1]);
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						return true;
					} else {
						return false;
					}
				} else {
					return true;
				}
			} else {
				return false;
			}

		}
		return false;
	}

	public static boolean checkDatePattern(String date) {
		if (date.matches("^((0[0-9])|(1[0-9])|(2[0-9])|(3[0-1]))/((1[1-9])|(1[0-2]))/([0-9]{4})$")) {
			return true;
		} else {
			return false;
		}

	}

}
