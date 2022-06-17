package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RuntimeDefineedArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String[] stringArray=new String[4];
		System.out.println("Enter the String Value:");
		stringArray[0]=sc.next();
		stringArray[1]=sc.next();
		stringArray[2]=sc.next();
		stringArray[3]=sc.next();
		System.out.println(Arrays.toString(stringArray));
		sc.close();
	}

}
