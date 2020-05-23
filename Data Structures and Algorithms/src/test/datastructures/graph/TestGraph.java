package test.datastructures.graph;

import org.junit.Test;

import main.datastructures.graph.Graph;

public class TestGraph {

	@Test
	public void testValidInsert() {
		Graph graph = new Graph(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.printAllTheEdges();
	}
	
	@Test
	public void testValidRemove() {
		Graph graph = new Graph(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.printAllTheEdges();
		graph.removeEdge(2, 3);
		System.out.println("Graph after removing an edge");
		graph.printAllTheEdges();
	}
}
