package PatternPractice;

import java.util.Scanner;

public class hollowInvertedHalfPyramid {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n = sc.nextInt();
	for(int i=0;i<n;i++)
	{
		System.out.print("* ");
	}
	System.out.println();
	printhollowHalfPyr(n-1);
}

private static void printhollowHalfPyr(int n) {
	if(n==0)
		return;
	printStarsandSpace(n);
	System.out.println();
	printhollowHalfPyr(n-1);
}

private static void printStarsandSpace(int n) {
	for(int i=0;i<n;i++)
	{
		if(i==0 || i==n-1)
		{
			System.out.print("* ");
		}
		else
		{
			System.out.print("  ");
		}
	}
}
}
