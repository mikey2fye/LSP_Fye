package org.howard.edu.hw5;
import org.howard.edu.hw5.IntegerSet.IntegerSetException;
import org.howard.edu.hw5.IntegerSet;
import java.util.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


public class IntegerSetTest extends junit.framework.TestCase{
	
	private IntegerSet myIntSet;

	@BeforeEach
	protected void setUp() {
		myIntSet = new IntegerSet();
	}

	@AfterEach
	protected void tearDown() {
		myIntSet = null;
	}
		
	@Test
	@DisplayName("Test clear")
	public void testClear() {
		setUp();
		IntegerSet myOtherSet = new IntegerSet();
		myIntSet.add(7);
		myIntSet.add(17);
		myIntSet.add(72);
		myIntSet.clear();
		assertEquals(myIntSet.length(), 0);
		
		myOtherSet.add(4);
		myOtherSet.add(14);
		myOtherSet.add(43);
		myOtherSet.clear();
		assertEquals(myOtherSet.length(), 0);
		tearDown();
	}
	
	@Test
	@DisplayName("Test length")
	public void testLength() {
		setUp();
		myIntSet.add(4);
		myIntSet.add(8);
		myIntSet.add(12);
		myIntSet.add(16);
		myIntSet.add(20);
		assertEquals(myIntSet.length(), 5);
		tearDown();
	}
	
	@Test
	@DisplayName("Test equals")
	public void testEquals() {
		setUp();
		IntegerSet myOtherSet = new IntegerSet();
		myOtherSet.add(8);
		myIntSet.add(8);
		assertEquals(myIntSet.equals(myOtherSet), true);
		tearDown();
	}
	
	@Test
	@DisplayName("Test contains")
	public void testContains() {
		setUp();
		myIntSet.add(35);
		myIntSet.add(45);
		myIntSet.add(55);
		assertEquals(myIntSet.contains(35), true);
		assertEquals(myIntSet.contains(65), false);
		tearDown();
	}
	
	@Test
	@DisplayName("Test largest")
	public void testLargest() throws IntegerSetException {
		setUp();
		myIntSet.add(10);
		myIntSet.add(20);
		myIntSet.add(30);
		myIntSet.add(40);
		myIntSet.add(50);
		assertEquals(myIntSet.largest(), 50);
		tearDown();
	}
	
	@Test
	@DisplayName("Test largest exception")
	public void testLargestException() {
		setUp();
		assertThrows(IntegerSetException.class, () -> myIntSet.largest());
		tearDown();
	}
	
	@Test
	@DisplayName("Test smallest")
	public void testSmallest() throws IntegerSetException {
		setUp();
		myIntSet.add(20);
		myIntSet.add(40);
		myIntSet.add(60);
		myIntSet.add(80);
		assertEquals(myIntSet.smallest(), 20);
		tearDown();
	}
	
	@Test
	@DisplayName("Test smallest exception")
	public void testSmallestException() {
		setUp();
		assertThrows(IntegerSetException.class, () -> my_set.smallest());
		tearDown();
	}
	
	@Test
	@DisplayName("Test add")
	public void testAdd() {
		setUp();
		IntegerSet newSet = new IntegerSet();
		newSet.add(2);
		newSet.add(4);
		newSet.add(6);
		
		myIntSet.add(2);
		myIntSet.add(4);
		myIntSet.add(6);
		
		assertEquals(newSet, myIntSet);
		tearDown();
	}
	
	@Test
	@DisplayName("Test case for remove")
	public void testRemove() {
		setUp();
		myIntSet.add(100);
		myIntSet.add(200);
		myIntSet.add(500);
		myIntSet.add(1000);
		myIntSet.remove(200);
		
		assertEquals(myIntSet.contains(200), true);
		tearDown();
	}
	
	@Test
	@DisplayName("Test case for union")
	public void testUnion() {
		setUp();
		IntegerSet compareSet = new IntegerSet();
		myIntSet.add(1);
		myIntSet.add(2);
		myIntSet.add(3);
		myIntSet.add(4);
		
		compareSet.add(5);
		compareSet.add(6);
		
		myIntSet.union(compareSet);
		assertEquals(myIntSet, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
		tearDown();
	}
	
	@Test
	@DisplayName("Test case for intersect")
	public void testIntersect() {
		setUp();
		IntegerSet myOtherSet = new IntegerSet();
		myIntSet.add(5);
		myIntSet.add(10);
		myIntSet.add(15);
		myIntSet.add(20);
		
		myOtherSet.add(10);
		myOtherSet.add(20);
		myOtherSet.add(30);
		myOtherSet.add(40);
		
		//Creating a set to hold the correct output for the test case
		IntegerSet compareSet = new IntegerSet();
		compareSet.add(10);
		compareSet.add(20);
		
		myIntSet.intersect(myOtherSet);
		assertEquals(myIntSet.toString(), compareSet.toString());
		tearDown();
	}
	
	@Test
	@DisplayName("Test case for difference")
	public void testDifference() {
		setUp();
		IntegerSet myOtherSet = new IntegerSet();
		myIntSet.add(15);
		myIntSet.add(30);
		myIntSet.add(45);
		myIntSet.add(60);
		
		myOtherSet.add(30);
		myOtherSet.add(40);
		myOtherSet.add(60);
		
		//Creating a set to hold the correct output for the test case
		IntegerSet compareSet = new IntegerSet();
		compareSet.add(15);
		compareSet.add(45);
		
		myIntSet.diff(myOtherSet);
		assertEquals(myIntSet.toString(), compareSet.toString());
		tearDown();
	}
	
	@Test
	@DisplayName("Test case for isEmpty")
	public void testEmpty() {
		setUp();
		
		//True case
		assertEquals(myIntSet.isEmpty(), true);
		
		//False case
		myIntSet.add(88);
		assertEquals(myIntSet.isEmpty(), false);
	}
	
	@Test
	@DisplayName("Test case for toString")
	public void testString() {
		setUp();
		myIntSet.add(2);
		myIntSet.add(4);
		myIntSet.add(6);
		myIntSet.add(8);
		
		assertEquals(myIntSet.toString(), "2, 4, 6, 8 ");
	}
}	
