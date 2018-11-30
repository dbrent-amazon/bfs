package BreadthFirstSearch;

import org.json.JSONObject;

import java.util.LinkedList;
import java.util.Queue;

class BFS {

    private JSONObject json;

    BFS(Vertex root) {
        Queue<Vertex> queue = new LinkedList<>();
        json = new JSONObject();

        queue.add(root);
        root.setVisited(true);

        while (!queue.isEmpty()) {
            Vertex current = queue.remove();
            current.setVisited(true);
            for (Vertex neighbor : current.getNeighbors()) {
                if (!neighbor.isVisited()) {
                    queue.add(neighbor);
                    json.append(current.getName(), neighbor.getName());
                }
            }
        }
    }
    String toJson() {
        return json.toString(2);
    }
}
