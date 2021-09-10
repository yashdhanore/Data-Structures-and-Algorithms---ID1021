// Implement a generic iterable FIFO-queue based on a double linked circular list.
// You should print the content of the list after each insertion/deletion of an element.

// Used:
// - Node and FIFO approach

// Author: Yash Dhanore
// Created: 9th Sept,2021
// Updates: 10th Sept,2021 (Added Dequeue and implemented tests)

public class DoubleCircular<T> {

    private Node<T> head;
    private Node<T> tail;
    int size;

    private class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;
    }

    DoubleCircular() {
        head = tail = null;
        size = 0;
    }

    void enqueue(T x) {
        Node<T> newnode = new Node<>();
        newnode.value = x;
        if (size == 0) {
            head = tail = newnode;
            tail.next = tail;
            tail.previous = tail;
        } else {
            tail.next = newnode;
            newnode.previous = tail;
            newnode.next = head;
            head.previous = newnode;
            tail = newnode;
        }
        size++;
    }

    T dequeue() {
        T x = head.value;
        if (size == 0) {
            System.out.println("Empty!!");
        } else if (head == head.next) {
            head = tail = null;
        } else {
            head = head.next;
            head.previous = tail;
            tail.next = head;
        }
        size--;
        return x;
    }

    void viewContent() {
        if (head == null) {
            System.out.println("Nothing to see here!");
        } else {
            Node<T> iterate = new Node<>();
            iterate = head;
            while (iterate != tail) {
                System.out.print(iterate.value + " ");
                iterate = iterate.next;
            }
            System.out.print(iterate.value);
        }

    }
}