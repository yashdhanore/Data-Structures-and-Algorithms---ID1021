import java.util.Scanner;

public class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        DoubleCircular<Integer> q = new DoubleCircular<>();
        int opt = 1;
        do {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Size");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Enter the data: ");
                    q.enqueue(sc.nextInt());
                    System.out.println("Contents: ");
                    q.viewContent();
                    System.out.println();
                    break;
                case 2:
                    q.dequeue();
                    q.viewContent();
                    break;
                case 3:
                    // System.out.println(q.size);
                    break;
            }
        } while (opt != 0);
        sc.close();
    }
}
