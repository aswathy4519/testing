package selflearnpgm;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println(" enter a year");
		int year;
		year=sc.nextInt();
		System.out.println(year);
		
		/*if ((year%4==0) && (year%100!=0) || (year%4==0) && (year%100==0)&& (year%400==0))
{
		System.out.println(" leapyear");
}
		else 
		{
			System.out.println("not leapyear");
		} */
		
		if  (year%4==0)
		{
			if (year%100==0)
		{
			if (year%400==0)
			{
				System.out.println(year+" is a leap year");
			}
			else
			{
				System.out.println(year+" is  not a leap year");
			}
		}
			else 
			{
				System.out.println(year+" is a leap year");
			}
		}
		else {
			System.out.println(year+" is not a leap year");
		}
		}
}


