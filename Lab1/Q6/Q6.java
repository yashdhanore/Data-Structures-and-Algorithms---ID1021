// Implement a generic iterable FIFO-queue based on a double linked circular list.
// You should print the content of the list after each insertion/deletion of an element.

// Used:
// - Node and FIFO approach

// Author: Yash Dhanore
// Created: 9th Sept,2021
// Updates: 10th Sept,2021 (Added Dequeue and implemented tests)
//        : 12th Sept,2021 (Changed Logic to sentinel approach)

public class Q6 {

    private Node sentinel = new Node();
    int size = 0;

    private class Node {
        int value;
        Node previous;
        Node next;

        Node(int v) {
            value = v;
            previous = null;
            next = null;
        }

        public Node() {
            next = null;
        }
    }

    void add(int x) { // fix
        Node newnode = new Node(x);
        int count = 0;
        if (isEmpty()) {
            sentinel.next = newnode;
            newnode.next = newnode;
            newnode.previous = newnode;
        } else {
            Node temp = sentinel.next;
            if (temp.value > x) {
                sentinel.next = newnode;
            } else {
                while (temp.value <= x) {
                    count++;
                    temp = temp.next;
                    if (temp == sentinel.next) {
                        break;
                    }
                }
            }
            newnode.next = temp;
            temp.previous.next = newnode;
            newnode.previous = temp.previous;
            temp.previous = newnode;
        }
        size++;
    }

    boolean isEmpty() {
        return sentinel.next == null;
    }

    void viewContent() {
        if (!isEmpty()) {
            System.out.print("[");
            Node temp = sentinel.next;
            do {
                System.out.print(temp.value + " ");
                temp = temp.next;
            } while (temp != sentinel.next);
            System.out.print("]");
        } else {
            System.out.println("[]");
        }
    }
}