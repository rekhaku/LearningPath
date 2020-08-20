package com.test.pgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int setALt = Integer.parseInt(s.nextLine());
		List<String> setA = Arrays.asList(s.nextLine().split(" "));

		int setCLt = Integer.parseInt(s.nextLine());
		List<String> setC = Arrays.asList(s.nextLine().split(" "));

		List<Integer> setB = new ArrayList<Integer>();

		int k = 0, sum_B = 0,sum_A =0;
		for (int i = 0; i < setC.size(); i++) {
			for (int j = 0; j < setA.size(); j++) {
				k = Integer.parseInt(setC.get(i)) - Integer.parseInt(setA.get(j));
				if (!setA.contains(String.valueOf(k))) {
					sum_B =0;
					for (int n : setB) {
						System.out.println("n = " + n);
						sum_B = sum_B + n;
					}
					System.out.println("sum b : " + sum_B);
					System.out.println("k : " + k);
					if (sum_B != k) {
						setB.add(k);
						System.out.println("k=" + k + " ");
					}

				} else if (!setB.contains(String.valueOf(k))) {
					sum_A =0;
					for (String r : setA) {
						System.out.println("r = " + r);
						sum_A = sum_A + Integer.parseInt(r);
					}
					if(sum_A!=k)
					{
					setB.add(k);
					}
				}
			}
		}
		
		for (int n : setB) {
			System.out.println(" " + n);
			
		}

	}

}
