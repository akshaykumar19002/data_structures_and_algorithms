package test.datastructures;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import main.datastructures.HashTable;
import main.datastructures.HashTable.ElementNotPresentException;

public class TestHashTable {

	@Test
	public void testGetWithValidInput() {
		HashTable table = new HashTable();
		table.put("key1", "abc");
		table.put("key2", "xyz");
		table.put("key3", "asdflk1");
		try {
			assertSame(table.get("key1"), "abc");
		} catch (ElementNotPresentException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = ElementNotPresentException.class)
	public void testGetWithInvalidInput() throws ElementNotPresentException {
		HashTable table = new HashTable();
		table.put("key1", "abc");
		table.put("key2", "xyz");
		table.put("key1", "akfn");
		table.get("key3");
	}
	
}
