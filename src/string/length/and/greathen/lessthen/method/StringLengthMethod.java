package string.length.and.greathen.lessthen.method;

import java.util.Scanner;

public class StringLengthMethod {

	public static void main(String[] args) {

//		String name = "AnkurPandey";
//		int str1 = name.length();
//		System.out.println("Length of String:" + str1);

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		str = sc.nextLine();
		int n = str.length();

		System.out.println("Length of the String:" + n);
		sc.close();
	}
}