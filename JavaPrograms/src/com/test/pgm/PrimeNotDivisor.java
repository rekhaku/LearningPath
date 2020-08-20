package com.test.pgm;

import java.util.Scanner;

public class PrimeNotDivisor {

		public static void main(String args[]) {
			Scanner s = new Scanner(System.in);
			int num = Integer.parseInt( s.nextLine());
						
			int cnt = 2;
			int divisorCnt = 0;
			while (cnt < num) {
				if (num % cnt == 0) {
					divisorCnt++;
				}
				cnt ++;
			}
			// Write your code here
			System.out.println(divisorCnt);
		}
	}


