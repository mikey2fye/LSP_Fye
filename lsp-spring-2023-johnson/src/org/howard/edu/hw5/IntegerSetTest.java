package org.howard.edu.hw5;
import org.howard.edu.hw5.IntegerSet.IntegerSetException;
import java.util.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


public class IntegerSetTest {
	
	private IntegerSet myIntSet;

	@BeforeEach
	public void setUp() throws Exception {
		myIntSet = new IntegerSet();
	}

	@AfterEach
	public void tearDown() throws Exception {
		myIntSet = null;
	}
		
	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		myIntSet.add(1);
		myIntSet.clear();
		assertEquals(myIntSet.intSet.size(), 0);
	}
	
	@Test
	@DisplayName("Test case for length")
	public void testLength() {
		myIntSet.add(5);
		myIntSet.add(10);
		myIntSet.add(15);
		myIntSet.add(20);
		assertTrue(myIntSet.length() == 4);
	}
	
	@Test
	@DisplayName("Test case for equals")
	public void testEquals() {
		IntegerSet compareSet = new IntegerSet();
		compareSet.add(1);
		myIntSet.add(1);
		assertTrue(myIntSet.equals(compareSet));
	}
	
	@Test
	@DisplayName("Test case for contains")
	public void testContains() {
		myIntSet.add(35);
		assertTrue(myIntSet.contains(35));
	}
	
	@Test
	@DisplayName("Test case for largest")
	public void testLargest() throws IntegerSetException {
		myIntSet.add(10);
		myIntSet.add(20);
		myIntSet.add(30);
		myIntSet.add(40);
		myIntSet.add(50);
		assertTrue(myIntSet.largest() == 50);
	}
	
	@Test
	@DisplayName("Test case for largest exception")
	public void testLargestException() {
		assertThrows(IntegerSetException.class, () -> my_set.largest());
	}
	
	@Test
	@DisplayName("Test case for smallest")
	public void testSmallest() throws IntegerSetException {
		myIntSet.add(20);
		myIntSet.add(40);
		myIntSet.add(60);
		myIntSet.add(80);
		assertTrue(myIntSet.smallest() == 20);
	}
	
	@Test
	@DisplayName("Test case for smallest exception")
	public void testSmallestException() {
		assertThrows(IntegerSetException.class, () -> my_set.smallest());
	}
	
	@Test
	@DisplayName("Test case for add")
	public void testAdd() {
		IntegerSet newSet = new IntegerSet();
		newSet.add(2);
		newSet.add(4);
		newSet.add(6);
		
		myIntSet.add(2);
		myIntSet.add(4);
		myIntSet.add(6);
		
		assertTrue(newSet.equals(myIntSet));
	}
	
	@Test
	@DisplayName("Test case for remove")
	public void testRemove() {
		myIntSet.add(50);
		myIntSet.add(100);
		myIntSet.add(150);
		myIntSet.remove(150);
		
		assertFalse(myIntSet.contains(150));
	}
	
	@Test
	@DisplayName("Test case for union")
	public void testUnion() {
		IntegerSet compareSet = new IntegerSet();
		my_set.add(1);
		my_set.add(2);
		my_set.add(3);
		my_set.add(4);
		
		compareSet.add(5);
		compareSet.add(6);
		
		my_set.union(compareSet);
		assertEquals(my_set.int_set, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
	}
	
	@Test
	@DisplayName("Test case for intersect")
	public void testIntersect() {
		IntegerSet compareSet = new IntegerSet();
		my_set.add(5);
		my_set.add(10);
		my_set.add(15);
		my_set.add(20);
		
		compareSet.add(10);
		compareSet.add(20);
		compareSet.add(30);
		compareSet.add(40);
		
		my_set.intersect(compareSet);
		assertEquals(my_set.int_set, new ArrayList<Integer>(Arrays.asList(10, 20)));
	}
	
	@Test
	@DisplayName("Test case for difference")
	public void testDifference() {
		IntegerSet compareSet = new IntegerSet();
		my_set.add(20);
		my_set.add(40);
		my_set.add(60);
		
		compareSet.add(30);
		compareSet.add(40);
		compareSet.add(50);
		
		my_set.diff(compareSet);
		assertEquals(my_set.int_set, new ArrayList<Integer>(Arrays.asList(20, 60)));
	}
	
	@Test
	@DisplayName("Test case for isEmpty")
	public void testEmpty() {
		assertTrue(my_set.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for toString")
	public void testString() {
		my_set.add(1);
		my_set.add(2);
		my_set.add(3);
		my_set.add(4);
		my_set.add(5);
		
		assertEquals(my_set.toString(), "1, 2, 3, 4, 5, ");
	}
}	
