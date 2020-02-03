package com.test.pgm;

import java.io.IOException;

import com.test.pgm.utils.ProgramUtils;

public class FloydsTriangle {
	public static void main(String arg[]) throws IOException {
		System.out.print("Enter limit: ");		
		int limit =  ProgramUtils.readInputInt();
		int num =0;
		for (int i =1;i<=limit;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(++num+ " ");
			}
			System.out.println();
		}
	}

}

