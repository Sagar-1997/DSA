import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("The size for array : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>Largest)
            {
                Largest=arr[i];
            }
        }
        System.out.println("Largest value is : "+Largest);
    }
}
