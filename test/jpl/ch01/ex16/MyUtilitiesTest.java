package jpl.ch01.ex16;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUtilitiesTest {

	@Test
	public void testThrowBadDataSetException() {
		MyUtilities utility = new MyUtilities();
		try {
			utility.getDataSet("test");
		} catch (BadDataSetException expected) {
			// succeed
			System.err.println(expected.getIOException());
			assertEquals("test", expected.getDataset());
		}
	}
}
