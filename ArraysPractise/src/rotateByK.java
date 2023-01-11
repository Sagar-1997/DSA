import java.util.Scanner;

public class rotateByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]=new int[]{1,2,3,4,5,6};
        int a[]=new int[k];
        int i=0;
        while(i<k)
        {
            a[i]=arr[arr.length-1-i];
            i++;
        }
        for(i=arr.length-k-1;i>=0;i--)
        {
            arr[i+k]=arr[i];
        }
        for(i=0;i<k;i++)
        {
            arr[i]=a[a.length-1-i];
        }
        for( i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
