package oops;
class Animal
{
	public void animalmethod()
	{
		System.out.println("animal details");
	}
}
class Dog extends Animal
{
	public void dogmethod()
	{
		System.out.println("dog details");
	}
}
class Pug  extends Dog
{
	public void pugmethod()
	{
		System.out.println("pug details");
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pug ob=new Pug();
		ob.animalmethod();
		ob.dogmethod();
		ob.pugmethod();

	}
	

}
