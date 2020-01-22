package com.test.pgm.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtils {

	/** The method add a word into dictionary, if it is not present
	 * @param word
	 * @param outputFile
	 * @return
	 */
	public static boolean addToDictionary(String word, String outputFile) {
		boolean isPresent = false;
		try {
			
			isPresent = isWordPresentInFile(word, outputFile);			
			if (!isPresent)
			{
				word = word + "\n";
				Files.write(Paths.get(outputFile), word.getBytes(),StandardOpenOption.APPEND);
			}

		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {

		}
		return isPresent;
	}

	/** This method checks if a word is already present in the file
	 * @param word
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public static boolean isWordPresentInFile(String word, String fileName) throws IOException {
		boolean isPresent;
		List<String> dictionary = convertFileToList(fileName);
		isPresent =	dictionary.contains(word);
		return isPresent;
	}

	/** This method collects all the words in a file,converts to lower case and add it to a list
	 *  Delimiters to distinguish the words are ',' '.'  '()'
	 *  
	 * @param fileName
	 * @return list of words
	 * @throws IOException
	 */
	public static List<String> convertFileToList(String fileName) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(".", fileName));
		List<String> dictionary = Stream.of(lines).flatMap(Collection::stream)
				.flatMap(str -> Arrays.stream(str.toLowerCase().split("[,|.| |(|)]"))) 
				.sorted()
				.collect(Collectors.toList());
		return dictionary;
	}
	
	
}
