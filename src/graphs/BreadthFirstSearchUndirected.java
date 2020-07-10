package graphs;

import java.util.ArrayList;

public class BreadthFirstSearchUndirected {
    private ArrayList<GraphNode> list = new ArrayList<>();

    public BreadthFirstSearchUndirected(final ArrayList<GraphNode> list) {
        this.list = list;
    }

    void bfs(){
             for(GraphNode node : list)
                 if(!node.isChecked())
                     doVisit(node);
    }

    void doVisit(GraphNode node){
        ArrayList<GraphNode> queue = new ArrayList<>();

        queue.add(node);

        while (!queue.isEmpty()){
            GraphNode lastNode = queue.remove(0);
            lastNode.setChecked(true);
            System.out.print(lastNode.getName()+" ");


            for(GraphNode connected: lastNode.getNeighbour()){
                if(!connected.isChecked()){
                    queue.add(connected);
                    connected.setChecked(true);
                }
            }
        }
    }
    public void addUndirectedEdge(int i, int j) {
        GraphNode first = list.get(i-1);
        GraphNode second = list.get(j-1);
        first.getNeighbour().add(second);//Neighbour of first is second. Store it.
        second.getNeighbour().add(first);//Neighbour of second is first. Store it.
    }
}
