package main.datastructures.models;

import main.datastructures.LinkedList;

public class LabeledNode {
	
	private String label;
	private LinkedList neighbours;
	
	public LabeledNode(String label) {
		this.label = label;
		neighbours = new LinkedList();
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public LinkedList getNeighbours() {
		return neighbours;
	}
	
	public void setNeighbours(LinkedList neighbours) {
		this.neighbours = neighbours;
	}

}
