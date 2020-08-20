package com.test.pgm;

public class SeriesPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 3;
		int limit = 3;
		method2(10, counter, limit, false);

	}

	private static int method(int i, int n) {

		int result = i + i * n;
		if (n < 0) {
			System.out.println(result);
			n++;
			return (method(i, n));
		} else if (n > 0) {
			System.out.println(result);
			n--;
			return (method(i, n));
		}
		if (n == 0) {
			System.out.println(result);
			n++;
			method(i, n);
		}
		return 0;

	}

	private static void method2(int i, int n, int limit, boolean dec) {
		if (n >= 0 && n <= limit && dec == false) {
			if(n==0)
			{
				dec = true;
				System.out.println(i + i * n);
			}
			else
			{
				System.out.println(i + i * n);
				method2(i, n - 1, limit, false);
			}
			
		}
		if (n <= limit && dec == true) {
			System.out.println(i + i * n);
			method2(i, n + 1, limit, true);
		}

	}
}
