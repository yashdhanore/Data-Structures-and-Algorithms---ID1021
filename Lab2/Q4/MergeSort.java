public class MergeSort {

    public static void mergeSort(int a[]) {
        int[] temp = new int[a.length];
        sort(a, temp, 0, a.length - 1);
    }

    static void sort(int a[], int[] temp, int start, int end) {
        if (start <= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        sort(a, temp, start, mid);
        sort(a, temp, mid + 1, end);
        merge(a, temp, start, mid, end);
    }

    private static void merge(int[] a, int[] temp, int start, int mid, int end) {
        for (int i = start; i <= end; i++) {
            temp[i] = a[i];
        }
        int leftHalf = start;
        int rightHalf = mid + 1;
        for (int i = start; i <= end; i++) {
            if (leftHalf > mid) {
                a[i] = temp[rightHalf++];
            } else if (rightHalf > end) {
                a[i] = temp[leftHalf++];
            } else if (temp[leftHalf] < temp[rightHalf]) {
                a[i] = temp[leftHalf++];
            } else {
                a[i] = temp[rightHalf];
            }
        }
    }
}
