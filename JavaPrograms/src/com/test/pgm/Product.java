package com.test.pgm;

import java.util.Scanner;

public class Product {

    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
		int tcNum = Integer.parseInt(s.nextLine()); // Reading input from STDIN
		String numbers = s.nextLine();
		String[] numberArray = numbers.split(" ");
		
		
        long formula = (long) (Math.pow(10,9) + 7);
        long answer = 1;
        int i =0;
		while ( i < tcNum) {
			int num = Integer.parseInt(numberArray[i]);
            answer  = (answer * num )%formula;
			i++;
		}
        System.out.println(answer);

        // Write your code here

    }
}
