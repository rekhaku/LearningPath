package com.test.pgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "This string has to be reversed";
		List<Character> vowelsTobeReplaced = new ArrayList<Character>();
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char e = input.charAt(i);
			if (vowels.contains(e)) {
				vowelsTobeReplaced.add(e);
				System.out.println(e);
			}

		}

		int k = 0, j = 0;
		while (k < vowelsTobeReplaced.size() || j < input.length()) {

			char c = input.charAt(j);

			if (vowels.contains(c)) {
				output = output + vowelsTobeReplaced.get(k);
				k++;
			} else {
				output = output + c;
			}
			j++;

		}

		System.out.println(output);

	}

}
