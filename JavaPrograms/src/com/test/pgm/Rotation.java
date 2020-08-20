package com.test.pgm;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int tcNum = Integer.parseInt(s.nextLine());
		while (tcNum > 0) {
			String[] input1 = s.nextLine().split(" ");
			int n = Integer.parseInt(input1[0]); // no .of elements in array
			int k = Integer.parseInt(input1[1]); // no .of rotations
			String[] a = s.nextLine().split(" "); // array

			for (int j = 1; j <= k; j++) {
				String temp = a[n-1];
				int i = 0;
				for (i = n-1; i > 0; i--) {
					a[i] = a[i - 1];
				}
				a[i] = temp;
			}

			for (String num : a) {
				System.out.print(num + " ");
			}
		}

	}

}
