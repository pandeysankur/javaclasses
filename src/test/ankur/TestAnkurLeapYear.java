package test.ankur;

import java.util.Scanner;

import cheak.leap.year.arrays.CheakLeapYearOrNot;

public class TestAnkurLeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Date: ");
		String date = sc.next();
		if (checkLeapYearDateForFebuary(date)) {
			System.out.println("It is a Valid Date ");
		} else {
			System.out.println("It is a Not Valid Date ");
		}

		sc.close();
	}

	private static boolean checkLeapYearDateForFebuary(String date) {
		int month = 0;
		int dateValue = 0;
		if (CheakLeapYearOrNot.checkDatePattern(date)) {
			month = getMonth(date);
			dateValue = getDate(date);
		}
		if (CheakLeapYearOrNot.checkLeepYearOrNot(date)) {
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
		String[] dateArray = date.split("/");
		return Integer.parseInt(dateArray[dateArray.length - 2]);
	}

	public static int getDate(String date) {
		String[] dateArray = date.split("/");
		return Integer.parseInt(dateArray[dateArray.length - 3]);
	}

}
