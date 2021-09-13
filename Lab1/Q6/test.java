import java.util.Scanner;

public class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Q6 q = new Q6();
        int opt = 1;
        do {
            System.out.println();
            // System.out.println("1. Enter at end");
            System.out.println("2. Enter at start");
            System.out.println("3. Delete from end");
            System.out.println("4. Delete from start");
            System.out.println("5. Size");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Enter the data: ");
                    // q.addFrom_End(sc.nextInt());
                    System.out.println("Contents: ");
                    q.viewContent();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter the data: ");
                    q.add(sc.nextInt());
                    System.out.println("Contents: ");
                    q.viewContent();
                    System.out.println();
                    break;
                case 3:
                    // System.out.println("Deleted: " + q.deleteFrom_End());
                    q.viewContent();
                    break;
                case 4:
                    // System.out.println("Deleted: " + q.deleteFrom_Start());
                    q.viewContent();
                    break;
                case 5:
                    System.out.println("Size: " + q.size);
                    // q.viewContent();
                    break;
            }
        } while (opt != 0);
        sc.close();
    }

}
