package selflearnpgm;

import java.util.Scanner;

public class Vowelpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println(" enter a word to count vowels");
String vowel=sc.next();System.out.println(vowel);
Vowelpgm ob=new Vowelpgm();
ob.vowelcount(vowel);
	}
 public void vowelcount (String vowel)
 {
int count=0;
for (int i=0;i<=vowel.length()-1;i++)
{
	char n=vowel.charAt(i);
	if (n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
			count++;
}
System.out.println(count);
 
	}

}
