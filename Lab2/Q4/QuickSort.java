public class QuickSort {

    public void quickSort(int a[]) {
        Sort(a, 0, a.length - 1);
    }

    private static void Sort(int a[], int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = partition_sort(a, startIndex, endIndex);
            Sort(a, startIndex, pivotIndex - 1);
            Sort(a, pivotIndex + 1, endIndex);
        }
    }

    private static void swap(int a[], int j, int k) {
        int temp = a[j];
        a[j] = a[k];
        a[k] = temp;
    }

    private static int partition_sort(int[] a, int startIndex, int endIndex) {
        int pivot = a[endIndex]; // implement random here to get best performance
        int partitionIndex = startIndex;
        for (int i = startIndex; i < endIndex; i++) {
            if (a[i] <= pivot) {
                swap(a, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(a, partitionIndex, endIndex);
        return partitionIndex;
    }

}
