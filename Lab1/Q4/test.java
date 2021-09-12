public class test {
    public static void main(String args[]) {
        LinkedListQ4<Integer> ll = new LinkedListQ4<>();
        // ll.insert_AtEnd(2);
        // ll.insert_AtEnd(5);
        System.out.println("Now: ");
        ll.viewContents();
        ll.insert_AtStart(3);
        ll.insert_AtStart(2);
        ll.insert_AtStart(1);
        System.out.println("\nNow: ");
        // ll.insert_AtEnd(5);
        ll.insert_AtStart(0);
        ll.insert_AtStart(-1);
        ll.insert_AtStart(-2);
        ll.viewContents();
    }

}
