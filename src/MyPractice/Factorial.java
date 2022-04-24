package MyPractice;

import java.util.Scanner;

public class Factorial {
	public static void main(String[]args) {
		System.out.println("Enter a number to find the factorial");
		Scanner sc=new Scanner(System.in);
		int Number=sc.nextInt();
		factorialNumber(Number);
		
	}
	public static void factorialNumber(int N) {
		int fact=1;
		for(int i=N;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("factorial of "+N+" is "+fact);
	}

}
