package arrays;

import java.util.Arrays;

public class StringAndFloatArray {

	public static void main(String[] args) {
		String[] names = {"Subash Bhaiya,Kirti Di ,Ankur"};
		
		String[] namesArray =new String[4];
		namesArray[0]="Subash Bhaiya";
		namesArray[1]="kirti Di";
		namesArray[2]="Ankur";	
		namesArray[3]="Neha";
		
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(namesArray));

	}

}
