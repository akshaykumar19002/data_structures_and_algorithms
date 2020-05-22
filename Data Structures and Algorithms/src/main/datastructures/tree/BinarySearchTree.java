package main.datastructures.tree;


/**
 * Binary Search Tree implementation only for String and Integer type
 * @author Akshay Kumar
 *
 */
public class BinarySearchTree{

	private BinaryTreeNode root;

	/**
	 * Empty Constructor
	 */
	public BinarySearchTree() {
		this.root = null;
	}
	
	/**
	 * Adds the data to the binary search tree
	 * @param data - element to be added to the binary search tree
	 */
	public void add(Integer data) {
		BinaryTreeNode newNode = new BinaryTreeNode(data);
		if (root == null) {
			this.root = newNode;
			return;
		}
		BinaryTreeNode temp = this.root;
		while (temp != null) {
			if (temp.getData() == data) {
				return;
			}
			if (temp.getData() > data) {
				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
					return;
				}
				temp = temp.getLeft();
			} else {
				if (temp.getRight() == null) {
					temp.setRight(newNode);
					return;
				}
				temp = temp.getRight();
			}
		}
		return;
	}
	
	/**
	 * Finds the specified data in the bst
	 * @param data - element to be searched in the bst
	 * @return true if the element is present in the bst
	 */
	public boolean search(Integer data) {
		BinaryTreeNode temp = root;
		while (temp != null) {
			if (temp.getData() == data) {
				return true;
			}
			if (temp.getData() > data)
				temp = temp.getLeft();
			else
				temp = temp.getRight();
		}
		return false;
	}
	
	/**
	 * Deletes the specified element from the bst
	 * @param data - element to be deleted from the bst
	 * @return data to be deleted from the bst, null if the element is not present in the bst
	 */
	public void delete(Integer data) {
		delete(root, data).getData();
	}
	
	private BinaryTreeNode delete(BinaryTreeNode temp, Integer data) {
		if (temp == null)
			return null;
		if (temp.getData() == data) {
			if (temp.getLeft() == null && temp.getRight() == null)return null;
			if (temp.getLeft() == null)	return temp.getRight();
			if (temp.getRight() == null) return root.getLeft();
			BinaryTreeNode left = root.getLeft();
			BinaryTreeNode right = root.getRight();
			BinaryTreeNode p = right;
			while (p.getLeft() != null)
				p = p.getLeft();
			return right;
		}
		if (data > temp.getData()) temp.setRight(delete(temp.getRight(), data));
		else 
			temp.setRight(delete(temp.getLeft(), data));
		return temp;
	}
	
//	if not root: return None
//	        if root.val == key:
//	            if not root.left and not root.right: return None
//	            if not root.left: return root.right
//	            if not root.right: return root.left
//	            left = root.left
//	            right = root.right
//	            p = right
//	            while p.left: p = p.left
//	            p.left = left
//	            return right
//	        if key > root.val: root.right = self.deleteNode(root.right, key)
//	        else: root.left = self.deleteNode(root.left, key)
//	        return root
		
}
