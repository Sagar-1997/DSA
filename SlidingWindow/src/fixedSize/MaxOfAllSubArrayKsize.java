package fixedSize;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class MaxOfAllSubArrayKsize {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k=3;
        int j=0,i=0;
        if(k>arr.length)
        {
            int maxValue =Integer.MIN_VALUE;
            for(int l=0;l<arr.length;l++)
            {
                maxValue = Math.max(maxValue, arr[l]);
            }
            System.out.println(maxValue);
        }
        else
        {
            Deque d = new ArrayDeque<>();
        List<Integer> result =  new ArrayList<>();
        while(j<arr.length)
        {
            //calculation for maximum
            while(d.size()>0 && (int)d.getLast()<arr[j])
            {
                d.removeFirst();
            }
            d.addLast(arr[j]);
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                result.add((int)d.getFirst());
                if((int)d.getFirst()==arr[i])
                {
                    d.removeFirst();
                }
                i++;
                j++;
            }
        }
        System.out.println(result);
        }
        
    }
}
