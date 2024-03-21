package oops;
class Book
{
	public void pages()
	{
	System.out.println(" no of pages ");}
}
class Classmate extends Book
{

	@Override
	public void pages() {
System.out.println(" page count =120");
		super.pages();
	}
	
}

public class Bookoverride {

	public static void main(String[] args) {
Classmate ob=new Classmate();
ob.pages();
Book ob1=new Classmate();
ob1.pages();


	}

}
