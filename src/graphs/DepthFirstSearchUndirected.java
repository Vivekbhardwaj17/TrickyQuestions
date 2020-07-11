package graphs;

import java.util.ArrayList;
import java.util.Stack;

public class DepthFirstSearchUndirected {
    public DepthFirstSearchUndirected(final ArrayList<GraphNode> list) {
        this.list = list;
    }

    ArrayList<GraphNode> list = new ArrayList<>();

    void dfs() {
        //if a node is unvisited then run dfs on it
        for(GraphNode node: list) {
            if(!node.isChecked())
                dfsVisit(node);
        }
    }


    //dfs traversal by a source node
    void dfsVisit(GraphNode node) {
        //make an empty stack
        Stack<GraphNode> stack = new Stack<>();
        //add source node to stack
        stack.push(node);
        //while queue is not empty
        while(!stack.isEmpty()) {
            //pop a node from stack
            GraphNode presentNode = stack.pop();
            //mark node as visited
            presentNode.setChecked(true);
            //print the node
            System.out.print(presentNode.getName()+" ");
            //for each neighbor of present node
            for(GraphNode neighbor: presentNode.getNeighbour()) {
                //if neighbor is not visited then add it to queue
                if(!neighbor.isChecked()) {

                    stack.add(neighbor);
                    neighbor.setChecked(true);
                }
            }

        }
    }


    // add an undirected edge between two nodes
    public void addUndirectedEdge(int i, int j) {
        GraphNode first = list.get(i-1);
        GraphNode second = list.get(j-1);
        first.getNeighbour().add(second);
        second.getNeighbour().add(first);
    }
}
