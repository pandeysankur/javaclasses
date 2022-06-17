package string.length.and.greathen.lessthen.method;

import java.util.Scanner;

public class MultiplicationTableUsing_ForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;

		System.out.println("Enter the number: \n");
		num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + "=" + num * i);
		}
		sc.close();
	}

}
