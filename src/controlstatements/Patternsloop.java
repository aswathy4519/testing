package controlstatements;

public class Patternsloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1.square hollow
	 /*int i,j;
	for (i=1;i<=6;i++)
	{
		for (j=1;j<=6;j++)
		{
			if (i==1|| j==1 || i==6|| j==6 )
			{
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	} */
		//2.Number triangle
		
	/*	 for (int i=1;i<=6;i++)
		 {
			 for (int j=6;j>=i;j--)
			 {
				 System.out.print(" ");
			 }
			 for (int k=1;k<=i;k++)
			 {
				 System.out.print(i+" ");
				 
			 }
			 System.out.println(); */
		// } 
		//3.number increasing pyramid
	/*	for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j +" ");
			}
			{
				System.out.println();
			}
		} */
		//4.number increasing reverse pyramid pattern
		 /*for (int i=6;i>=1;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			{
				System.out.println();
			}
		} */
		//5.number changing pyramid
	/*	int k=1;
		for (int i=1;i<=6;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(k +" "); k++;
			}
			{
				System.out.println();
			}
		} */
		//5.zero-one  triangle
	/*	for (int i=1;i<=6;i++)
		{
			for (int j=1;j<=i;j++)
			{
				if ((i+j)%2==0)
				{
					System.out.print("1 ");
				}
				else {System.out.print("0 ");
				}
				
				
			}
			System.out.println();
		} */
		  for (int i=1;i<=5;i++)
		  {
			  for (int j=4;j>=i;j--)
			  {
				  System.out.print(" ");
			  }
			  for (int k=1;k<=i;k++)
			  {
				  System.out.print(k+" ");
			  }
		  
			  {
				  System.out.println();
			  }
		  } 
		for (int i=1;i<=5;i++)
		{ 	
		for (int j=4;j>=i;j--)
		{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++)
		
		
				{System.out.print("* ");
				}
				System.out.println();  
		}	
		
	}
	}


