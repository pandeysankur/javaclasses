package swap.number.method;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int numOne = 10;
		int numTwo = 20;
		int numThree;
		numThree = numOne;
		numOne = numTwo;
		numTwo = numThree;

		System.out.println("Value of numOne " + numOne);
		System.out.println("Value of numTwo " + numTwo);

	}
}
