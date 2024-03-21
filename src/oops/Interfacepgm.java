package oops;
interface Bike
{
	public void accelerator();
}
interface Bikeacessories
{
	public void bikedetails();
}
class Honda implements Bike,Bikeacessories
{

	@Override
	public void bikedetails() {
		// TODO Auto-generated method stub
		System.out.println("repair setup");
	}

	@Override
	public void accelerator() {
		// TODO Auto-generated method stub
		System.out.println(" honda accelerator");
	}
	
}
class Ola implements Bike
{

	@Override
	public void accelerator() {
		// TODO Auto-generated method stub
		System.out.println(" ola acccelarator");
	}
	
}

public class Interfacepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike ob=new Honda();
ob.accelerator();
Bikeacessories ob1=new Honda();
ob1.bikedetails();
Bike ob2=new Ola();
ob2.accelerator();
	}

	
}
