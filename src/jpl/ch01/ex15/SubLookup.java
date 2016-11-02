package jpl.ch01.ex15;

interface SubLookup extends Lookup {
	void add(String name, Object value);
	void remove(String name);
}