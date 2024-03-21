package controlstatements;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter your name");
		String name=sc.next();
		
Vowel ob=new Vowel();
ob.count(name);


	}
public void count(String name)
{
    int count =0;
	for (int i=0;i<=name.length()-1;i++)
	{ char n=name.charAt(i);  
	if ( n=='a'|| n=='e'|| n=='i'||n=='o' ||n=='u')
		count++;
	}
	
	
	System.out.println(" vowel count ="+count);
		
}
}
