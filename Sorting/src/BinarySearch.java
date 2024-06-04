
public class BinarySearch {
    public static void main(String[] args) {
        //work on sorted array
        int []arr = new int[]{5,9,17,23,25,45,59,63,71,89};
        int data = 59;
        //int searchIndex = binarySearchIteration(arr,0,arr.length-1,data);
        int searchIndex =  binarySearchRecursive(arr,0,arr.length-1,data);
        if(searchIndex==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index : "+searchIndex);
    }

    private static int binarySearchRecursive(int[] arr, int i, int j, int data) {
        // worst case : O(logn) //every time search space is divided into half
        //best case : O(1) //elemet at mid in start
        //SC : O(log n) stack space for function
        if(i<=j)
        {
            int mid=(i+j)/2;
            if(arr[mid]==data)
                return mid;
            else if(arr[mid]<data)
                return binarySearchRecursive(arr, mid+1, j, data);
            else
                return binarySearchRecursive(arr, i, mid-1, data);
        }
        return -1;
    }

    private static int binarySearchIteration(int[] arr, int i, int j,int data) {
         // worst case : O(logn) //every time search space is divided into half
        //best case : O(1) //elemet at mid in start
        while(i<=j)
        {
            int mid = (i+j)/2;
            if(arr[mid]==data)
            {
                return mid;
            }
            else if(arr[mid]<data)
            {
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return -1;
    }
}

