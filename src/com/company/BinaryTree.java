package com.company;

import java.util.*;

public class BinaryTree {
    Node root;
    public void add(int addable) {
        root = addRecursive(root, addable);
    }
    public Node removeRecursive(Node node, int a) {
        if (node==null) return null;
        if (a==node.root) {
            if (node.left==null&&node.right==null) return null;
            if (node.right==null) return node.left;
            if (node.left==null) return node.right;
        }
        if (a<node.root) {node.left=removeRecursive(node.left, a); return node;}
        node.right = removeRecursive(node.right, a); return node;
    }
    private Node addRecursive (Node node, int a) {
        if (node==null) return new Node (a);
        if (a<node.root) node.left=addRecursive(node.left, a);
        else if (a>node.root) node.right=addRecursive(node.right, a);
        else return node;
        return node;
    }
    public void traverseLevelOrder() {
        if (root==null) {
            return;
        }
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            Node n = nodeQueue.remove();
            System.out.print(n.root+" ");
            if (n.left!=null) {
                nodeQueue.add(n.left);
            }
            if (n.right!=null) {
                nodeQueue.add(n.right);
            }
        }
    }
}