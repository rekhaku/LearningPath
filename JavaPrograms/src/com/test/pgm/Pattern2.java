package com.test.pgm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		String limitStr = obj.readLine();
		int limit = Integer.parseInt(String.valueOf(limitStr));
		
		
		for(int i=0;i < limit;i++)
		{
			for (int j = 0 ;j< i;j++)
			{
				System.out.print(" 5 ");
			}
			System.out.println();
		}
	}

}
