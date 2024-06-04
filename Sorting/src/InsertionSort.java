import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 12, 90, 1, 2, 45, 0 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        // in this sorting algorithm in every pass we will sort till i+1
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break; // array part is already sorted
                }
            }
        }
    }
}
