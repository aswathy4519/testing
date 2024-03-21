package controlstatements;

import java.util.Scanner;

public class Arraystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*String [] label=new String[4];
		System.out.println("name of students");
		for ( int i=0;i<=3;i++)
		{
			label[i]=sc.next();
		}
		for ( String file:label)
		{
			System.out.println(file);
		} */
		String[] stname=new String[4];
		System.out.println("name of students");
		for (int i=0;i<=3;i++)
		{
			stname[i]=sc.nextLine();
		}
		for (String n:stname)
		{
			System.out.println(n);
		}
	}

}
