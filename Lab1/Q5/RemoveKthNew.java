public class RemoveKthNew<T> {
    private Node first = null;
    private int size = 0;

    private class Node {
        T item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(T item) {
        Node newnode = new Node();
        newnode.item = item;
        newnode.next = first;
        first = newnode;
        size++;
    }

    public T pop() {
        T item = first.item;
        first = first.next;
        size--;
        return item;
    }

    public T deleteAt(int index) {
        Node temp = first;
        int count = index;
        Node another = first;
        while (index > 1) {
            temp = temp.next;
            index--;
        }
        while (count > 2) {
            another = another.next;
            count--;
        }
        T val = temp.item;
        another.next = temp.next;
        return val;
    }

    void viewContent() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.item + " ");
            temp = temp.next;
        }

    }
}