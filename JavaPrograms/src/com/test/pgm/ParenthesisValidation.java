package com.test.pgm;

public class ParenthesisValidation {
	
//	number of left parnthesis == number of right paranthesis
//	no right paranthesis should come before first left paranthesis
//  no left paranthersisshould come after last right paranthesis
	

	private static final String RT_PARANTHESIS = ")";
	private static final String LT_PARANTHESIS = "(";

	//Rule1 : First index of RT > First Index of LT
	private static boolean isRule1Valid(String inp)
	{
		
		boolean isValid = false;
		int firstIndexOfLT = inp.indexOf(LT_PARANTHESIS);
		int firstIndexOfRT = inp.indexOf(RT_PARANTHESIS);
		if (firstIndexOfRT > firstIndexOfLT)
		{
			isValid = true;
		}
		
		return isValid;
	}
	
	//Rule1 : last index of RT > last Index of LT
	private static boolean isRule2Valid(String inp)
	{
		
		boolean isValid = false;
		int lastIndexOfLT = inp.lastIndexOf(LT_PARANTHESIS);
		int lastIndexOfRT = inp.lastIndexOf(RT_PARANTHESIS);
		if (lastIndexOfRT > lastIndexOfLT)
		{
			isValid = true;
		}
		return isValid;
	}
	
	private static boolean isCountEqual(String inp)
	{
		int rtCount=0,ltCount = 0;
		boolean isValid= false;
		
		for (char c : inp.toCharArray())		{
			
			if(c=='(')
			{
				ltCount++;
			}
			if(c==')')
			{
				rtCount++;
			}		
		
		}
		if(rtCount==ltCount)
		{
			isValid = true;
		}
		
		return isValid;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = ")(dkk)()";
		if (!isCountEqual(input)) 
		{
			System.out.println("invalid string as count is different");
		}
		else if (!isRule1Valid(input))
		{
			System.out.println("invalid string as left paranthesis present after the last right paranthesis ");
		}
		else if(!isRule2Valid(input))
		{
			System.out.println("invalid string as right paranthesis present before the first left paranthesis ");
		}
		else
		{
			System.out.println("valid string");
		}
	}

}
