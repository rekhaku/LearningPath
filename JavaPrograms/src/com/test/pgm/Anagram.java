package com.test.pgm;

import java.util.*;

public class Anagram {

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int tcNum = Integer.parseInt(s.nextLine()); // Reading input from STDIN
		String a = "", b = "",c="";
		List <String> stringList = new ArrayList<String>();
		while (tcNum > 0) {
			stringList.add(s.nextLine());
			stringList.add(s.nextLine());// Reading input from STDIN
			tcNum--;
		}

		// System.out.println("Hi, " + name + "."); // Writing output to STDOUT

		int num = 0 ,i = 0, j = 0,count =0;
		// char[] c = b.toCharArray();
		// boolean present = false;
		
		//System.out.println(stringList.size());
		try {
			while(num<stringList.size())
			{
				
				count = 0;
				i=0;
				j=0;
				a=stringList.get(num);
				b=stringList.get(num+1);				
				c = b;
				//System.out.println(a);
				//System.out.println(b);

				//System.out.println("i :" + i + " a.length: " + a.length() + ": j :" + j + "b.length:" + b.length());
				
				while (i < a.length()) {
					if (!b.contains(String.valueOf(a.charAt(i)))) {
						count++;
					} else {
						j = b.indexOf(a.charAt(i));
						c = b.substring(0, j) + b.substring(j + 1);		
						//System.out.println(c.length());
					}
					i++;
				}
				System.out.println("count:" + (count + c.length()));
				num = num + 2;

			}
		
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println("i :" + i + " a.length: " + a.length() + ": j :" + j + "b.length:" + b.length());
		}
		
		// Write your code here

	}
}
