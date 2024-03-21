package controlstatements;

public class Patternsprob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
	/*	for (int i=4;i>=1;i--)
		{ 
			for (int j=4;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();}  */
		
	/*	for (int i=1;i<=4;i++)
		{
			for (int j=1;j<=4;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		} */
  /*  int f=1;
    
		for ( int i=1;i<=5;i++)
		{	 f=(i*f);	
		
			System.out.println(f);
		
		}
		{
			System.out.println("factorial of 5="+f);
		} */
		
}
}