package jpl.ch02.ex06;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	//TODO テストの意味ないきがする...
	@Test
	public void testNextList() {
		LinkedList list1 = new LinkedList();
		list1.setObject(100);
		assertEquals(null, list1.getNextList());
	}

	@Test
	public void testGetObject() {
		LinkedList list1 = new LinkedList();
		list1.setObject(100);
		assertEquals(list1.getObject(), 100);
	}
}
