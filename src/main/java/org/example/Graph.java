package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Graph {

    ArrayList<ArrayList<Integer>> graph;

    public Graph(Integer n) {
      //  ArrayList<ArrayList> array = new ArrayList(6);
        this.graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            this.graph.add(new ArrayList<>());
        }
      //  System.out.println(this.graph);
    }

    public void addEdge(Integer a, Integer b) {
        graph.get(a).add(b);
        graph.get(b).add(a);
       // System.out.println(this.graph);
    }

    public ArrayList<Integer> adjacent(Integer vertex) {
        return graph.get(vertex);
    }

    public ArrayList<Integer> getVertices(Integer i) {
        return graph.get(i);
    }

    public Integer size() {
        return this.graph.size();
    }
}
