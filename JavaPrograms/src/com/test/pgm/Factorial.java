package com.test.pgm;

import java.io.IOException;

import com.test.pgm.utils.ProgramUtils;

/**
 * @author Rekha
 * @date 30-Jan-2020 : 10:15:50 pm
 * 
 */
public class Factorial {

	public static void main(String args[]) {
		try {
			findFib();			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void findFib() throws IOException {
		System.out.println("Enter limit");		
		int limit =  ProgramUtils.readInputInt();
		System.out.println(fact(limit));
		System.out.println("Do you want to continue ?");
		String answer = ProgramUtils.readInputStr();
		if(answer.equalsIgnoreCase("1"))
		{
			findFib();
			
		}
		else
		{
			System.out.println("Thank you!!");
			System.exit(0);
		}
	}

	

	private static int fact(int num) {
		if (num == 0)
			return 1;

		if (num > 1) {
			return num * fact(num - 1);
		} else {
			return num;
		}
	}

}
