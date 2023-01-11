public class moveallzerolast {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,0,1,0,4,0};
        int k=0;
        while(k<arr.length)
        {
            if(arr[k]==0)
            {
                break;
            }
            else
            {
                k++;
            }
        }
        int i=k,j=k+1;
        while(i<arr.length && j<arr.length)
        {
            if(arr[j]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
    }
}
