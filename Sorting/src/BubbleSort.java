import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        int[] arr = { 12, 90, 1, 2, 45, 0 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        // in bubble sort we compare the adjacent element and swap them if order is
        // wrong
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
