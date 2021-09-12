// Implement a generic iterable FIFO-queue based on a double linked circular list.
// You should print the content of the list after each insertion/deletion of an element.

// Used:
// - Node and FIFO approach

// Author: Yash Dhanore
// Created: 9th Sept,2021
// Updates: 10th Sept,2021 (Added Dequeue and implemented tests)
//        : 12th Sept,2021 (Changed Logic to sentinel approach)

public class LinkedListQ4<T> {

    private Node<T> sentinel;
    private int size;

    private class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;

        Node(T i) {
            this(i, null, null);
        }

        Node(T v, Node<T> p, Node<T> n) {
            value = v;
            previous = p;
            next = n;
            size = 0;
        }
    }

    LinkedListQ4() {
        sentinel = new Node(1);
        sentinel.value = null;
        sentinel.next = sentinel;
        sentinel.previous = sentinel;
        size = 0;
    }

    void addFrom_End(T x) { // works
        Node<T> newnode = new Node<>(x, sentinel.previous, sentinel);
        sentinel.previous.next = newnode;
        sentinel.previous = newnode;
        size++;
    }

    void addFrom_Start(T x) { // works
        Node<T> newnode = new Node<>(x, sentinel, sentinel.next);
        sentinel.next.previous = newnode;
        sentinel.next = newnode;
        size++;
    }

    T deleteFrom_Start() { // works
        T x = sentinel.next.value;
        sentinel.previous.next = sentinel.next;
        sentinel.next.previous = sentinel.previous;
        sentinel = sentinel.next;
        size--;
        return x;
    }

    T deleteFrom_End() { // fix
        T x = sentinel.previous.value;
        sentinel.previous.previous = sentinel;
        sentinel.previous.next = sentinel;
        // sentinel.previous.previous = sentinel.previous;
        size--;
        return x;
    }

    void viewContent() {
        String contains = "";
        for (Node<T> n = sentinel.next; n != sentinel.previous.next; n = n.next) {
            contains = contains + n.value + " ";
        }
        System.out.println(contains);
    }
}