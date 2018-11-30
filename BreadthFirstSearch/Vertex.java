package BreadthFirstSearch;

import java.util.ArrayList;

public class Vertex {
    private String name;
    private boolean visited;
    private ArrayList<Vertex> neighbors;

    Vertex(String name) {
        this.name = name;
        this.visited = false;
        this.neighbors = new ArrayList<>();
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    boolean isVisited() {
        return visited;
    }

    void setVisited(boolean visited) {
        this.visited = visited;
    }

    ArrayList<Vertex> getNeighbors() {
        return neighbors;
    }

    void addNeighbor(Vertex neighbor) {
        this.neighbors.add(neighbor);
    }
}
