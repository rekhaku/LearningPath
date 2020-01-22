package com.test.pgm;

import java.io.IOException;
import java.util.List;

import com.test.pgm.utils.FileUtils;

/**
 * @author Rekha
 * @date 15-Aug-2019 
 *  
 *      
 */
public class Dictionary {

	public static void main(String args[]) throws IOException {
		String inputFile = "./resources/DictionaryInput.txt";
		String outputFile = "./resources/DictionaryOutput.txt";
		try {
			List<String> inputWords = FileUtils.convertFileToList(inputFile);
			inputWords.forEach(s->{ System.out.println(s);
				FileUtils.addToDictionary(s,outputFile);
			});
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
