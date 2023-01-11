import java.util.ArrayList;
import java.util.List;

public class CombinationSumI {
    //find combination sum when element can be pick any number of times
    public static void main(String[] args) {
        int arr[] = new int[]{2,6,3,7};
        int target = 7;
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        getCombinationSumPair(0,arr,arr.length,ds,ansList,target);
        System.out.println(ansList);
    }

    private static void getCombinationSumPair(int i, int[] arr, int length, List<Integer> ds,
            List<List<Integer>> ansList, int target) {
                //base case
                if(i==length)
                {
                    if(target==0)
                    {
                        ansList.add(new ArrayList<>(ds));
                    }
                    return;
                }
                if(arr[i]<=target)
                {
                    //index pick multiple times
                    ds.add(arr[i]);
                    getCombinationSumPair(i, arr, length, ds, ansList, target-arr[i]);
                    ds.remove(ds.size()-1);
                }
                //index not picked
                getCombinationSumPair(i+1, arr, length, ds, ansList, target);
    }
}
