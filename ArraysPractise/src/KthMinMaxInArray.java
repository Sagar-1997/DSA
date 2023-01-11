import java.util.Arrays;
import java.util.Scanner;


public class KthMinMaxInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[]{7,10,4,3,20,15};
        System.out.println("Enter the kth value less then size of array");
        int k = sc.nextInt();
        mergeSort(arr,0,arr.length-1);
        System.out.print("Smallest kth element : "+arr[k-1]);
        System.out.print("Largest kth element : "+arr[arr.length-k]);
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low<high)
        {
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,high,mid);
        }
    }

    private static void merge(int[] arr, int low, int high, int mid) {
        int result[] = new int[arr.length];
        int i= low;
        int j= mid+1;
        int k=low;
        while(i<=mid && j<=high)
        {
            if(arr[i]<arr[j])
            {
                result[k]=arr[i];
                i++;
            }
            else
            {
                result[k]=arr[j];
                j++;
            }
            k++;
        }
        if(i>mid)
        {
            while(j<=high)
            {
                result[k]=arr[j];
                j++;
                k++;
            }
        }
        else
        {
            while(i<=mid)
            {
                result[k]=arr[i];
                i++;
                k++;
            }
        }
        for(int p=low;p<=high;p++)
        {
            arr[p]=result[p];
        }
    }
    
}
