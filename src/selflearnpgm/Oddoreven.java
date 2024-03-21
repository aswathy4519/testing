package selflearnpgm;

import java.util.Scanner;

public class Oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
/*System.out.println(" enter a number");
int a=sc.nextInt();
if ((a%2)==0)
{
	System.out.println( a+"is a even number");	
}
else
{
	System.out.println(a+"is odd");
} */
 int [] num=new int[3];
 System.out.println(" enter 3 number");
 for (int i=0;i<=num.length-1;i++)
 {
	 num[i]=sc.nextInt();
 }
 for (int i=0;i<=num.length-1;i++)
 {
	 
 if (num[i]%2==0)
 {
	System.out.println("even"); 
 }
 else
 {
	 System.out.println("odd");
 }
	}
	}
}
