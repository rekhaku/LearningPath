package com.test.pgm;

import java.io.*;
import java.util.*;

public class Pattern1 {
	public static void main(String args[]) throws Exception {

		printStart(5, 5, 5);

	}

	static int printStart(int num, int limit, int count) {

		if (num == 0) {
			
			limit = limit - 1;
			System.out.print("\n ");
			System.out.println(count - limit);
			num = limit;

		}
		if (limit == 0) {
			return -1;
		}

		if (num <= limit) {
			// System.out.print("o");

		}

		// System.out.print(num + "---" + limit);
		int tabCount =(count - limit);
		//System.out.print(String.format("%"+tabCount+"s","*"));
		printStart(num - 1, limit, count);
		return 0;
	}
}