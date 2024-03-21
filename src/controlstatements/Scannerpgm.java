package controlstatements;

import java.util.Scanner;

public class Scannerpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(a); 
		/*Scanner sc=new Scanner( System.in);
		 int n=sc.nextInt();
		String name=sc.next();
		
		System.out.println("enter your age ="+n);
System.out.println(" enter your name ="+name);
long no=sc.nextLong();
System.out.println(" enter your number="+no); */
		
		System.out.println(" enter 2 digits");
	//	int a =sc.nextInt();
		int b=sc.nextInt();
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("a+b="+(a+b));

	}

}
