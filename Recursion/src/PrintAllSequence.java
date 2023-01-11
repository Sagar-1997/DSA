import java.util.ArrayList;
import java.util.List;

public class PrintAllSequence
{
    public static void getAllSequence(int index,int[]arr,List<Integer> ds,List<List<Integer>> ans,int n)
    {
        //base case
        if(index==n)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        //element pick
        ds.add(arr[index]);
        getAllSequence(index+1, arr, ds, ans, n);
        //element not pick
        ds.remove(ds.size()-1);
        getAllSequence(index+1, arr, ds, ans, n);
    }
    public static void main(String[] args) {
        int []arr=new int[]{3,2,6};
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        getAllSequence(0, arr, ds, ansList, arr.length);
        System.out.println(ansList);   
        //Time Complexbility - O(n*2^n)
        //Space Complebility - O(n) //stack space use for recursion
    }
}