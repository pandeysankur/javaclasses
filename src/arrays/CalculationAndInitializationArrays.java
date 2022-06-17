package arrays;

import java.util.Arrays;

public class CalculationAndInitializationArrays {

	public static void main(String[] args) {
		int intNumber[] = new int[5];
		intNumber[0] = 11;
		intNumber[1] = 22;
		intNumber[2] = intNumber[0] + intNumber[1];
		intNumber[3] = intNumber[0] + 10;
		intNumber[4] = intNumber[0];
		System.out.println(Arrays.toString(intNumber));

	}

}
