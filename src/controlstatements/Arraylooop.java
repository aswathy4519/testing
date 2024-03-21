package controlstatements;

import java.util.Scanner;

public class Arraylooop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[4];
		Scanner sc= new Scanner(System.in);
		System.out.println ("enter digits");
		for (int i=0;i<=3;i++)
		{
			ar[i]=sc.nextInt();
		}
			
		System.out.println ("entered digits");
		for (int v:ar)
		{
			System.out.println(v);
			
		}
	}

}
