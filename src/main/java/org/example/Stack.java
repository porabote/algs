package org.example;

import java.util.LinkedList;

public class Stack {

    class Node {
        private Node prev;
        private int value;

        public Node(int value, Node prev) {
            this.prev = prev;
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }
    }

    LinkedList<Node> stack = new LinkedList<>();
    Node head;

    public void push(int value) {
        if (this.head == null) {
            this.head = new Node(value, null);
        } else {
            Node node = new Node(value, this.head);
        }
    }

    public Node pop() {

        Node value;

        if (this.head == null) {
            return null;
        } else {
            value = this.head;
            this.head = value.getPrev();
            return value;
        }
    }


}
