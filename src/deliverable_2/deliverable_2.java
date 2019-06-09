package deliverable_2;

import java.util.Scanner;

public class deliverable_2 {

	public static void main(String[] args) {
		String string1 = "";
		String string2 = "";
		int string1Sum = 0;
		int string2Sum = 0;
		int difference;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a string.");
		string1 = scanner.next();
		
		System.out.println("Please enter another string.");
		string2 = scanner.next();
		
		for (int i = 0; i <= (string1.length() - 1); ++i) {
			char charToAdd = string1.charAt(i);
			int charVal = (int) charToAdd;
			System.out.println(charToAdd + ": " + charVal);
			string1Sum += charVal;
		}
		
		for (int i = 0; i <= (string2.length() - 1); ++i) {
			char charToAdd = string2.charAt(i);
			int charVal = (int) charToAdd;
			System.out.println(charToAdd + ": " + charVal);
			string2Sum += charVal;
		}
		
		difference = Math.abs(string1Sum - string2Sum);
		System.out.println("Difference (as absolute value): " + difference);
		
	}

}
