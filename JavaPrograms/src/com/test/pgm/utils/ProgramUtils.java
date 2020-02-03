package com.test.pgm.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramUtils {
	
	public static int readInputInt() throws IOException {
		String limitStr =  readInputStr();
		int limit = Integer.parseInt(String.valueOf(limitStr));
		return limit;
	}

	public static String readInputStr() throws IOException {
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		String limitStr = obj.readLine();
		return limitStr;
	}

}
