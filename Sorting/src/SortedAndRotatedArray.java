public class SortedAndRotatedArray {
    public static void main(String[] args) {
        int nums[] = new int[]{1,3};
        int l=nums.length-1,s=0;
        int target=1;
        int mid = (l+s)/2;
        if(nums.length==1)
        {
            if(nums[l]==target)
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(-1);
            }
        }
        if(nums[mid]>=nums[0])
        {
            if(nums[mid-1]>=target && nums[0]<=target)
            {
                l=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        else
        {
            if(nums[mid+1]<=target && nums[nums.length-1]>=target)
            {
                l=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        System.out.println(binarySearch(nums,s,l,target));
        
    }
    static int binarySearch(int[] arr,int s,int e,int x)
    {
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]==x)
                return mid;
            else if(arr[mid]>x)
                e=mid-1;
            else
                s=mid+1;
        }
        return -1;
    }
}
