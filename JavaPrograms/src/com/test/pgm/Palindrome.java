package com.test.pgm;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		String originalString = s.nextLine();
		String reverseString = "";
		for (int i = originalString.length()-1; i >= 0; i--) {
			reverseString = reverseString + originalString.charAt(i);
			
		}
		System.out.println(originalString);
		System.out.println(reverseString);

		if (reverseString.equals(originalString)) {
			System.out.println(originalString);
			System.out.println(reverseString);

			System.out.println("YES");
		} else {
			System.out.println("NO");

		}

		// Write your code here

	}
}
