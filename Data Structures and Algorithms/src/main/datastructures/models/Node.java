package main.datastructures.models;

public class Node {
	
	public Object data;
	public Node next;
	
	public Node(Object value) {
		this.data = value;
		this.next = null;
	}
	
}