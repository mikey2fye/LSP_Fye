package org.howard.edu.mid_term.problem51;
import static org.junit.jupiter.api.Assertions.*;
import org.howard.edu.mid_term.problem51.Range.EmptyRangeException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class IntegerRangeTest {

	IntegerRange ourRange;
	
	@BeforeEach
	void setUp() throws Exception {
		ourRange = new IntegerRange(0, 100);
	}

	@AfterEach
	void tearDown() throws Exception {
		ourRange = null;
	}

	@Test
	@DisplayName("Test for get_lower")
	void testGetLower() {
		assertEquals(ourRange.get_lower(), 0);
	}
	
	@Test
	@DisplayName("Test for get_upper")
	void testGetUpper() {
		assertEquals(ourRange.get_upper(), 100);
	}
	
	@Test
	@DisplayName("Test for contains")
	void testContains() {
		assertTrue(ourRange.contains(56));
		assertFalse(ourRange.contains(789));
		assertFalse(ourRange.contains(-34));
		assertTrue(ourRange.contains(100));
	}
	
	@Test
	@DisplayName("Test for overlaps")
	void testOverlaps() throws EmptyRangeException {
		IntegerRange theirRange;
		
		theirRange = new IntegerRange(50, 75);
		assertTrue(ourRange.overlaps(theirRange));
		assertTrue(theirRange.overlaps(theirRange));
		
		theirRange = new IntegerRange(89, 143);
		assertTrue(ourRange.overlaps(theirRange));
		assertTrue(theirRange.overlaps(ourRange));
		
		theirRange = new IntegerRange(-10, 5);
		assertTrue(ourRange.overlaps(theirRange));
		assertTrue(theirRange.overlaps(ourRange));
		
		theirRange = new IntegerRange(101, 456);
		assertFalse(ourRange.overlaps(theirRange));
		assertFalse(theirRange.overlaps(ourRange));
	}
	
	@Test
	@DisplayName("Test for EmptyRangeException")
	void testOverlapsException() {
		IntegerRange theirRange = null;
		
		assertThrows(EmptyRangeException.class, () -> ourRange.overlaps(theirRange));
	}
	
	@Test
	@DisplayName("Test for size")
	void testSize() {
		IntegerRange theirRange;
		
		theirRange = new IntegerRange(25, 50);
		assertEquals(theirRange.size(), 25);
		
		theirRange = new IntegerRange(78, 143);
		assertEquals(theirRange.size(), 65);
		
		theirRange = new IntegerRange(-10, 10);
		assertEquals(theirRange.size(), 20);
		
		assertEquals(ourRange.size(), 100);
	}
}