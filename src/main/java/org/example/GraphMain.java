package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class GraphMain {

    public static void main(String[] args) {
        Graph graph = new Graph(6);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);

        dfs(graph);
    }

    static private void dfs(Graph graph) {

        ArrayList<Integer> visited = new ArrayList<Integer>(Collections.nCopies(graph.size(), 0));

        ArrayList<Integer> compIds = new ArrayList<>();
        compIds.add(0);

        for (int vv = 0; vv < graph.size(); vv++) {
            int compId = compIds.size();

            if (visited.get(vv).equals(0)) {
                Integer size = dfsHelper(graph, vv, compId, visited);
                compIds.add(compId, size);
            }
        }
        System.out.println(compIds);
        System.out.println(visited);

        ArrayList<Integer> answer = new ArrayList<Integer>(Collections.nCopies(graph.size(), 0));
        for (int i = 0; i < graph.size(); i++) {
            answer.add(i, compIds.get((int) visited.get(i)) - 1);
        }

        System.out.println("Сколько достижимо городов для каждого города: " + answer);


    }

    static private Integer dfsHelper(Graph graph, Integer vertex, Integer compId, ArrayList visited) {

        visited.add(vertex, compId);

        int size = 1;

        ArrayList linkedVertex = graph.adjacent(vertex);

        for (int vv = 0; vv < linkedVertex.size(); vv++) {

            int node = (int) linkedVertex.get(vv);

            if (visited.get(node).equals(0)) {
                size += dfsHelper(graph, node, compId, visited);
            }
        }

        return size;
    }

}
