public class RemoveKth<T> {

    private Node<T> head;
    private Node<T> tail;
    int size;

    private class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;
    }

    RemoveKth() {
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

    T removeAt(int index) {
        T removed = null;
        int count = 1;
        Node<T> temp = new Node<>();
        if (size == 0) {
            System.out.println("Empty!!");
        } else if (head == head.next) {
            removed = head.value;
            head = tail = null;
        } else {
            temp = tail;
            while (count != index) {
                temp = temp.previous;
            }
            removed = temp.value;

        }
        return null;
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