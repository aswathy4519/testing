package selflearnpgm;

import java.util.Scanner;

public class Arraypg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
// int [] id=new int[4];
 /* id[0]=1;
 id[1]=2;
 id[2]=3;
 id[3]=4;
 System.out.println(id[1]);*/
 
 /* System.out.println("enter student names");
String[] name=new String[4];

for (int i=0;i<=3;i++)
{
	name[i]=sc.nextLine();
}
for (String name1:name)
{
	System.out.println(name1);
} */
		
		int[][] id=new int[3][2];
		System.out.println("give  id's");
		for (int i=0;i<=2;i++)
		{
		for (int j=0;j<=1;j++)
		{
		id[i][j]=sc.nextInt();
		}
		}
		 /* for (int i=0;i<=2;i++)
		{
			for (int j=0;j<=1;j++)
			{
				System.out.print(id[i][j]+" ");
			}
		
			System.out.println();
		} -----OR----- */
	 for (int[] id1:id)
	 {
		 for (int id2:id1)
		 {
			 System.out.print(id2+" ");
		 }
		 System.out.println();
	 }
	
		
	}

}
