package oops;
interface Textileshop
{
	public void materials();
}
interface Garmentshop
{
	public void fabrics();
}
class Dress implements Textileshop,Garmentshop
{

	@Override
	public void materials() {
		// TODO Auto-generated method stub
		System.out.println("all");
	}

	@Override
	public void fabrics() {
		// TODO Auto-generated method stub
		System.out.println("some");
	}
	
}

public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dress ob=new Dress();
		ob.fabrics();
		ob.materials();

	}

}
