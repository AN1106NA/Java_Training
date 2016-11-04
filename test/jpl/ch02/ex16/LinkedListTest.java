package jpl.ch02.ex16;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {
	@Test
	public void testGetListLength1() {
		LinkedList list1 = new LinkedList(100, null);
		LinkedList list2 = new LinkedList(0, list1);
		LinkedList list3 = new LinkedList(15, list2);
		int expected = 3;
		assertEquals(expected, list3.size());
	}
}
