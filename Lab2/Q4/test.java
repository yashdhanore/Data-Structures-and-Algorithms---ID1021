public class test {
    public static void main(String args[]) {
        int[] size10 = { 10, 9, 8, 7, 7, 5, 1, 8, 2, 0 };
        int[] size100 = {};
        int[] size1000 = {};
        int[] size10000 = {};
        MergeSort mSort = new MergeSort();
        InsertionSort iSort = new InsertionSort();
        QuickSort qSort = new QuickSort();
        mSort.mergeSort(size10);
        // iSort.insertionSort(size10);
        // qSort.quickSort(size10);
        for (int i = 0; i < size10.length; i++) {
            System.out.print(size10[i] + " ");
        }
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
        // mergeSort(arr);
        long timeTaken = System.nanoTime() - startTime;
        // System.out.println("Time taken for merge(in millis): " + timeTaken / 100);

    }
}