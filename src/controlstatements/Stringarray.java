package controlstatements;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] ar=new String[3];
Scanner sc= new Scanner(System.in);
System.out.println("enter characters");
for  (int i=0;i<=2;i++)
{
	ar[i]=sc.next();
}
System.out.println("enter characters");
for  (int i=0;i<=2;i++)
{
	System.out.println(ar[i]);
}
	}

}
