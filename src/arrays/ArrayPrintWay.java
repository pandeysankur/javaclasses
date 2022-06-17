package arrays;

import java.util.Arrays;

public class ArrayPrintWay {

	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 4, 5, 6, 10, 20, 30 };

		int[] intSecondWay = new int[4];// (Allocating Memory)
		intSecondWay[0] = 10;
		intSecondWay[1] = 20;
		intSecondWay[2] = 30;
		intSecondWay[3] = 40;

		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(intSecondWay));

	}

}
