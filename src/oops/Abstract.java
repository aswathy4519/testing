package oops;
abstract class Car
{
	abstract void speedlimit();
	public void cardetails()
	{
		System.out.println("car details =");}
}
class Maruti extends Car
{

	@Override
	void speedlimit() {
		// TODO Auto-generated method stub
		System.out.println("maruti speedlimit");	
		}
	
}
class Kia extends Car
{

	@Override
	void speedlimit() {
		// TODO Auto-generated method stub
		System.out.println("kia speed limit");
	}
	
}



public class Abstract {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruti ob=new Maruti();
		ob.speedlimit();
		ob.cardetails();
		Kia ob1=new Kia();
		ob1.speedlimit();
		ob1.cardetails();

	}

}


