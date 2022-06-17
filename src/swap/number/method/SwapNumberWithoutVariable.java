package swap.number.method;

import java.util.Scanner;

public class SwapNumberWithoutVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numONe");
		int numOne = sc.nextInt();

		System.out.println("Enter the numTwo");
		int numTwo = sc.nextInt();

		System.out.println("Before Swapping");
		System.out.println("numOne is :" + numOne);
		System.out.println("numTwo is :" + numTwo);

		numOne = numOne + numTwo;
		numTwo = numOne - numTwo;
		numOne = numOne - numTwo;

		System.out.println("After Swapping");
		System.out.println("numOne is :" + numOne);
		System.out.println("numTwo is :" + numTwo);
		sc.close();

	}
		
}
