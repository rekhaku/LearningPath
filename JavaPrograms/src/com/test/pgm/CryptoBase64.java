package com.test.pgm;

import java.util.Base64;

public class CryptoBase64 {

	public static void main(String[] args) {
		
		CharSequence originalInput = "0000";
		String encodedString = Base64.getEncoder().encodeToString(String.valueOf(originalInput).getBytes());
		System.out.println(originalInput);
		
		byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
		String decodedString = new String(decodedBytes);
		System.out.println(decodedString);
	}

}
