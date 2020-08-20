package com.test.pgm;

import java.util.Scanner;

public class DivisorCount {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String numbers = s.nextLine(); // Reading input from STDIN
		// System.out.println("Hi, " + name + "."); // Writing output to STDOUT
		String[] num = numbers.split(" ");
		int l = Integer.parseInt(num[0]);
		int r = Integer.parseInt(num[1]);
		int k = Integer.parseInt(num[2]);
		int cnt = l;
		int divisorCnt = 0;
		while (cnt <= r) {
			if (cnt % k == 0) {
				divisorCnt++;
			}
			cnt ++;
		}
		// Write your code here
		System.out.println(divisorCnt);
	}
}
