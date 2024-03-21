package selflearnpgm;

import java.util.Scanner;

public class Vowelswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println(" enter a letter");
char a=sc.next().charAt(0);
boolean isvowel=false;
switch(a)
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
	isvowel =true;
default:System.out.println(" enter only characters");
}
if (isvowel)
{System.out.println(a+"is a vowel");}
else
{
System.out.println(a+" not a vowel")	;
}
	}

}
