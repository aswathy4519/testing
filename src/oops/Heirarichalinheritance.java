package oops;
class Animal1
{
	public void animalmmehod()
	{
		System.out.println(" animal details");
	}
}
class Lion extends Animal1
{
	public void lionmethods()
	{
		System.out.println("lion details");
		}
}
class Tiger extends Animal1
{
	public void tigermethod()
	{
		System.out.println("tiger details");
	}
}

public class Heirarichalinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lion ob=new Lion();
ob.animalmmehod();
ob.lionmethods();
Tiger obj=new Tiger();
obj.animalmmehod();
obj.tigermethod();
	}

}
