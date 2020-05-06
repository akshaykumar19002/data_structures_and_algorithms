package datastructures;

public class Queue {

	private LinkedList head = null;
	
	public Queue() {
		this.head = new LinkedList();
	}
	
	public void enqueue(Object element) {
		this.head.add(element);
	}
	
	public Object dequeue() throws EmptyQueueException {
		if (this.head.isEmpty()) {
			throw new EmptyQueueException();
		}
		return this.head.removeFirst();
	}
	
	public Object peek() throws EmptyQueueException {
		if (this.head.isEmpty())
			throw new EmptyQueueException();
		return this.head.getFirst();
	}
	
	public boolean isEmpty() {
		return this.head.isEmpty();
	}
	
	public class EmptyQueueException extends Exception {
		
		public EmptyQueueException() {
			super("Queue is empty");
		}
	}
	
}
