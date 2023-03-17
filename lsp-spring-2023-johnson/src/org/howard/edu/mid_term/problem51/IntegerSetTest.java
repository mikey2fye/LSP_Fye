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
		ourRange = new IntegerRange(0, 150);
	}

	@AfterEach
	void tearDown() throws Exception {
		ourRange = null;
	}

	@Test
	@DisplayName("Test get_lower")
	void testGetLower() {
		assertEquals(ourRange.get_lower(), 0);
	}
	
	@Test
	@DisplayName("Test get_upper")
	void testGetUpper() {
		assertEquals(ourRange.get_upper(), 150);
	}
	
	@Test
	@DisplayName("Test contains")
	void testContains() {
		assertTrue(ourRange.contains(28));
		assertFalse(ourRange.contains(151));
		assertFalse(ourRange.contains(-92));
		assertTrue(ourRange.contains(101));
		assertFalse(ourRange.contains(700));
	}
	
	@Test
	@DisplayName("Test overlaps")
	void testOverlaps() throws EmptyRangeException {
		IntegerRange theirRange;
		
		theirRange = new IntegerRange(50, 75);
		assertTrue(ourRange.overlaps(theirRange));
		assertTrue(theirRange.overlaps(theirRange));
		
		theirRange = new IntegerRange(89, 143);
		assertTrue(ourRange.overlaps(theirRange));
		assertTrue(theirRange.overlaps(ourRange));
		
		theirRange = new IntegerRange(-15, -1);
		assertFalse(ourRange.overlaps(theirRange));
		assertFalse(theirRange.overlaps(ourRange));
		
	}
	
	@Test
	@DisplayName("Test EmptyRangeException")
	void testOverlapsException() {
		IntegerRange theirRange = null;
		
		assertThrows(EmptyRangeException.class, () -> ourRange.overlaps(theirRange));
	}
	
	@Test
	@DisplayName("Test size")
	void testSize() {
		IntegerRange theirRange;
		
		theirRange = new IntegerRange(73, 100);
		assertEquals(theirRange.size(), 27);
		
		theirRange = new IntegerRange(49, 113);
		assertEquals(theirRange.size(), 64);
		
		theirRange = new IntegerRange(-15, 15);
		assertEquals(theirRange.size(), 30);
		
		assertEquals(ourRange.size(), 150);
	}
}