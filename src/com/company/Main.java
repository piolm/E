package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(420);
        binaryTree.add(69);
        binaryTree.add(1000-7);
        binaryTree.add(96);
        binaryTree.add(24);
        binaryTree.add(500);
        binaryTree.add(450);
        binaryTree.add(600);
        binaryTree.traverseLevelOrder();
    }
}

