package com.test.pgm;

import java.io.IOException;

import com.test.pgm.utils.ProgramUtils;

public class BubbleSort {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter limit: ");
		int limit = ProgramUtils.readInputInt();
		int[] array1 = new int[limit];
		System.out.println("Enter array");
		for (int i = 0; i < limit; i++) {
			array1[i] = ProgramUtils.readInputInt();
		}
		int temp =0;
		for (int i = 0; i < (limit-1); i++) {
			for (int j = 0; j < limit-i-1; j++) {
				if (array1[j] > array1[j + 1]) {
					
					temp = array1[j];
					array1[j]= array1[j+1];
					array1[j+1]=temp;
				}
			}
		}
		
		System.out.println("sorted array");
		for (int i = 0; i < limit; i++) {
			System.out.println(array1[i]);
		}
	}
}
