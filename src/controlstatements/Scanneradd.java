package controlstatements;

import java.util.Scanner;

public class Scanneradd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter a  2 number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();

System.out.println("add value of a="+a);
System.out.println("add value of b="+b);
int c=a+b;
System.out.println("a+b="+c);

	}

}
