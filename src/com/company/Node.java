package com.company;

public class Node {
    int root;
    Node right = null;
    Node left = null;

    public Node(int root) {
        this.root = root;
    }

    public Node(int root, Node right, Node left) {
        this.root = root;
        this.right = right;
        this.left = left;
    }
}
