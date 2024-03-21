package controlstatements;

import java.util.Scanner;

public class Arraytwod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
/*System.out.println("rows n colums");
int [][] table=new int[3][2];
for (int i =0;i<=2;i++)
{
for (int j=0;j<=1;j++)
{
	table[i][j]=sc.nextInt();
}
}
 /*for (int i=0;i<=2;i++)
{
for (int j=0;j<=1;j++)
	{System.out.print(table[i][j]+" ");
}
System.out.println();
}*/
/*for ( int v1 []:table)
{
	for ( int v2:v1)

	{System.out.print(v2+" ");}
	
System.out.println();} */
int [][] matrix=new int[3][2];
System.out.println("tabulted details");
for (int i=0;i<=2;i++)
{
	for (int j=0;j<=1;j++)
	{
		matrix[i][j]=sc.nextInt();
	}
	}
System.out.println("rows n colums");
for (int []n:matrix)
{
	for (int o:n)
	{
		System.out.print(o+" ");
	}
	System.out.println();
}
}
}


