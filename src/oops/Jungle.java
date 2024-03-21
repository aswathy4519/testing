package oops;
interface Basicanimal
{
	public void catmethod();
	public void sleepmethod();
}
class Monkey
{
	public void jumpmethod()
	{
		System.out.println("should jump");	}
	public void bitemethod()
	{
		System.out.println(" should bite");
	}
	
}
class Human extends Monkey implements Basicanimal
{
	public void speechmethods()
	{
		System.out.println(" should speech");
	}

	@Override
	public void catmethod() {
		// TODO Auto-generated method stub
		System.out.println(" should flexible and 4 legs");
	}

	@Override
	public void sleepmethod() {
		// TODO Auto-generated method stub
		System.out.println(" should sleep with eyes closed");
	}
	
}

public class Jungle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Human ob=new Human();
ob.bitemethod();
ob.catmethod();
ob.jumpmethod();
ob.speechmethods();
ob.sleepmethod();
	}
	

}
