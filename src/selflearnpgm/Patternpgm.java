package selflearnpgm;

public class Patternpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // 1) hollow square
		for (int i=0;i<=5;i++)
		{
			for (int j=0;j<=5;j++)
			{
				if ( i==0 ||i==5|| j==0 || j==5 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//2)  number trianglepattern/ pyramid
		for (int i=0;i<=6;i++)
		{
			for (int j=6;j>=i;j--)
			{
				System.out.print(" ");
			} 
			for (int k=0;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			  System.out.println();
		}
		// 3) right half pyramid
		for (int i=0;i<=6;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//4) number increasing reverse pyramid
		for (int i=6;i>=0;i--)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		//5) reverse pyramid
		
		for (int i=6;i>=0;i--)
		{
			for (int j=6;j>=i;j--)
			{
				System.out.print(" ");			
		   }
			for (int k=0;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}

}
