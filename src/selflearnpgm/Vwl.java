package selflearnpgm;

import java.util.Scanner;

public class Vwl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String name="aswathy";
		int count=0;
		for (int i=0;i<=name.length()-1;i++)
		{
			char n=name.charAt(i);
		if ( n=='a'|| n=='e'|| n=='i'|| n=='o'|| n=='u' )
			count++;
		}
		{
			System.out.println(count);
		}  */
		
		Scanner sc=new Scanner (System.in);
System.out.println(" enter word to check vowel count");
String name=sc.nextLine();
System.out.println(name);
Vwl ob=new Vwl();
ob.vowelcount(name);

	}
public void vowelcount (String name)
{
	int count=0;
	for (int i=0;i<=name.length()-1;i++)
	{ 
		char l=name.charAt(i);
		if ( l=='a'|| l=='e'|| l=='i'|| l=='o'|| l=='u' )
			count++;
	}
	System.out.println(count);
		}
		
}
