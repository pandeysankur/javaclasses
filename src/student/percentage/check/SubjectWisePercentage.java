package student.percentage.check;

import java.util.Scanner;

public class SubjectWisePercentage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your Physics marks : ");
		int physics = scan.nextInt();
		System.out.print("Enter your English marks : ");
		int English = scan.nextInt();
		System.out.print("Enter your Chemistry marks : ");
		int chemistry = scan.nextInt();
		System.out.print("Enter your Mathematics marks : ");
		int mathematics = scan.nextInt();
		System.out.print("Enter your Computer Science marks : ");
		int computer = scan.nextInt();
		int percentage = (physics + English + chemistry + mathematics + computer);
		System.out.println("Total Number = " + percentage);

		float percentage1 = ((physics + English + chemistry + mathematics + computer) / 5);

		System.out.println("Percentage = " + percentage1);
		scan.close();
		
	}

}
