package oops;
abstract class Hospital
{
	abstract void departments ();
	public void casuality() 
	{
		System.out.println(" 24/7 available with duty doctors");
	}
	
}
class Renaimedicity extends Hospital
{

	@Override
	void departments() {
		// TODO Auto-generated method stub
		System.out.println(" All departments are functioning");
	}
	
}
class Rajagiri extends Hospital
{

	@Override
	void departments() {
		// TODO Auto-generated method stub
		System.out.println("basics to multispeciality");
	}
	
}

public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hospital ob=new Renaimedicity();
ob.casuality();
ob.departments();
Rajagiri ob1=new Rajagiri();
ob1.casuality();
ob1.departments();
	}
	

}
