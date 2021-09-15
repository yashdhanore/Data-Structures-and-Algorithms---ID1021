import java.util.Scanner;

public class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        RemoveKthNew<Integer> q = new RemoveKthNew<>();
        int opt = 1;
        do {
            System.out.println();
            System.out.println("1. Push");
            // System.out.println("2. Enter at start");
            System.out.println("3. Pop");
            // System.out.println("4. Delete from start");
            // System.out.println("5. Size");
            System.out.println("6. RemoveAt");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Enter the data: ");
                    q.push(sc.nextInt());
                    System.out.println("Contents: ");
                    q.viewContent();
                    System.out.println();
                    break;
                /*
                 * System.out.println("Enter the data: "); q.addFrom_End(sc.nextInt());
                 * System.out.println("Contents: "); q.viewContent(); System.out.println();
                 * break;
                 */
                case 2:
                    System.out.println("Enter the data: ");
                    System.out.println("Contents: ");
                    q.viewContent();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Deleted: " + q.pop());
                    q.viewContent();
                    break;
                case 4:
                    // System.out.println("Deleted: " + q.deleteFrom_Start());
                    q.viewContent();
                    break;
                case 5:
                    // System.out.println("Size: " + q.size);
                    // q.viewContent();
                    break;
                case 6:
                    System.out.println("Enter the index you want to remove: ");
                    System.out.println("Deleted: " + q.deleteAt(sc.nextInt()));
                    System.out.println();
                    q.viewContent();
                    break;
            }
        } while (opt != 0);
        sc.close();
    }

}
