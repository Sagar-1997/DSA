package VariableSize;

public class LargestSubArraySumK {
    public static void main(String[] args) {
        int []arr = new int[]{4,1,1,1,2,3,5};
        int ksum = 5;
        int sum = 0;
        int maxSum =Integer.MIN_VALUE;
        int len =arr.length;
        int i=0,j=0;
        while(j<len)
        {
            //calculation
            sum += arr[j];
            if(sum<ksum)
            {
                j++;
            }
            else if(sum==ksum)
            {
                maxSum = Math.max(maxSum, j-i+1);
                j++;
            }
            else if(sum>ksum)
            {
                while(sum>ksum)
                {
                    sum = sum - arr[i];
                    i++;
                }
                j++;
            }
        }
        System.out.println(maxSum);
    }
}
