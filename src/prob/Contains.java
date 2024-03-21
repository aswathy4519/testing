package prob;

import java.util.Scanner;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println(" eneter a sentence");
String a=sc.nextLine();
System.out.println(a);
String b="language";
if (a.contains(b))
{
	System.out.println("String conatins word language");
}
else
{
	System.out.println(" String doesnt have word language");
}
	}

}
