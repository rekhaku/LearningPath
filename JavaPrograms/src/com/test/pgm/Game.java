package com.test.pgm;

import java.io.*;
import java.util.*;

public class Game {
	public static void main(String args[]) throws Exception {

		// Write code here
		Scanner s = new Scanner(System.in);
		
		List<Integer> tc1 = new ArrayList<Integer>();
		List<Integer> tc2 = new ArrayList<Integer>();
		int count = 0;
		while (s.hasNext()) {
			System.out.println("tc:");
			int no_of_tc = Integer.parseInt(s.next());
			System.out.println("no.:");
			int no_of_mem = Integer.parseInt(s.next());
			System.out.println("item:");
			tc1.add(Integer.parseInt(s.next()));
//			if (tc1.size() >= no_of_mem) {
//				tc2.add(Integer.parseInt(s.next()));
//			}

		}
		for (Integer a : tc1) {
			for (Integer b : tc2) {
				if (b > a) {
					Collections.swap(tc1, tc1.indexOf(a), tc1.indexOf(a) + 1);
					count++;
				}
			}

		}
		System.out.println(count);
	}
}
