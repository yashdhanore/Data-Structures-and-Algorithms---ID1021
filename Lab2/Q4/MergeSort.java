public class MergeSort {

    public void mergeSort(int a[]) {
        int[] temp = new int[a.length];
        sort(a, temp, 0, a.length - 1);
    }

    private static void sort(int a[], int[] temp, int start, int end) {
        if (end <= start) {
            return;
        }
        int mid = start + (end - start) / 2;
        sort(a, temp, start, mid);
        sort(a, temp, mid + 1, end);
        merge(a, temp, start, mid, end);
    }

    private static void merge(int[] a, int[] temp, int start, int mid, int end) {
        for (int k = start; k <= end; k++)
            temp[k] = a[k];

        int leftHalf = start, rightHalf = mid + 1;
        for (int k = start; k <= end; k++) {
            if (leftHalf > mid)
                a[k] = temp[rightHalf++];
            else if (rightHalf > end)
                a[k] = temp[leftHalf++];
            else if (temp[rightHalf] < temp[leftHalf])
                a[k] = temp[rightHalf++];
            else
                a[k] = temp[leftHalf++];
        }
    }
}
