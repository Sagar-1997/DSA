import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class secondLargeandSecondSmall {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,4,7,7,5};
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        int secSmall=Integer.MAX_VALUE;
        int largeSmall=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            small=Math.min(small, arr[i]);
            large=Math.max(large, arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<secSmall && arr[i]!=small)
            {
                secSmall=arr[i];
            }
            if(arr[i]>largeSmall && arr[i]!=large)
            {
                largeSmall=arr[i];
            }
        }
        System.out.println(secSmall+"       "+largeSmall);
    }
}
