/**
 *  Michael J. Johnson Jr.
 */

package org.howard.edu.hw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class WordCount {

	public static void main(String[] args) {
//		FileReader reader = new FileReader();
		HashMap<String, Integer> wordCount = new HashMap<>();
	    try {
	      Scanner input = new Scanner(new File("src/main/resources/sample.txt"));
	      while (input.hasNextLine()) {
	        String[] sentence = input.nextLine().split(" ");
	        for (String word : sentence) {
	          if (isNumber(word) == false && word.length() > 3) {
	            word = word.toLowerCase();
	            //Increases for multiple occurrences of the same word
	            if (wordCount.containsKey(word)) {
	              wordCount.put(word, wordCount.get(word) + 1);
	            } else {
	              wordCount.put(word, 1);
	            }
	          }
	        }
	      }
	      input.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("File not found");
	    }
	    //Prints final result
	    for (String word : wordCount.keySet()) {
	      System.out.println(word + " " + wordCount.get(word));
	    }
	  }
	  
	//Function to determine if number is detected in the text file
	  public static boolean isNumber(String word) {
	    try {
	      Double.parseDouble(word);
	      return true;
	    } catch (NumberFormatException e) {
	      return false;
	    }
	  }

	}

/**
 * Edge Cases:
 * 
 * the word - "don't" ---> passed
 * numbers with multiple digits (5+) ----> passed
 * words with numbers in them - 101Dalmations ---> passed
 * 
 */
