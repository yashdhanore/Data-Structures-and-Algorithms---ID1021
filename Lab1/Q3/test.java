public class test {
    public static void main(String args[]) {
        DoubleCircular q = new DoubleCircular();
        // q.enqueue(1);
        q.enqueue(2);
        // q.enqueue(3);
        // q.enqueue(4);
        q.viewContent();
        System.out.println();
        System.out.println("The size is: " + q.size);
        System.out.println();
        System.out.println("Deleted: " + q.dequeue());
        // System.out.println("Deleted: " + q.dequeue());
        System.out.println("The size is: " + q.size);
        q.viewContent();
    }
}
