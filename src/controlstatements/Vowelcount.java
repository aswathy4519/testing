package controlstatements;

import java.util.Scanner;

public class Vowelcount {

	 public static void main(String[] args) {
  /*String name="aswathy";
int count =0;
for (int i=0;i<=name.length()-1;i++)
{
	char l=name.charAt(i);
	if (l=='a'||l=='e'||l=='i'||l=='o'||l=='u' )
		count++;
}
System.out.println("vowel in aswathy="+count);  */ 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter your name");
		 String s=sc.next();
		 Vowelcount ob=new Vowelcount();
		 ob.vowelpgm(s);
		 
		 

}

	 public void vowelpgm(String s)
	 
	 
	 {
		
	 int count =0;
	 for (int i=0;i<s.length();i++)
	 {
	 	char l=s.charAt(i);
	 	if (l=='a'||l=='e'||l=='i'||l=='o'||l=='u' )
	 		count++;
	 }
	 System.out.println("vowel in aswathy="+count); 
	 
	 } 
	 
}