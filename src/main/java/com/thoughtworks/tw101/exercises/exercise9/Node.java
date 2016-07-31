package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        left = null;
        right = null;
    }

    public void add(String nameOfNewNode) {
        if (name.compareTo(nameOfNewNode) > 0) {
            if (left == null) {
                left = new Node(nameOfNewNode);
            }
            else {
                left.add(nameOfNewNode);
            }
        }
        else if (name.compareTo(nameOfNewNode) < 0) {
            if (right == null) {
                right = new Node(nameOfNewNode);
            }
            else {
                right.add(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        List<String> namesList = new ArrayList<String>();

        if (left != null) {
            namesList.addAll(left.names());
        }

        namesList.add(name);

        if (right != null) {
            namesList.addAll(right.names());
        }

        return namesList;
    }
}
