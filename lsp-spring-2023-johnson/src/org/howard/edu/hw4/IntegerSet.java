/**
 * 
 */
package org.howard.edu.hw4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mr.tyb
 *
 */
public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> intSet = new ArrayList<Integer>();

	// Default Constructor
	public IntegerSet() {
		
	}

	// Clears the internal representation of the set
	public void clear() {
	
	}

	// Returns the length of the set
	public int length() {
		return 0;
		
	} // returns the length

/*
 * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.
*/
	public boolean equals(IntegerSet b) {
		return false;
		
	} 

	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		return false;
		
	}

	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest()  {
		return 0;
		
	}

	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest() {
		return 0;
		
	}

	// Adds an item to the set or does nothing it already there	
 	public void add(int item) {
 		
 	} // adds item to the set or does nothing if it is in set

	// Removes an item from the set or does nothing if not there
 	public void remove(int item) {
 		
 	} 

 	// Set union
 	public void union(IntegerSet intSetb) {
 		
 	}

 	// Set intersection
 	public void intersect(IntegerSet intSetb) {
 		
 	} 

 	// Set difference, i.e., s1 –s2
 	public void diff(IntegerSet intSetb) {
 		// set difference, i.e. s1 - s2
 	}

 	// Returns true if the set is empty, false otherwise
 	boolean isEmpty() {
		return false;
 		
 	}

 	// Return String representation of your set
 	public String toString() {
		return null;
 		
 	}	// return String representation of your set
}

