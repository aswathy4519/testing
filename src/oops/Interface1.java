package oops;
interface Vegetableshop
{
	public  void rawvegetables();
}
interface Meatshop
{
	public void typesofmeats();
}
class Home implements Vegetableshop,Meatshop
{

	@Override
	public void rawvegetables() {
		// TODO Auto-generated method stub
		System.out.println(" raw fruits and vegetables available");
	}

	@Override
	public void typesofmeats() {
		// TODO Auto-generated method stub
		System.out.println(" chicken,beef,mutton,pork,duck these meast are avilable");
	}
	
}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vegetableshop ob=new Home();
ob.rawvegetables();
Home ob1=new Home();
ob1.typesofmeats();
	}

}
