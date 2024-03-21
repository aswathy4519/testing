package controlstatements;

import java.util.Scanner;

public class Marray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] [] ar = new int[3][2];
		System.out.println("enter numbers");
		for (int i=0;i<=2;i++)
		{
			for (int j=0;j<=1;j++)
			{
				ar [i][j]=sc.nextInt();
			}
		}
/*for  (int i=0;i<=2;i++)
{
	for ( int j=0;j<=1;j++)
		{System.out.print(ar [i][j]+" ");}
	System.out.println();
}*/
		System.out.println ("entered digits");
		for (int v1 []:ar)
		{
			for (int v2:v1)
		
			{System.out.print(v2+" ");}
			System.out.println();
		}
			
	}

}
