package controlstatements;

import java.util.Scanner;

public class Arraysingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[] ar = new int[4];
		Scanner sc= new Scanner(System.in);
	/*	System.out.println ("enter digits");
		for (int i=0;i<=3;i++)
		{
			ar[i]=sc.nextInt();
		}
			
		System.out.println ("entered digits");
		for (int i=0;i<=3;i++)
		{
			System.out.println(ar[i]);
		} */
int [] a=new int[5];
System.out.println(" enter your digits");
for (int i=0;i<=4;i++)
{
	a[i]=sc.nextInt();
}
for (int b:a)
{
	System.out.println(b);
}
	}

}
