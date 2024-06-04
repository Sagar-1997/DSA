package PatternPractice;

import java.util.Scanner;

public class fullPyramid {
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	printFullPyramid(n,n);
}

private static void printFullPyramid(int n,int temp) {
	if(n==0)
		return;
	printFullPyramid(n-1,temp);
	System.out.println();
	printSpace(temp-n);
	printStar(n);
}

private static void printSpace(int space) {
	if(space==0)
		return;
	printSpace(space-1);
	System.out.print(" ");
}
private static void printStar(int star)
{
	if(star==0)
		return;
	printStar(star-1);
	System.out.print(" * ");
}
}
