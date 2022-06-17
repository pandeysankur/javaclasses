package divide.and.multiply;

public class DivideOfNumbers{

	public static void main(String[] args) {
		double numone = 10;
		double numtwo = 20;
		double finalvalue;

		if (numtwo == 0)
			System.out.println("If can't be divided as denominator zero");
		else {
			finalvalue = numone / numtwo;
			System.out.println(finalvalue);
		}

	}

}
