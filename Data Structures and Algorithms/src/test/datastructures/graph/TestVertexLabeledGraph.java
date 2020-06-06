package test.datastructures.graph;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.junit.Test;

import main.datastructures.graph.VertexLabeledGraph;

public class TestVertexLabeledGraph {

	@Test
	public void validAddVertexTest() {
		VertexLabeledGraph graph = new VertexLabeledGraph(false);
		assertTrue(graph.addVertex("a"));
		assertTrue(graph.addVertex("b"));
		assertTrue(graph.addVertex("c"));
		assertTrue(graph.addVertex("d"));
	}

	@Test
	public void invalidAddVertexTest() {
		VertexLabeledGraph graph = new VertexLabeledGraph(false);
		graph.addVertex("a");
		graph.addVertex("b");
		graph.addVertex("c");
		assertFalse(graph.addVertex("c"));
		assertFalse(graph.addVertex("b"));
	}

	@Test
	public void checkVertexTest() {
		VertexLabeledGraph graph = new VertexLabeledGraph(false);
		graph.addVertex("a");
		graph.addVertex("b");
		graph.addVertex("c");
		assertTrue(graph.isVertexExists("c"));
		assertFalse(graph.isVertexExists("d"));
	}
	
	@Test
	public void validAddEdgeTest() {
		VertexLabeledGraph graph = new VertexLabeledGraph(false);
		graph.addVertex("a");
		graph.addVertex("b");
		graph.addVertex("c");
		graph.addEdge("a", "b");
	}
	
	@Test(expected = NoSuchElementException.class)
	public void invalidAddEdgeTest() {
		VertexLabeledGraph graph = new VertexLabeledGraph(false);
		graph.addVertex("a");
		graph.addVertex("b");
		graph.addVertex("c");
		graph.addEdge("a", "d");
	}

	@Test
	public void graphTest() {
		VertexLabeledGraph graph = new VertexLabeledGraph(false);
		graph.addVertex("a");
		graph.addVertex("b");
		graph.addVertex("c");
		graph.addVertex("d");
		graph.addEdge("a", "b");
		graph.addEdge("a", "c");
		graph.addEdge("a", "d");
		graph.addEdge("b", "d");
		graph.addEdge("c", "d");
		graph.addEdge("d", "d");
		System.out.println(graph.toString());
	}
}
