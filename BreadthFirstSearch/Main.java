package BreadthFirstSearch;

public class Main {

    public static void main(String[] args) {
        Vertex a = new Vertex("a");
        Vertex b = new Vertex("b");
        Vertex c = new Vertex("c");
        Vertex d = new Vertex("d");
        Vertex e = new Vertex("e");
        Vertex f = new Vertex("f");
        Vertex g = new Vertex("g");
        Vertex h = new Vertex("h");

        a.addNeighbor(b);
        a.addNeighbor(f);
        a.addNeighbor(g);

        b.addNeighbor(c);
        b.addNeighbor(d);

        d.addNeighbor(e);

        g.addNeighbor(h);

        BFS bfs = new BFS(a);
        System.out.println(bfs.toJson());
    }
}
