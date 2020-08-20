package com.test.pgm;

public class ToggleString {

	public static void main(String args[]) {
		String originalString = "abcdeF"; // Reading input from STDIN
		StringBuffer toggledString = new StringBuffer("");
		for (char c : originalString.toCharArray()) {
			if (Character.isUpperCase(c)) {
				toggledString.append(Character.toLowerCase(c));
			}

			else {
				toggledString.append(Character.toUpperCase(c));
			}
		}
		
		System.out.println(toggledString.toString());
	}

}
