package com;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Edges{
    int value;
    Node startNode;
    Node endNode;
    Node[][] adjacentNodesAndWeight;
    Edges(int value,Node startNode,Node endNode){
        this.value = value;
        this.startNode = startNode;
        this.endNode = endNode;
    }
    void addAdjacentNodes(Node[] adjacentNodes, int[] edgeWeight){
        adjacentNodesAndWeight = new Node[adjacentNodes.length][2];
        for (int i = 0; i < adjacentNodes.length; i++) {
            adjacentNodesAndWeight[i][0] = adjacentNodes[i];
            adjacentNodesAndWeight[i][1] = edgeWeight[i];
        }
    }
}

class Graph{
     int numberOfNodes;
     int numberOfEdges;
    ArrayList<Node> nodes = new ArrayList<>(numberOfNodes);
    ArrayList<Edges> edgeList = new ArrayList<>(numberOfEdges);
    Graph(String[] names) {
        for (int i = 0; i < names.length; i++) {
            nodes.add(new Node(names[i]));
        }
    }
    void addEdge(Node startNode,Node endNode, int edgeWeight){
        edgeList.add(new Edges(edgeWeight,startNode,endNode));
    }
}

class Node{
    String value;
    boolean isTransversed;
    Node minimumDistanceTo(Node node){
        return node;
    }
    Node(String value){
        this.value = value;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("Input.txt"));
        int numberOfNodes = Integer.parseInt(input.readLine());
        String[] nodes = new String[numberOfNodes];
        for (int i = 0; i < numberOfNodes; i++) {
            nodes[i] = input.readLine();
        }
        int numberOfEdges = Integer.parseInt(input.readLine());
        Graph graph = new Graph(nodes);

        for (int i = 0; i < numberOfEdges; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(input.readLine(), ", ");
        }

    }
}


















