public class test {
    public static void main(String args[]) {
        int[] size10 = {};
        int[] size100 = {};
        int[] size1000 = {};
        int[] size10000 = {};
        // int[] arr = { 9, 5, 1, 0, 1, 2, 4 };

        // long startTime = System.nanoTime();
        // mergeSort(arr, 0, arr.length);
        // long timeTaken = System.nanoTime() - startTime;
        // System.out.println("Time taken for MergeSort(in millis): " + timeTaken /
        // 1000000);
        // InsertionSort
        // long startTime = System.nanoTime();
        // insertionSort(arr);
        // long timeTaken = System.nanoTime() - startTime;
        // System.out.println("Time taken for insertionSort(in millis): " + timeTaken /
        // 100000);
        // QuickSort
        long startTime = System.nanoTime();
        mergeSort(arr);
        long timeTaken = System.nanoTime() - startTime;
        System.out.println("Time taken for merge(in millis): " + timeTaken / 100);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
    }
}