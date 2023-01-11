import java.util.ArrayList;
import java.util.List;

public class PrintAllSubSequenceSumK {
    //print all subsequnce whose sum equals to target
    public static void main(String[] args) {
        int []arr=new int[]{1,2,1};
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int target =2;
        getAllSequenceSumK(0, arr, ds, ansList, arr.length,target);
        System.out.println(ansList); 
        //TC - O(2^n * n)
        //SC - O(n)
    }

    private static void getAllSequenceSumK(int i, int[] arr, List<Integer> ds, List<List<Integer>> ansList, int length,
            int target) {
                //base case
                if(i==length)
                {
                    int sum =0;
                    for(int j=0;j<ds.size();j++)
                    {
                        sum += ds.get(j);
                    }
                    if(sum==target)
                    {
                        ansList.add(new ArrayList<>(ds));
                    }
                    return;
                }
                //pick
                ds.add(arr[i]);
                getAllSequenceSumK(i+1,arr,ds,ansList,length,target);
                //not pick
                ds.remove(ds.size()-1);
                getAllSequenceSumK(i+1, arr, ds, ansList, length, target);
    }
}
