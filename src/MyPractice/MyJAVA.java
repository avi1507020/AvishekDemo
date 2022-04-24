package MyPractice;

import java.util.Scanner;

class MyJAVA{
	public static void main(String[]args) {
		/*Scanner readme=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=readme.nextInt();
		FibSeries(number);
	}
	public static void FibSeries(int N) {
		int n1=0, n2=1;
		int sum;
		int count = 0;
		while(count<N) {
			System.out.println(n1+" ");
			sum= n1+n2;
			n1=n2;
			n2=sum;
			count++;
		}*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int n1=0,n2=1;
		int sum;
		int count=1;
		
		while(count<=n) {
			System.out.println("at "+count+" position: "+n1+" ");
			sum= n1+n2;
			n1=n2;
			n2=sum;
			count++;
		}
	}}


