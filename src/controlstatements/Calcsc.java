package controlstatements;

import java.util.Scanner;

public class Calcsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter 1st value");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		 System.out.println("enter 2nd value");
		int b=sc.nextInt();
		System.out.println("enter operator=+,-,/,*");
		int c= sc.nextInt();
		switch (c)
		{
		case 'a':System.out.println(+a+b);
		break;
		case's':System.out.println(+a-b);
		break;
		case'd':System.out.println(+a/b);
		break;
		case'm':System.out.println(+a*b);
		break;
		
		}
		

	}

}
