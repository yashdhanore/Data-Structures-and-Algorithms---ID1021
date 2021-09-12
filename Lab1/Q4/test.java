import java.util.Scanner;

public class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedListQ4<Integer> q = new LinkedListQ4<>();
        int opt = 1;
        do {
            System.out.println("1. Enter at end");
            System.out.println("2. Enter at start");
            System.out.println("3. Delete from end");
            System.out.println("4. Delete from start");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Enter the data: ");
                    q.addFrom_End(sc.nextInt());
                    System.out.println("Contents: ");
                    q.viewContent();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter the data: ");
                    q.addFrom_Start(sc.nextInt());
                    System.out.println("Contents: ");
                    q.viewContent();
                    System.out.println();
                    break;
                case 3:
                    q.deleteFrom_End();
                    q.viewContent();
                    break;
                case 4:
                    q.deleteFrom_Start();
                    q.viewContent();
                    break;
            }
        } while (opt != 0);
        sc.close();
    }

}
