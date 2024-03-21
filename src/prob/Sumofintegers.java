package prob;

import java.util.Scanner;

public class Sumofintegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter a integer");
	int n=sc.nextInt();
	System.out.println(n);
		Sumofintegers ob=new Sumofintegers();
		ob.Sum(n);
	}
	public void Sum(int n)
	{
    	int sum=0;
		while (n>0)
		{int rev=n%10;
		sum=sum+rev;
		n=n/10;		
		}
		System.out.println(sum);
		
	}

}
