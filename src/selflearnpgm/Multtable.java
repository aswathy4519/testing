package selflearnpgm;

import java.util.Scanner;

public class Multtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println(" enter a digit for getting multiplication table of your choice");
int a=sc.nextInt();
System.out.println(a);
System.out.println("Multiplication table of"+a+":");
for
( int i=1;i<=10;i++)
{
	System.out.println(i+"*"+a+"="+(i*a));
}
	}

}
