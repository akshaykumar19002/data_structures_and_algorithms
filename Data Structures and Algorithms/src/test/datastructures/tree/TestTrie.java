package test.datastructures.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.datastructures.tree.Trie;

public class TestTrie {
	
	@Test
	public void validSearchTest() {
		Trie trie = new Trie();
		trie.insert("apple");
		trie.insert("human");
		assertTrue(trie.search("apple"));
	}
	
	@Test
	public void invalidSearchTest() {
		Trie trie = new Trie();
		trie.insert("apple");
		trie.insert("human");
		assertFalse(trie.search("app"));
	}
	
	@Test
	public void validSearchPrefixTest() {
		Trie trie = new Trie();
		trie.insert("apple");
		trie.insert("human");
		assertTrue(trie.startsWith("app"));
	}
	
	@Test
	public void invalidSearchPrefixTest() {
		Trie trie = new Trie();
		trie.insert("apple");
		trie.insert("human");
		assertFalse(trie.startsWith("xpp"));
	}

}
