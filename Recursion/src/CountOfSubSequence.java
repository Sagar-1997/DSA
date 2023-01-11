import java.util.ArrayList;
import java.util.List;

public class CountOfSubSequence {

    //Count if subsequence which satisfy some condition
    public static void main(String[] args) {
        int []arr=new int[]{1,2,1};
        List<Integer> ds = new ArrayList<>();
        int target =2;
        int count = getAllSequenceSumK(0, arr, ds, arr.length,target);
        System.out.println(count);
        //TC - O(2^n * n)
        //SC - O(n)
    }

    private static int getAllSequenceSumK(int i, int[] arr, List<Integer> ds, int length, int target) {
        
        //base case 
        if(i==length)
        {
            int sum=0;
            for(int j=0;j<ds.size();j++)
            {
                sum +=ds.get(j);
            }
            if(sum==target)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        //pick
        ds.add(arr[i]);
        int leftCount = getAllSequenceSumK(i+1, arr, ds, length, target);
        ds.remove(ds.size()-1);
        int rightCount = getAllSequenceSumK(i+1, arr, ds, length, target);
        return leftCount+rightCount;
    }
}
