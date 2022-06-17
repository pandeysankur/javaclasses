package divide.and.multiply;

import java.util.Scanner;

public class UserInputMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st value:");
		float numOne = sc.nextFloat();

		System.out.println("Enter the 2nd value:");
		int numTwo = sc.nextInt();
		
		System.out.println("Enter the 3rd value:");
		int numThree = sc.nextInt();
		
		float finalvalue;
		if (numOne == 0) {
			System.out.println("first value multiply by zero");
		}
		else if (numTwo == 0) {
			System.out.println("second value multiply by zero");
		}
		else if (numThree == 0) {
			System.out.println("third value multiply by zero");
		}
		
		else {
			finalvalue = numOne * numTwo * numThree;
			System.out.println(finalvalue);
		
			
		}
		sc.close();

	}

}
