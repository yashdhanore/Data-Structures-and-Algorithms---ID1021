import java.util.Scanner;

public class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] inputArr = new int[4];
        System.out.println("Input numbers: ");
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = sc.nextInt();
        }
        System.out.println("Sorting now: ");
        InsertionSort(inputArr);
        System.out.println("Sorted: ");
        for (int i = 0; i < inputArr.length; i++) {
            System.out.print(inputArr[i] + " ");
        }
        sc.close();
    }

    static void InsertionSort(int[] a) {
        int count = 1;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] <= a[j - 1]) {
                    System.out.println("Swap " + (count++) + ":");
                    swap(a, j, j - 1);
                    for (int k = 0; k < a.length; k++) {
                        System.out.print(a[k] + " ");
                    }
                    System.out.println();
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
