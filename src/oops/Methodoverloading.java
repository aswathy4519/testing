package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading ob=new Methodoverloading();
		ob.add(20, 1.4);

	}
public void add(int a,int b)
 {
	int c=a+b;
System.out.println(c);
}
public void add(int a,double b)
{
	double c=a+b;

	System.out.println(c);
}
public void add(double a,int b)
{
	double c=a+b;

	System.out.println(c);
}
}