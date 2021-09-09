public class LIFOStack {

    public Node head;
    public int size = 0;

    private class Node {
        int item;
        Node next;

        public Node(int value) {
            item = value;
        }
    }

    LIFOStack() {
        head = null;
        size = 0;
    }

    public void enqueue(int value) {
        Node n = new Node(value);
        n.next = head;
        head = n;
        size++;
    }

    public int dequeue() {
        int x = head.item;
        if (head == null) {
            System.out.println("The Queue is empty!");
        } else {
            head = head.next;
        }
        size--;
        return x;
    }

    public boolean isEmpty() {
        return false;

    }

    public int size() {
        return size;
    }

}