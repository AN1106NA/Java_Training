package jpl.ch02.ex14;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	  public void getNextList_Test() {
	    LinkedList llist = new LinkedList(0);
	    assertEquals(llist.getNextList(), null);
	  }

	  @Test
	  public void getObject_Test() {
	    LinkedList llist = new LinkedList(100);
	    assertEquals(llist.getObject(), 100);
	  }
}
