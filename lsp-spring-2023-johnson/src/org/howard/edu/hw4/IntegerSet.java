/**
 * 
 */
package org.howard.edu.hw4;

import java.util.ArrayList;
import java.util.List;

/**
 * making our own data structure
 * complete with functions and an error
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
	
	//Time Complexity: O(n)
	/**
	 * Clears the integer set using the built in ArrayList function clear()
	 */
	public void clear() {
		intSet.clear();
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
	//(O(N))
	/**
	 * returns the largest number in the set
	 * 
	 * @return integer the represents the largest value in the set
	 * 
	 * @throws IntegerSetException custom exception instance
	 */
	public int largest() throws IntegerSetException {
		//if the set is empty, throws an exception saying so
		if (intSet.isEmpty()) {
			throw new IntegerSetException("The Set is Empty.");
		}
		//search through the set and find the largest integer
		else {
			//set our comparison to something in the set already
			int large = intSet.get(0);
			//iterate through the set and compare the values to large
			for (int i = 0; i < intSet.size(); i++) {
				//set large to the bigger integer if found
				if (intSet.get(i) > large) {
					large = intSet.get(i);
				}
			}
			return large;
		}
	}
	
	//(O(N))
	/**
	 * returns the smallest integer in the set
	 * 
	 * @return integer that represents the smallest value in the set
	 * 
	 * @throws IntegerSetException custom exception instance
	 */
	public int smallest() throws IntegerSetException {
		//if the set is empty, throws an exception saying so
		if (intSet.isEmpty()) {
			throw new IntegerSetException("The set is empty.");
		}
		//search through the set and find the smallest integer
		else {
			//set our comparison to something in the set already
			int small = intSet.get(0);
			
			//iterate through the set and compare the values to small
			for (int i = 0; i < intSet.size(); i++) {
				//set small to the smaller integer if found
				if (intSet.get(i) < small) {
					small = intSet.get(i);
				}
			}
			return small;
		}
	}
	//(O(N))
	/**
	 * adds an integer to the set if it is not present
	 * 
	 * @param item integer instance to check
	 */
	public void add(int item) {
		if (intSet.contains(item) == false) {
			intSet.add(item);
		}
	}
	
	//(O(N))
	/**
	 * removes an integer from the set if it is present
	 * 
	 * @param item integer instance to check
	 */
	public void remove(int item) {
		if (intSet.contains(item) == true) {
			intSet.remove(intSet.indexOf(item));
		}
	}
	
	//(O(N))
	/**
	 * calculates the union of two sets
	 * 
	 * @param b IntegerSet instance to compare
	 */
	public void union(IntegerSet b) {
		for (int i = 0; i < b.length(); i++) {
			if (intSet.contains(b.intSet.get(i)) == false) {
				intSet.add(b.intSet.get(i));
			}
		}
	}
	
	//(O(N))
	/**
	 * calculates the intersection of two sets
	 * 
	 * @param b IntegerSet instance to compare
	 */
	public void intersect(IntegerSet b) {
		intSet.retainAll(b.intSet);
	}
	
	//(O(N))
	/**
	 * calculates the difference of two sets
	 * 
	 * @param b IntegerSet instance to compare
	 */
	public void diff(IntegerSet b) {
		for (int i = 0; i < b.length(); i++) {
			if (intSet.contains(b.intSet.get(i)) == true) {
				intSet.remove(b.intSet.get(i));
			}
		}
	}
	
	//(O(1))
	/**
	 * checks if the set is empty
	 * 
	 * @return true if empty, otherwise false
	 */
	public boolean isEmpty() {
		return intSet.isEmpty();
	}
	
	//(O(N))
	/**
	 * prints every integer in the set
	 * 
	 * @return String formatted to hold every integer in the set
	 */
	public String toString() {
		String list = "";
		for (int i = 0; i < intSet.size(); i++) {
			list += intSet.get(i).toString() + ", ";
		}
		return list;
	}
}