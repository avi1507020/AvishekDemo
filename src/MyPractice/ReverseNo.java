package MyPractice;

import java.util.Scanner;

public class ReverseNo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int reverse=0;
		System.out.println("Enter a number to reverse ");
		int number=sc.nextInt();
		int numberStore=number;
		while(number!=0) {
			int remainder=number%10;
			reverse = (reverse*10)+remainder;
			number=number/10;
		}
		System.out.println("the reverse number of the number "+numberStore+" is :"+reverse);
	}

}
