import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = new int[]{3,5,4,9,0};
        //reverseArrayWithLoop(arr);
        reverseArrayWithRecursion(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }
    public static void reverseArrayWithLoop(int arr[])
    {
        int len=arr.length;
        for(int i=0;i<len/2;i++) //time O(n) time O(1)
        {
            int temp=arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=temp;
        }
    }
    public static void reverseArrayWithRecursion(int arr[],int start,int end)
    {
        if(start>end)
        {
            return;               //time O(n)
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArrayWithRecursion(arr, start+1, end-1);
    }
}
