package fixedSize;

class MaximumSumSubArrayOfKsize
{
    public static void main(String[] args) {
        int arr[] = new int[]{100,200,300,400};
        int len=arr.length;
        int k = 2; //window size
        //int getMaxSum = withoutSW(arr,len,k);
        int getMaxSum = withSW(arr,len,k);
        System.out.println(getMaxSum);
    }
    private static int withSW(int[] arr, int len, int k) {
        //T.C O(n) s.c. O(1)
        int i=0,j=0;
        int maxSum=0;
        int sum=0;
        while(j<len)
        {
            //calucaltion
            sum=sum+arr[j];
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                //ans
                maxSum=Math.max(maxSum, sum);
                //slide window
                sum=sum-arr[i];
                i++;
                j++;
            }
        }
        return maxSum;
    }
    public static int withoutSW(int []arr,int n,int k)
    {
        //T.C. O(n^2) s.c. O(1)
        int sum=0;
        int maxSum=0;
        for(int i=0;i<n-k+1;i++)
        {
            for(int j=i;j<i+k;j++)
            {
                sum=sum+arr[j];
            }
            maxSum = Math.max(maxSum, sum);
            sum=0;
        }        
        return maxSum;
    }
}