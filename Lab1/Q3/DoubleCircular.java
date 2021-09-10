public class DoubleCircular {

    private Node head;
    private Node tail;
    int size;

    private class Node {
        int value;
        Node previous;
        Node next;
    }

    DoubleCircular() {
        head = tail = null;
        size = 0;
    }

    void enqueue(int x) {
        Node newnode = new Node();
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

    int dequeue() {
        int x = head.value;
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
            Node iterate = new Node();
            iterate = head;
            while (iterate != tail) {
                System.out.print(iterate.value + " ");
                iterate = iterate.next;
            }
            System.out.print(iterate.value);
        }

    }
}