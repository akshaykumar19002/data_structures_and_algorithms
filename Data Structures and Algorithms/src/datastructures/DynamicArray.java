package datastructures;

public class DynamicArray<T> {

	private T [] data;
	private int capacity;
	private int size;
	
	public DynamicArray(int capacity) {
		this.capacity = capacity;
		this.data = (T[]) new Object[capacity];
	}
	
	public T get(int index) {
		return this.data[index];
	}
	
	public void set(int index, T value) {
		if (index <= size) {
			System.out.println("Use a index less than or equal to " + size);
			return;
		}
		this.data[index] = value;
	}
	
	public void insert(T value) {
		
	}
	
	//insert
	
	//delete
	
	//view
	
	//add
	
	//resize
	
	
	
	//isEmpty
	
	//contains
	
}
