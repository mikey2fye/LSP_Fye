package org.howard.edu.hw5;

import org.howard.edu.hw5.IntegerSet.IntegerSetException;

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
			System.out.println("Removing 7 from Set A.");
			setA.remove(7);
			System.out.println("New value of Set A: " + setA.toString() + "\n"); 
			
			System.out.println("Removing 10 from Set A.");
			setA.remove(10);
			System.out.println("New value of Set A: " + setA.toString() + "\n"); 
			
			System.out.println("Removing 90 from Set A.");
			setA.remove(90);
			System.out.println("New value of Set 1: " + setA.toString() + "\n"); 
			
			//Testing the isEmpty() function 
			System.out.println("Set A is Empty (true/false)");
			System.out.println(setA.isEmpty() + "\n"); 
			
			//Testing the contains() function
			System.out.println("Does set A contain 12? (true/false)");
			System.out.println(setA.contains(12) + "\n"); 
			
			//Testing the length() function
			System.out.println("Length of Set A: " + setA.length() + "\n"); 
			
			//Resetting the set
			setA.clear();
			for (int i = 1; i <= 15; i++) {
				setA.add(i);
			}
			//Declaring and initializing our second set
			IntegerSet setB = new IntegerSet();
			//Adding integers to the second set
			for (int i = 0; i <= 30; i += 2) {
				setB.add(i);
			}
			System.out.println("Value of Set A is: " + setA.toString());
			System.out.println("Value of Set B is: " + setB.toString());
			System.out.println("Resetting the values of each list after every test." + "\n");
			
			//Testing the union() function
			System.out.println("Union of Set A and Set B");
			setA.union(setB);	
			System.out.println(setB.toString() + "\n");	
			
			setA.clear();
			for (int i = 1; i <= 10; i++) {
				setA.add(i);
			}
			setB.clear();
			for (int i = 0; i <= 20; i += 2) {
				setB.add(i);
			}
			
			System.out.println("Value of Set A is: " + setA.toString());
			System.out.println("Value of Set B is: " + setB.toString());
			System.out.println("Difference of Set A and Set B");
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
			
			System.out.println("Value of Set A is: " + setA.toString());
			System.out.println("Value of Set B is: " + setB.toString());
			System.out.println("Difference of Set B and Set A");
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
			
			System.out.println("Value of Set A is: " + setA.toString());
			System.out.println("Value of Set B is: " + setB.toString());
			System.out.println("Intersection of Set 1 and Set 2");
			setA.intersect(setB); 
			System.out.println(setA.toString() + "\n"); 
			
			setA.clear();
			for (int i = 1; i <= 10; i += 2) {
				setA.add(i);
			}
			setB.clear();
			for (int i = 0; i <= 20; i += 2) {
				setB.add(i);
			}
			System.out.println("Are Set A and Set B equal?");
			System.out.println(setA.equals(setB) + "\n"); 
			System.out.println("Value of Set A is: " + setA.toString());
			System.out.println("Value of Set B is: " + setB.toString());
			
			setB.clear();
			for (int i = 1; i <= 10; i += 2) {
				setB.add(i);
			}
			
			System.out.println("Are Set A and Set B equal this time?");
			System.out.println(setA.equals(setB) + "\n"); 
			System.out.println("Value of Set A is: " + setA.toString());
			System.out.println("Value of Set B is: " + setB.toString());
			
			System.out.println("Catching the exception");
			setA.clear(); 
			setA.largest(); 
		}
		catch (IntegerSetException err) {
			System.out.println(err); 
		}

	}
}