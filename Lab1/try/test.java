public class test {
    public static void main(String args[]) {
        LIFOStack obj1 = new LIFOStack();
        obj1.enqueue(5);
        obj1.enqueue(7);
        obj1.enqueue(10);
        System.out.println(obj1.size());
        obj1.dequeue();
        System.out.println(obj1.size());
        obj1.dequeue();
        obj1.dequeue();
        System.out.println(obj1.size());
    }
}
