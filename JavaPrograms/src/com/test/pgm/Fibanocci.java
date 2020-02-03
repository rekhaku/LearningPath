package com.test.pgm;

import java.io.IOException;

import com.test.pgm.utils.ProgramUtils;

public class Fibanocci {
	public static void main(String args[]) throws IOException {

		System.out.println("Enter limit");	
		int limit = ProgramUtils.readInputInt();
		int f1 = 0;
		int f2=1;
		int sum =0;
		System.out.println(f1);
		for (int i =0;i<limit;i++)
		{
			sum = f1+f2;
			f1=f2;
			f2=sum;
			System.out.println(sum);
		}
	}

}
