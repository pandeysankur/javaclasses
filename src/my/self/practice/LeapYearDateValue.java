package my.self.practice;

import java.util.Scanner;

public class LeapYearDateValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Date:");
		String date = sc.next();
		if (checkLeapYearDateForFebuary(date)) {
			System.out.println("It is a valid Date");
		} else {
			System.out.println("It is not a valid date ");
		}

		sc.close();
	}

	private static boolean checkLeapYearDateForFebuary(String date) {

		int dateValue = 0;
		int month = 0;
		if (checkDatePattern(date)) {
			month = getMonth(date);
			dateValue = getDate(date);
		}
		if (checkLeapYearOrNot(date)) {
			if (month == 2) {
				if (dateValue <= 29) {
					return true;
				} else {
					return false;
				}
			}
		} else {
			if (month == 2) {
				if (dateValue <= 28) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;

	}

	public static int getMonth(String date) {
		String[] dateArray = date.split("-");
		return Integer.parseInt(dateArray[dateArray.length - 2]);
	}

	public static int getDate(String date) {
		String[] dateArray = date.split("-");
		return Integer.parseInt(dateArray[dateArray.length - 3]);
	}

	private static boolean checkLeapYearOrNot(String date) {

		if (checkDatePattern(date)) {
			String[] dateArray = date.split("-");
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
		} else {
			return false;
		}
	}

	private static boolean checkDatePattern(String date) {
		if (date.matches("^((0[1-9])|(1[0-9])|(2[0-9])|(3[0-1]))-((0[1-9])|(1[0-2]))-([0-9]{4})$")) {
			return true;

		} else {
			return false;
		}
	}
}
