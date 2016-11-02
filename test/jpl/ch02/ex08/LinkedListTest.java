package jpl.ch02.ex08;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testGetObject() {
		LinkedList list = new LinkedList("car");
		assertEquals(list.getObject(), "car");
	}
}
