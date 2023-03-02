/**
 * 
 */
package org.howard.edu.hw4;

import java.util.ArrayList;
import java.util.List;

/**
 * Creating our own data structure
 * 
 * Complete with multiple functions and an error
 * 
 * @author Michael
 *
 */
public class IntegerSet {

	private List<Integer> intSet;
	
	/**
	 * Class Constructor
	 * 
	 * Initializes intSet
	 */
	public IntegerSet() {
		intSet = new ArrayList<Integer>();
	}
	
	//Time Complexity: O(1)
	/**
	 * Get method
	 * 
	 * @return An ArrayList containing all of the integers in the set
	 */
	public List<Integer> get_set() {
		return intSet;
	}
	
	//Time Complexity: O(1)
	/**
	 * Set method - replaces the contents of intSet with the ArrayList of integers from newSet
	 * 
	 * @param newSet List instance to declare to
	 */
	public void set_set(List<Integer> newSet) {
		intSet = newSet;
	}
	
	//Time Complexity: O(1)
	/**
	 * Returns the size of the array list
	 * 
	 * @return Integer which represents the size of the list
	 */
	public int length() {
		return intSet.size();
	}
	
	//Time Complexity: O(n)
	/**
	 * Clears the integer set using the built in ArrayList function clear()
	 */
	public void clear() {
		intSet.clear();
	}
		
	//Time Complexity: O(n)
	/**
	 * Checks to see if IntegerSet x is a replica of intSet 
	 * 
	 * @param x IntegerSet instance to compare
	 * 
	 * @return false if unequal, otherwise true
	 */
	public boolean equals(IntegerSet x) {
		//if they have different lengths they cannot be equal
		if (intSet.size() != x.length()) {
			return false;
		}
		//if they have equal lengths check if all elements are the same
		else {
			return intSet.containsAll(x.intSet);
		}
	}
	
	//Time Complexity: O(n)
	/**
	 * Checks to see if the IntegerSet contains a value
	 * 
	 * @param Value of integer instance to check
	 * 
	 * @return false if absent, otherwise true
	 */
	public boolean contains(int value) {
		return intSet.contains(value);
	}
	
	/**
	 * creating our own error that just prints out the string that is passed to it
	 * 
	 * @author Michael
	 *
	 */
	public class IntegerSetException extends Exception {
		/**
		 * Prints out an error
		 * 
		 * @param error String instance to print when called
		 * 
		 */
		public IntegerSetException(String error) {
			super(error);
		}
	}
	//Time complexity: O(n)
	/**
	 * Returns the largest number of the set
	 * 
	 * @return Integer that represents the largest value of the set
	 * 
	 * @throws custom IntegerSetException exception instance
	 */
	public int largest() throws IntegerSetException {
		//if the set is empty, throws an exception saying so
		if (intSet.isEmpty()) {
			throw new IntegerSetException("The set is empty.");
		}
		//search through the set and find the largest integer
		else {
			//set our comparison to something in the set already
			int largest = intSet.get(0);
			//iterate through the set and compare the values to large
			for (int i = 0; i < intSet.size(); i++) {
				//set large to the bigger integer if found
				if (intSet.get(i) > largest) {
					largest = intSet.get(i);
				}
			}
			return largest;
		}
	}
	
	//Time complexity: O(n)
	/**
	 * Returns the smallest integer of the set
	 * 
	 * @return Integer that represents the smallest value of the set
	 * 
	 * @throws custom IntegerSetException exception instance
	 */
	public int smallest() throws IntegerSetException {
		//if the set is empty, throws an exception saying so
		if (intSet.isEmpty()) {
			throw new IntegerSetException("The set is empty.");
		}
		//search through the set and find the smallest integer
		else {
			//set our comparison to something in the set already
			int smallest = intSet.get(0);
			
			//iterate through the set and compare the values to small
			for (int i = 0; i < intSet.size(); i++) {
				//set small to the smaller integer if found
				if (intSet.get(i) < smallest) {
					smallest = intSet.get(i);
				}
			}
			return smallest;
		}
	}
	//Time complexity: O(n)
	/**
	 * Adds an integer to the set if it is not already present
	 * 
	 * @param num integer instance to check
	 */
	public void add(int num) {
		if (intSet.contains(num) == false) {
			intSet.add(num);
		}
	}
	
	//Time complexity: O(n)
	/**
	 * Removes an integer from the set if it is not already present
	 * 
	 * @param num integer instance to check
	 */
	public void remove(int num) {
		if (intSet.contains(num) == true) {
			intSet.remove(intSet.indexOf(num));
		}
	}
	
	//Time complexity: O(n)
	/**
	 * Calculates the union of two sets
	 * 
	 * @param y IntegerSet instance to compare
	 */
	public void union(IntegerSet y) {
		for (int i = 0; i < y.length(); i++) {
			if (intSet.contains(y.intSet.get(i)) == false) {
				intSet.add(y.intSet.get(i));
			}
		}
	}
	
	//Time complexity: O(n)
	/**
	 * Calculates the intersection of two sets
	 * 
	 * @param y IntegerSet instance to compare
	 */
	public void intersect(IntegerSet y) {
		intSet.retainAll(y.intSet);
	}
	
	//Time complexity: O(n)
	/**
	 * Calculates the difference of two sets
	 * 
	 * @param y IntegerSet instance to compare
	 */
	public void diff(IntegerSet y) {
		for (int i = 0; i < y.length(); i++) {
			if (intSet.contains(y.intSet.get(i)) == true) {
				intSet.remove(y.intSet.get(i));
			}
		}
	}
	
	//Time complexity: O(1)
	/**
	 * Checks to see if the set is empty
	 * 
	 * @return true if empty, otherwise false
	 */
	public boolean isEmpty() {
		return intSet.isEmpty();
	}
	
	//Time complexity: O(n)
	/**
	 * prints every integer in the set
	 * 
	 * @return String formatted to hold every integer in the set
	 */
	public String toString() {
		String num_list = "";
		for (int i = 0; i < intSet.size(); i++) {
			num_list += intSet.get(i).toString() + ", ";
		}
		return num_list;
	}
}