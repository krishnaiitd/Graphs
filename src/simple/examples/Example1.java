package simple.examples;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

    public static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void printGraph(List<List<Integer>> adj) {
        for(int i = 0; i < adj.size(); i++) {
            System.out.println("Adjacency list for the vertex " + i);
            System.out.print("head");
            for(int j = 0; j < adj.get(i).size(); j++) {
                System.out.print("->" + adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create graph
        int v = 5;
        List<List<Integer>> adj = new ArrayList<>(5);
        for(int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        printGraph(adj);
    }
}
