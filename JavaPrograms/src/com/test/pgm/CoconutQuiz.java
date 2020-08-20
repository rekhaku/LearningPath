package com.test.pgm;

public class CoconutQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2
		 * 3
		 * 2*2
		 * 5
		 * 2*3
		 * 7
		 * */
		 
		//no.of coconuts = n
		int i= 1;
		int result =0;
		do
		{
			if (i == 2000)
			{
				break;
			}
			if((i%2 == 1) && (i%3 == 1)&&(i%4== 1)&&(i%5 == 1)&&(i%6 == 1)&& (i% 7 == 0))
			{
				
				System.out.println(i);
			}
			i++;
			
		}while(i!=0);

	}

}
