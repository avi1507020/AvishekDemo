package MyPractice;

import java.util.Scanner;

public class TableOfANumber {
	public static void main(String[]args) {
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int Number=sc.nextInt();
		tableOf(Number);
		
	}
	public static void tableOf(int N) {
	int mul;
	System.out.println("Table of "+N);
		for(int i=1;i<=10;i++) {
			mul=N*i;
			System.out.println("at position "+i+" ,value is :"+mul);
		}
	}
}
