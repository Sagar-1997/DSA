public class IsArraySorted {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,1};
        boolean flag=false;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]<=arr[i])
            {
                flag=true;
            }
            else{
                flag=false;
            }
        }
        System.out.println(flag);
    }
}
