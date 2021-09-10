public class LinkedListQ4<T> {

    private Node<T> head;
    private Node<T> tail;
    int size;

    private class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;
    }

    LinkedListQ4() {
        head = tail = null;
        size = 0;
    }

    void insert_AtStart(T x) {

    }

    void insert_AtEnd(T x) {
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

    T delete_FromStart() {
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

    T delete_FromEnd() {
        return null;
    }

    void viewContents() {

    }

}