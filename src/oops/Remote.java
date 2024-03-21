package oops;
interface TVremote
{
	public void keypad();
}
interface Smarttvremote extends TVremote
{
	public void connection();
}
class TV implements Smarttvremote
{

	@Override
	public void keypad() {
		// TODO Auto-generated method stub
		System.out.println(" should available all basic keypads.");}

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println(" should connect to tv and allow smooth connection");
	}
	
}


public class Remote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TV ob=new TV();
ob.connection();
ob.keypad();
	}

}
