// Implement a generic iterable FIFO-queue based on a double linked circular list.
// You should print the content of the list after each insertion/deletion of an element.

// Used:
// - Node and FIFO approach

// Author: Yash Dhanore
// Created: 9th Sept,2021
// Updates: 10th Sept,2021 (Added Dequeue and implemented tests)
//        : 12th Sept,2021 (Changed Logic to sentinel approach)

public class RemoveKth<T> {

    private Node sentinel = new Node(null);
    private Node current;
    int size = 0;

    private class Node {
        T value;
        Node previous;
        Node next;

        Node(T v) {-
            value = v;
            previous = null;
            next = null;
        }
    }

    void addFrom_End(T x) {
        Node newnode = new Node(x); // check
        if (isEmpty()) {
            sentinel.next = newnode;
            newnode.next = newnode;
            newnode.previous = newnode;
        } else {
            sentinel.next.previous.next = newnode;
            newnode.previous = sentinel.next.previous;
            newnode.next = sentinel.next;
            sentinel.next.previous = newnode;
        }
        current = newnode;
        System.out.println("Current:" + current.value);
        size++;
    }

    void RemoveAt(int index) {
        System.out.println("Temp: " + current.value);
        Node temp = current;
        if (current == sentinel.next.previous) {
            if (index == 1) {
                deleteFrom_End();
            } else {
                while (index > 1) {
                    temp = temp.previous;
                    index--;
                }
            }
        } else {
            if (index == 1) {
                deleteFrom_Start();
            } else {
                while (index > 1) {
                    temp = temp.next;
                    index--;
                }
            }
        }

        // if (current == sentinel.next.previous) {
        // while (index > 1) {
        // temp = temp.previous;
        // index--;
        // }
        // } else if (current == sentinel.next) {
        // while (index > 1) {
        // temp = temp.next;
        // index--;
        // }
        // } else if (index == 1 && current == sentinel.next.previous) {
        // deleteFrom_End();
        // } else if (index == 1 && current == sentinel.next) {
        // deleteFrom_Start();
        // }
        System.out.println("Deleted: " + temp.value);
        temp.previous.next = temp.next;
        temp.next.previous = temp.previous;
    }

    void addFrom_Start(T x) { // fix
        Node newnode = new Node(x);
        if (isEmpty()) {
            sentinel.next = newnode;
            newnode.next = newnode;
            newnode.previous = newnode;
        } else {
            newnode.next = sentinel.next;
            newnode.previous = sentinel.next.previous;
            sentinel.next.previous.next = newnode;
            sentinel.next.previous = newnode;
            sentinel.next = newnode;
        }
        current = newnode;
        size++;
    }

    T deleteFrom_Start() {
        if (isEmpty()) {
            return null;
        } else if (sentinel.next == sentinel.next.next) {
            T x = sentinel.next.value;
            sentinel.next = null;
            return x;
        } else {
            T x = sentinel.next.value;
            sentinel.next.previous.next = sentinel.next.next;
            sentinel.next.next.previous = sentinel.next.previous;
            sentinel.next = sentinel.next.next;
            size--;
            return x;
        }
    }

    T deleteFrom_End() {
        if (isEmpty()) {
            return null;
        } else if (sentinel.next == sentinel.next.next) {
            T x = sentinel.next.value;
            sentinel.next = null;
            return x;
        } else {
            T x = sentinel.next.previous.value;
            sentinel.next.previous.previous.next = sentinel.next.previous.next;
            sentinel.next.previous.next.previous = sentinel.next.previous.previous;
            size--;
            return x;
        }
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