import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 12, 90, 1, 2, 45, 0 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        // in selection sort in every pass we find max. or min value and put it to its
        // right position
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int last = n - i - 1;
            int maxIndex = getMaxIndex(arr, last);
            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    public static int getMaxIndex(int[] arr, int last) {
        int maxIndex = -1;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i <= last; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
