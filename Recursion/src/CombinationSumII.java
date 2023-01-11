import java.util.ArrayList;
import java.util.List;

public class CombinationSumII {
    //array is sorted if not make it sorted and one element will be taken one time
    public static void main(String[] args) {
        int arr[] = new int[]{1,1,1,2,2};
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int target = 6;
        getCombinationSum(0,arr,arr.length,target,ds,ansList);
        System.out.println(ansList);
    }

    private static void getCombinationSum(int i, int[] arr, int length, int target, List<Integer> ds,
            List<List<Integer>> ansList) {
                //base case
                if(target==0)
                {
                    ansList.add(new ArrayList<>(ds));
                    return;
                }
                for(int j=i;j<length;j++)
                {
                    if(j>i && arr[j]==arr[j-1])
                        continue;
                    if(arr[i]>target)
                        break;
                    ds.add(arr[i]);
                    getCombinationSum(i+1, arr, length, target-arr[i], ds, ansList);
                    ds.remove(ds.size()-1);
                }
    }
}
