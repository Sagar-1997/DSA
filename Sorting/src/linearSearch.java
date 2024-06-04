class linearSearch{
    public static void main(String[] args) {
        //Worst TC = o(n)  element at last of index or not present
        //Best TC = o(1) element present at first index
        //Average TC=o(n) based upon average of all cases/no. of elements
        int []arr= new int[]{15,5,20,35,2,42,67,17};
        int dataSearch = 42;
        int n=arr.length;
        int i;
        for(i=0;i<n;i++)
        {
            if(arr[i]==dataSearch)
            {
                 System.out.println("Element found at index : "+i);
                 break;
            }
        }
        if(i==n)
        {
            System.out.println("Element not found ");
        }
    }
}