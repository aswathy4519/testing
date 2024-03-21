package controlstatements;

import java.util.Scanner;

public class Arraypract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* int[] ar=new int [3];
	//	ar[0]=12;
	//	ar[1]=13;
	//	ar[2]=14;
		Scanner sc=new Scanner (System.in);
		System.out.println(" enter numbers");
		for (int i=0;i<=2;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println(" entered numbers");
		 for (int i=0;i<3;i++)
		 {
			System.out.println(ar[i]);
		 } */
	//	String[] name=new String[4];
		Scanner sc=new Scanner(System.in);
		/*System.out.println(" enter employee names");
		for (int i=0;i<=3;i++)
		{
			name[i]=sc.next();
		}
		for (String n:name)
			
		{
			System.out.println(n);
		} */
int[][] ar=new int[3][2];
System.out.println(" enter numbers");
for (int i=0;i<=2;i++)
{
	for ( int j=0;j<=1;j++)
	{
		ar[i][j]=sc.nextInt();
	}
}
 /*for (int i=0;i<=2;i++)
{
	for ( int j=0;j<=1;j++)
	{ 
		System.out.print(ar[i][j]+" ");
	}
	System.out.println( );
	
	} */
for ( int arn[]:ar)
{
	for (int an:arn)

{
	System.out.print(an+" ");
}
	{
		System.out.println();
	}
	}
}
	}
