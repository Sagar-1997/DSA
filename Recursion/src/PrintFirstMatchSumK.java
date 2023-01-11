import java.util.*;

public class PrintFirstMatchSumK {
    public static void main(String[] args) {
        int []arr=new int[]{1,2,1};
        List<Integer> ds = new ArrayList<>();
        int target =2;
        Boolean found = getAllSequenceSumKfirst(0, arr, ds, arr.length,target);
        if(found)
        {
            System.out.println("Sub Sequence is found ");
        }
        else
            System.out.println("Sub Sequence is not found");

         //TC - O(2^n)
        //SC - O(n)
    }

    private static boolean getAllSequenceSumKfirst(int i, int[] arr, List<Integer> ds, int length, int target) {
       //base case
       if(length==i)
       {
           int sum=0;
           for(int j=0;j<ds.size();j++)
           {
               sum += ds.get(j);
           }
           if(sum==target)
           {
               System.out.println(ds);
               return true;
           }
           else
           {
               return false;
           }
       }
       ds.add(arr[i]);
       if(getAllSequenceSumKfirst(i+1, arr, ds, length, target))
       {
           return true;
       }
       ds.remove(ds.size()-1);
       if(getAllSequenceSumKfirst(i+1, arr, ds, length, target))
            return true;
        
       return false;
    }
}
