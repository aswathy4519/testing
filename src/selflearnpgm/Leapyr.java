package selflearnpgm;

import java.util.Scanner;

public class Leapyr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a year what you want to check");
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	System.out.println(year);
		if ((year%4==0 )&& (year%100!=0)||((year%4==0) && (year%100==0) &&(year%400==0)))
		{
			System.out.println(year+"is leap year");
		}
		else
		{
			System.out.println(year+"is not leap year");
			
		}

	}

}
