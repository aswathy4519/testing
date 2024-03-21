package controlstatements;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*int age = 18, weight = 40;
if( age>=18)
{
	if( weight>=50)
	{System.out.println(" can donate blood");}
	else
	{System.out.println("cannot donate blood");}
}
else 
	{System.out.println("age should greater than 18");} */

	int age=15,power=20;
	if (age>=18)
	{
		if (power==20)
		{
			System.out.println("eligible for license");
		}
		else
		{
			System.out.println("not eligible for license");
		}
	}
	else
	{
		System.out.println("age should equals or greater than 18");
	}

}
}