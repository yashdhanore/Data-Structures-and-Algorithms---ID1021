// Implement a generic iterable FIFO-queue based on a double linked circular list.
// You should print the content of the list after each insertion/deletion of an element.

// Used:
// - Node and FIFO approach

// Author: Yash Dhanore
// Created: 9th Sept,2021
// Updates: 10th Sept,2021 (Added Dequeue and implemented tests)
//        : 12th Sept,2021 (Changed Logic to sentinel approach)
//        : 12th Sept,2021 (Sentinel not included in the list, used as pointer and a position node for help)

public class DoubleCircular<T> {

    private Node<T> sentinel;
    private Node<T> position;
    private int size;

    private class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;

        Node(T v) {
            value = v;
            previous = null;
            next = null;

        }
    }

    DoubleCircular() {
        sentinel = new Node<>(null);
        sentinel.previous = sentinel;
        sentinel.next = sentinel;
        size = 0;
        position = sentinel;
    }

    void enqueue(T x) {
        Node<T> newnode = new Node<>(x);
        newnode.previous = position; // make newnode's previous point to the latest position
        newnode.next = position.next;
        // position.next.previous = newnode; // if position is not in the end and the
        // element after position now has a new node before it.
        position.next = newnode; // updating the position pointer now
        position = newnode;
        size++;
    }

    T dequeue() {
        Node<T> temp = sentinel.next;
        if (temp == sentinel) {
            System.out.println("Nothing to delete here!");
        } else {
            T x = sentinel.next.value;
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
            position = temp.next;
            size--;
            return x;
        }
        return null;
    }

    void viewContent() {
        for (Node<T> n = sentinel.next; n != sentinel; n = n.next) {
            System.out.print(n.value + " ");
        }
    }
}