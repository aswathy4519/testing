package selflearnpgm;

import java.util.Scanner;

public class Vwlswch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner (System.in);
System.out.println(" enter a letter");
char n=sc.next().charAt(0);
System.out.println(n);
boolean isvowel=false;
switch (n)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
	isvowel=true;
	break;
 default:System.out.println("eneter only letters");	
}
if (isvowel)
{
	System.out.println(n+" is vowel");
}
else
{
	System.out.println(n+"not a vowel");
}
	}

}
