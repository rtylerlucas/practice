package util;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    public int data;
    public List<GraphNode> edges;
    public GraphNode(int data) {
        this.data = data;
        edges = new ArrayList<>();
    }
    public void addEdge(GraphNode node) {
        edges.add(node);
    }
}
