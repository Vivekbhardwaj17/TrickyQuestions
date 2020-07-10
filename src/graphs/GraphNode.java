package graphs;

import java.util.ArrayList;

public class GraphNode {
    private String name;
    private boolean isChecked;
    private ArrayList<GraphNode> neighbour = new ArrayList<>();
    private int index;

    @Override
    public String toString() {
        return "GraphNode{" +
                "name='" + name + '\'' +
                ", isChecked=" + isChecked +
                ", neighbour=" + neighbour +
                ", index=" + index +
                '}';
    }

    public GraphNode(final String name) {
        this.name = name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setChecked(final boolean checked) {
        this.isChecked = checked;
    }

    public void setNeighbour(final ArrayList<GraphNode> neighbour) {
        this.neighbour = neighbour;
    }

    public void setIndex(final int index) {
        this.index = index;
    }

    public String getName() {
        return this.name;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public ArrayList<GraphNode> getNeighbour() {
        return this.neighbour;
    }

    public int getIndex() {
        return this.index;
    }
}
