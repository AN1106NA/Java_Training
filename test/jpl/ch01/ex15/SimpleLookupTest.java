package jpl.ch01.ex15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleLookupTest {
	  SimpleLookup simpleLookup;

	  @Before
	  public void setUp() throws Exception {
	    simpleLookup = new SimpleLookup();
	  }

	  @Test
	  public void testAdd() {
	    simpleLookup.add("apple", 1);
	    simpleLookup.add("banana", 2);

	    assertEquals(simpleLookup.find("bob"), 2);
	  }

	  @Test
	  public void testFindFail() {
	    simpleLookup.add("apple", 1);
	    simpleLookup.add("banana", 2);

	    assertEquals(simpleLookup.find("orange"), null);
	  }

	  @Test
	  public void testRemove() {
	    simpleLookup.add("apple", 1);
	    simpleLookup.add("banana", 2);
	    simpleLookup.remove("apple");

	    assertEquals(simpleLookup.find("apple"), null);
	  }

	}