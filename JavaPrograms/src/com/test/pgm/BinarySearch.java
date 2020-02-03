package com.test.pgm;

import java.io.IOException;

import com.test.pgm.utils.ProgramUtils;

public class BinarySearch {

	public static void main(String arg[]) throws IOException {
		int[] array1 = new int[10];
		int first, last, middle;
		System.out.println("Enter array");
		for (int i = 0; i < 10; i++) {
			array1[i] = ProgramUtils.readInputInt();
		}

		System.out.println("Enter search");
		int search =  ProgramUtils.readInputInt();
		first = 0;
		last = 10;
		middle = (first + last) / 2;

		while (first <= last)
		{
			if(array1[middle]<search)
			{
				first = middle+1;
			}
			else if (array1[middle]==search)
			{
				System.out.println("found at position "+(middle+1));
				break;
				
			}
			else
			{
				last =middle -1;
				
			}
				
			middle =(first+last)/2;
		}
		
		if(first>last)
		{
			System.out.println("not found");
		}
	}
}
