package PatternPractice;
import java.util.Scanner;
import java.lang.*;
public class HalfPyramidPattern {
	
	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPattern(n);
	}

	private static void printPattern(int n) {
		if(n==0)
		{
			return;
		}
		printPattern(n-1);
		printStars(n);
		System.out.println();
	}

	private static void printStars(int n) {
		if(n==0)
			return;
		printStars(n-1);
		System.out.print("* ");
	}

}
