import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        Arrays.fill(arr, 0);
        Arrays.stream(arr).forEach(System.out::println);
    }
   
}
