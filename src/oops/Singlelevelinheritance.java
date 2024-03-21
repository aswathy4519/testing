package oops;
class parent
{
	public void parentmethod()
	{
		System.out.println("parent details");
	}
}
class child extends parent
{
	public void childmethod()
	{
		System.out.println("child details");
	}
}
public class Singlelevelinheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child ob=new child();
		ob.childmethod();
		ob.parentmethod();
		Acessmodifier ob1=new Acessmodifier();
		ob1.b=1;
		System.out.println(ob1.b);
		System.out.println(ob1.c);
		System.out.println(ob1.d);

	}

}
