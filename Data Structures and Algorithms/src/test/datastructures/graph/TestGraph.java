package test.datastructures.graph;

import org.junit.Test;

import main.datastructures.graph.Graph;

public class TestGraph {

	@Test
	public void testValidUndirectedGraphInsert() {
		System.out.println("Undirected Graph Insert Test");
		Graph graph = new Graph(5, false);
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.printAllTheEdges();
		System.out.println();
	}
	
	@Test
	public void testValidUndirectedGraphRemove() {
		System.out.println("Undirected Graph Remove Test");
		Graph graph = new Graph(5, false);
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
		System.out.println();
	}
	
	@Test
	public void testValidDirectedGraphInsert() {
		System.out.println("Directed Graph Insert Test");
		Graph graph = new Graph(5, true);
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.printAllTheEdges();
		System.out.println();
	}
	
	@Test
	public void testValidDirectedGraphRemove() {
		System.out.println("Directed Graph Remove Test");
		Graph graph = new Graph(5, true);
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
		System.out.println();
	}
}
