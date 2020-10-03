import static org.junit.Assert.*;

import org.junit.Test;

public class testCases {
	
	// Test that constructor Part assigned t to attribute type, n to attribute number and p to attribute price
	@Test
	public void testCorrectT() {
		Part par = new Part('E', 10100, 1);
		assertEquals('E', par.getType());
	}
	
	@Test
	public void testCorrectN() {
		Part par = new Part('E', 10100, 1);
		assertEquals(10100, par.getNumber());
	}
	
	@Test
	public void testCorrectP() {
		Part par = new Part('E', 10100, 1);
		assertEquals(1, par.getPrice());
	}

	@Test
	// Throws IllegalArgumentException if invalid value
	// Exception message for invalid value: "One or more of the parameters have invalid value"
	public void testProperT() {
		try {
			new Part('e', 10100, 1); 
			fail("Should have thrown an exception when first parameter is not 'E', 'A' or 'D'");
		} catch (IllegalArgumentException e) {
			assertEquals("One or more of the parameters have invalid value", e.getLocalizedMessage()); // check message
		} catch (Exception e2) {
			fail("Caught exception but it is not IllegalArgumentException as expected");
		}
	}
	
	@Test
	public void testProperN()  {
		try {
			new Part('E', 99999, 1); 
			fail("Should have thrown an exception when second parameter is not between 10000 and 99999 inclusively");
		} catch (IllegalArgumentException e) {
			assertEquals("One or more of the parameters have invalid value", e.getLocalizedMessage()); // check message
		} catch (Exception e2) {
			fail("Caught exception but it is not IllegalArgumentException as expected");
		}
	}
	
	@Test
	public void testProperP()  {
		try {
			new Part('E', 10100, 0); 
			fail("Should have thrown an exception when third parameter is not greater than 0");
		} catch (IllegalArgumentException e) {
			assertEquals("One or more of the parameters have invalid value", e.getLocalizedMessage()); // check message
		} catch (Exception e2) {
			fail("Caught exception but it is not IllegalArgumentException as expected");
		}
	}
	
	@Test
	// Test that partData returns String in the following format: "X YYYYY Z"
	// where X is the character for part number, YYYYY is the part number, and Z is the price value
	public void testResult()  {
		Part par = new Part('E', 10100, 1);
		assertEquals("E 10100 1", par.partData());
	}
}
