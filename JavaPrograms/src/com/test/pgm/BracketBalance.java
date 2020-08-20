package com.test.pgm;

import java.util.Scanner;
import java.util.Stack;

public class BracketBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int tcNum = Integer.parseInt(s.nextLine());
		// Reading input from STDIN
		while (tcNum >0)
		{
			String input = s.nextLine();
			Stack<Character> bracketStack = new Stack <Character> ();
			for(int i=0;i<input.length();i++)
			{
				if(input.charAt(i)=='{' || input.charAt(i)=='[' ||input.charAt(i)=='(' )
				{
					bracketStack.push(input.charAt(i));
				}
					
			}
			
			
			tcNum--;
		}

	}

}
