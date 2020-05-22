package test.datastructures.tree;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.datastructures.tree.BinarySearchTree;

public class TestBinarySearchTree {

	@Test
	public void validSearchTest() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(6);
		bst.add(2);
		bst.add(3);
		bst.add(3);
		bst.add(10);
		bst.add(11);
		bst.add(8);
		assertTrue(bst.search(11));
	}
	
	@Test
	public void invalidSearchTest() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(6);
		bst.add(2);
		bst.add(3);
		bst.add(3);
		bst.add(10);
		bst.add(11);
		bst.add(8);
		assertFalse(bst.search(13));
	}
	
	@Test
	public void validDeleteTest() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(6);
		bst.add(2);
		bst.add(3);
		bst.add(3);
		bst.add(10);
		bst.add(11);
		bst.add(8);
		bst.delete(11);
		assertFalse(bst.search(11));
	}
	
	@Test
	public void invalidDeleteTest() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(6);
		bst.add(2);
		bst.add(3);
		bst.add(3);
		bst.add(10);
		bst.add(11);
		bst.add(8);
		bst.delete(13);
		assertFalse(bst.search(13));
	}
}
