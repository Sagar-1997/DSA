package PatternPractice;

import java.util.Scanner;

public class InvertedHalfPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n =sc.nextInt();
		printInvertedHalfPryramid(n);
	}

	private static void printInvertedHalfPryramid(int n) {
		if(n==0)
			return;
		printStar(n);
		System.out.println();
		printInvertedHalfPryramid(n-1);
	}

	private static void printStar(int n) {
		if(n==0)
			return;
		printStar(n-1);
		System.out.print("* ");
	}
}
