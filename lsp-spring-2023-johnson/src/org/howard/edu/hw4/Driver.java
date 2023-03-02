package org.howard.edu.hw4;

import org.howard.edu.hw4.IntegerSet.IntegerSetException;

/**
 * driver class to run all our tests
 * 
 * @author Michael
 *
 */
public class Driver {
	/**
	 * The main method
	 * Tests all the functions created in IntegerSet
	 * 
	 * @param the command line arguments
	 */
	public static void main(String[] args) {
		//in a try method to catch the exception
		try { 
			//declaring and initializing our first set
			IntegerSet setA = new IntegerSet();
			//adding integers to the set with a for loop
			for (int i = 1; i <= 20; i++) {
				setA.add(i);
			}
			
			//Testing the toString(), smallest(), and largest() functions
			System.out.println("Value of Set 1 is: " + setA.toString() + "\n");
			System.out.println("Smallest value in Set 1 is: " + setA.smallest()); 
			System.out.println("Largest value in Set 1 is: " + setA.largest() + "\n"); 
			
			//Testing the remove() function
			System.out.println("Removing 7 from Set 1.");
			setA.remove(7);
			System.out.println("New value of Set 1: " + setA.toString() + "\n"); 
			
			System.out.println("Removing 10 from Set 1.");
			setA.remove(10);
			System.out.println("New value of Set 1: " + setA.toString() + "\n"); 
			
			System.out.println("Remove 100 from Set 1.");
			setA.remove(100);
			System.out.println("New value of Set 1: " + setA.toString() + "\n"); 
			
			//Testing isEmpty() 
			System.out.println("Set 1 is Empty (true/false)");
			System.out.println(setA.isEmpty() + "\n"); 
			
			//testing contains()
			System.out.println("Set 1 contains 9? (true/false)");
			System.out.println(setA.contains(9) + "\n"); 
			
			//testing length()
			System.out.println("Length of Set 1: " + setA.length() + "\n"); 
			
			//"resetting" the set
			setA.clear();
			for (int i = 1; i <= 15; i++) {
				setA.add(i);
			}
			//declaring and initializing our second set
			IntegerSet setB = new IntegerSet();
			//adding integers to the set with a for loop
			for (int i = 0; i <= 30; i += 2) {
				setB.add(i);
			}
			System.out.println("Value of Set 1 is: " + setA.toString());
			System.out.println("Value of Set 2 is: " + setB.toString());
			System.out.println("We will reset the values of each list after every test." + "\n");
			
			//testing union()
			System.out.println("Union of Set 1 and Set 2");
			setA.union(setB);	
			System.out.println(setB.toString() + "\n");	
			
			setA.clear();
			for (int i = 1; i <= 10; i++) {
				setA.add(i);
			}
			setB.clear();
			for (int i = 0; i <= 20; i += 2) {
				setA.add(i);
			}
			
			System.out.println("Difference of Set 1 and Set 2");
			setA.diff(setB); 
			System.out.println(setA.toString() + "\n"); 
			setA.clear();
			for (int i = 1; i <= 10; i++) {
				setA.add(i);
			}
			setB.clear();
			for (int i = 0; i <= 20; i += 2) {
				setB.add(i);
			}
			
			System.out.println("Difference of Set 2 and Set 1");
			setB.diff(setA); 
			System.out.println(setB.toString() + "\n"); 
			setA.clear();
			for (int i = 1; i <= 10; i++) {
				setA.add(i);
			}
			setB.clear();
			for (int i = 0; i <= 20; i += 2) {
				setB.add(i);
			}
			
			System.out.println("Intersection of Set 1 and Set 2");
			setA.intersect(setB); 
			System.out.println(setA.toString() + "\n"); 
			setA.clear();
			for (int i = 1; i <= 10; i++) {
				setA.add(i);
			}
			setB.clear();
			for (int i = 0; i <= 20; i += 2) {
				setB.add(i);
			}
			System.out.println("Are Set 1 and Set 2 equal?");
			System.out.println(setA.equals(setB) + "\n"); 
			
			System.out.println("Catching the exception");
			setA.clear(); 
			setA.largest(); 
		}
		catch (IntegerSetException err) {
			System.out.println(err); 
		}

	}
}