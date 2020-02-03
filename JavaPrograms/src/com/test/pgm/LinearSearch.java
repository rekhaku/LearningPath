package com.test.pgm;

import java.io.IOException;

import com.test.pgm.utils.ProgramUtils;

public class LinearSearch {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter limit: ");
		int limit = ProgramUtils.readInputInt();
		int[] array1 = new int[limit];
		System.out.println("Enter array");
		for (int i = 0; i < limit; i++) {
			array1[i] = ProgramUtils.readInputInt();
		}
		System.out.println("Enter item: ");
		int search = ProgramUtils.readInputInt();

		int cnt = 0;
		do {
			if (array1[cnt] == search) {
				System.out.println(search + " is at position " + (cnt+1));
				break;
			}
			cnt++;
			if (cnt>=limit)
			{
				System.out.println("Item not available");
				break;
			}
		} while (cnt > 0);

	}

}
