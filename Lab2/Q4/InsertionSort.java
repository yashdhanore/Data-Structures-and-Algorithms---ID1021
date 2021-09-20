public class InsertionSort {
    public void insertionSort(int a[]) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int a[], int j, int k) {
        int temp = a[j];
        a[j] = a[k];
        a[k] = temp;
    }
}
