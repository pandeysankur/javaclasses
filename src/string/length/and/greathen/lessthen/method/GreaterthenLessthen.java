package string.length.and.greathen.lessthen.method;

import java.util.Scanner;

public class GreaterthenLessthen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numOne");
		int numOne = sc.nextInt();

		System.out.println("Enter the numTwo");
		int numTwo = sc.nextInt();

		if(numOne>numTwo) {
			System.out.println("numOne is Greater then numTwo");
		}
		else if(numOne<numTwo) {
			System.out.println("numOne is Less then numTwo");
		}
		else {
			System.out.println("Both number are Equal");
		}
		sc.close();
	}

}
